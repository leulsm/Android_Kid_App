package com.leul.kidabc;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class login extends AppCompatActivity {
    EditText name_field,password_field;
    Button login;
    DatabaseHelper DB;
    TextView textlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(login.this,R.color.new_color1));

        name_field=findViewById(R.id.reg_name);
        password_field=findViewById(R.id.reg_password);
        login=findViewById(R.id.reg_signup);
        textlink=findViewById(R.id.text_link);

        DB=new DatabaseHelper(this);
        textlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=name_field.getText().toString();
                String pass=password_field.getText().toString();
                
                if(TextUtils.isEmpty(user)||TextUtils.isEmpty(pass))
                    Toast.makeText(login.this, "All field required", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=DB.checkkidsnamepassword(user,pass);
                            if(checkuserpass==true){

                                Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),home.class);
                                intent.putExtra("name",user);
                                startActivity(intent);
                            }else{
                                Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                            }
                }
            }
        });
    }
    public void next(){
        Intent intent=new Intent(getApplicationContext(),reg.class);
        startActivity(intent);
    }
}