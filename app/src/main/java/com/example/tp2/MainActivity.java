package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usrNameInput;
    EditText pwdInput;
    String usr;
    String pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrNameInput = findViewById(R.id.editTextTextPersonName);
        pwdInput = findViewById(R.id.editTextTextPassword);
    }
    public void envoyer(View view){
        Intent intent = new Intent(this, MainActivity2.class);

        usr = usrNameInput.getText().toString();
        pwd = pwdInput.getText().toString();
        intent.putExtra("usr",usr);
        intent.putExtra("pwd",pwd);
        startActivity(intent);
    }
}