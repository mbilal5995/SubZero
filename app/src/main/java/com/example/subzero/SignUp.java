package com.example.subzero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void handleOnClick(View v){
        Intent i=new Intent(SignUp.this,Login.class);
        this.startActivity(i);

    }
    public void handleForget(View v){
        Intent i=new Intent(SignUp.this,ForgetPassword.class);
        this.startActivity(i);

    }

}