package com.leul.kidabc;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;
// HOME ACTIVITY
public class home extends AppCompatActivity {
    private long backpressedtime;
    ImageButton learn,write,quiza,music;
    Button profile;
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
        profile=findViewById(R.id.profilekid);
        String n=getIntent().getStringExtra("name");
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.ttttttttt);

// IMAGEBUTTON FOR WRITING PORTION
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),drawalpha.class);
                startActivity(intent);
            }
        });
// IMAGEBUTTON OFR PLAYING PHPONIC MUSICS
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),musics.class);
                startActivity(intent);
            }
        });
// IMAGEBUTTON FOR QUIZ PART
        quiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),Quizmain.class);
                  startActivity(intent);
            }
        });
// IMAGE BUTTON FOR ALPHABET ORDERS
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent intent=new Intent(getApplicationContext(),alpha.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),profileactiv.class);
                in.putExtra("name",n);
                startActivity(in);
            }
        });

    }

//    @Override
//    public void onBackPressed() {
//        if (backpressedtime + 2000 > System.currentTimeMillis()){
//            finish();
//        }else{
//            Toast.makeText(this, "press back again to finish ", Toast.LENGTH_SHORT).show();
//        }
//        backpressedtime=System.currentTimeMillis();
//    }
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
            startActivity(intent);
            finish();
            System.exit(0);
             // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
                    startActivity(intent);
                    finish();
                    System.exit(0);
                }
            }, 3 * 1000);

        }

    }
}