package com.leul.kidabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
// PROFILE PAGE
public class profileactiv extends AppCompatActivity {
Button b1,b2,btn_about;
TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));

        setContentView(R.layout.activity_profileactiv);
        tv=findViewById(R.id.nameone);
        tv1=findViewById(R.id.highscoreone);

        b1=findViewById(R.id.back);
        b2=findViewById(R.id.logout);
        btn_about=findViewById(R.id.about);
        String p=getIntent().getStringExtra("name");
        String g=p;
        tv.setText(g);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });
        //LOGOUT BUTTON
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profileactiv.this, "Log out successfully", Toast.LENGTH_SHORT).show();
           Intent intent=new Intent(getApplicationContext(),login.class);
           startActivity(intent);
            }
        });
// ABOUT DEVELOPERS ACTIVITY
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intetn=new Intent(getApplicationContext(),us.class);
                startActivity(intetn);
            }
        });
    }
}