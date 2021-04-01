package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView usrText;
    TextView pwdText;
    String usr;
    String pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        usrText = findViewById(R.id.redirectUsrLabel);
        pwdText = findViewById(R.id.redirectPwdLabel);
        Intent intent = getIntent();
        usr = intent.getStringExtra("usr");
        pwd = intent.getStringExtra("pwd");
        usrText.setText(usrText.getText().toString() + usr);
        pwdText.setText(pwdText.getText().toString() + pwd);
    }

    public void retour(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}