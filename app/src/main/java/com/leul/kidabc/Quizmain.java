package com.leul.kidabc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Quizmain extends AppCompatActivity {
    private static final int REQUEST_CODE_QUIZ=1;

    public static final String SHARED_PREFS="sharedprefs";
    public static final String KEY_HIGHSCORE="keyhighscore";

    private TextView textviewhighscore;

    private int highscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmain);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));

        Button buttonstartquiz=findViewById(R.id.start_button);
        Button buttonexit=findViewById(R.id.exit_btn);

        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });


        loadhighscore();


        buttonstartquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuiz();
            }
        });
    };
    private void startQuiz(){
        Intent intent=new Intent(Quizmain.this,quizActivity.class);
        startActivityForResult(intent,REQUEST_CODE_QUIZ); // Helps to get a result back
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==REQUEST_CODE_QUIZ){
            if (resultCode==RESULT_OK){
                int score=data.getIntExtra(quizActivity.EXTRA_SCORE,0);
                if (score>highscore){
                    updateHighscore(score);
                }
            }
        }
    }
    private void loadhighscore(){
        SharedPreferences prefs=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        highscore=prefs.getInt(KEY_HIGHSCORE,0);
        textviewhighscore.setText("Highscore: "+ highscore);

    }
    private void updateHighscore(int hghscorenew){
        highscore=hghscorenew;
        textviewhighscore.setText("Highscore: "+ highscore);

        SharedPreferences prefs=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();
        editor.putInt(KEY_HIGHSCORE,highscore);
        editor.apply();
    }
}