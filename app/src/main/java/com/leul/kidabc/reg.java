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
// ACTIVITY OF REJISSTRATION
public class reg extends AppCompatActivity {

    EditText name_field,password_field,cpassword_field;
    Button signup;
    TextView textlink;
    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        getSupportActionBar().hide();

        name_field=findViewById(R.id.reg_name);
        password_field=findViewById(R.id.reg_password);
        cpassword_field=findViewById(R.id.reg_cpassword);
        signup=findViewById(R.id.reg_signup);
        textlink=findViewById(R.id.text_link);
        DB=new DatabaseHelper(this);


        textlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=name_field.getText().toString();
                String pass=password_field.getText().toString();
                String cpass=cpassword_field.getText().toString();

                if(TextUtils.isEmpty(user)|| TextUtils.isEmpty(pass)){
                    Toast.makeText(reg.this, "All fields Required", Toast.LENGTH_SHORT).show();
                }else{
                    if(pass.equals(cpass)) {
                        Boolean checkuser = DB.checkkidsname(user);
                        if (checkuser == false) {
                            Boolean insert = DB.insertData(user, pass);
                            if (insert == true) {
                                Toast.makeText(reg.this, "Registered Successfuly", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), login.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(reg.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(reg.this, "Kid Already Exists", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(reg.this, "Password does not match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void next(){
        Intent intent=new Intent(getApplicationContext(),login.class);
        startActivity(intent);
    }
}