package com.example.nigol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;

public class MainActivity extends AppCompatActivity {
    EditText userid;
    EditText userpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        userid = findViewById (R.id.userid);
        userpass = findViewById(R.id.userpass);
        Button loginBtn = findViewById (R.id.loginBtn);
        loginBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                loginProcess(view);
                Intent intent = new Intent(getApplicationContext (), MenuActivity.class);
                startActivity (intent);



            }
        });
    }
    public void loginProcess(View v){
        String uid = userid.getText().toString();
        String upass = userpass.getText ().toString ();
        if(uid.equals ("lsh") && upass.equals ("12345")){
            Toast.makeText (this, " "  + uid, Toast.LENGTH_SHORT).show ();


        } else {
            Toast.makeText (this, "로그인 정보가 없습니다", Toast.LENGTH_SHORT).show ();
            userpass.setText ("");
        }

    }
}