package com.leul.kidabc;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class home extends AppCompatActivity {
    private long backpressedtime;
    ImageButton learn,write,quiza,music,profile;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));
        learn=findViewById(R.id.btn_learn);
        write=findViewById(R.id.btn_write);
        music=findViewById(R.id.btn_music);
        quiza=findViewById(R.id.btn_quiz);
//        profile=findViewById(R.id.profilekid);

        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.ttttttttt);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),drawalpha.class);
                startActivity(intent);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),musics.class);
                startActivity(intent);
            }
        });
        quiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),Quizmain.class);
                  startActivity(intent);
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