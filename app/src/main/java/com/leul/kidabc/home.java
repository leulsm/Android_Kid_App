package com.leul.kidabc;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class home extends AppCompatActivity {
    private long backpressedtime;
    ImageButton learn,write,quiz,music,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));
        learn=findViewById(R.id.btn_learn);
        write=findViewById(R.id.btn_write);
        music=findViewById(R.id.btn_music);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),drawalpha.class);
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(getApplicationContext(),musiclisten.class);
             //   startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (backpressedtime + 2000 > System.currentTimeMillis()){
            finish();
        }else{
            Toast.makeText(this, "press back again to finish ", Toast.LENGTH_SHORT).show();
        }
        backpressedtime=System.currentTimeMillis();
    }
}