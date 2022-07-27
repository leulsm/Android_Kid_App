package com.leul.kidabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class profileactiv extends AppCompatActivity {
Button b1,b2;
TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileactiv);
        tv=findViewById(R.id.nameone);
        tv1=findViewById(R.id.highscoreone);

        b1=findViewById(R.id.back);
        b2=findViewById(R.id.logout);
String p=getIntent().getStringExtra("name");
        tv.setText(p);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profileactiv.this, "Log out successfully", Toast.LENGTH_SHORT).show();
           Intent intent=new Intent(getApplicationContext(),login.class);
           startActivity(intent);
            }
        });
    }
}