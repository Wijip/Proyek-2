package com.example.proyek2spkpemilihangedung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void postLogin (View View) {
        Intent intent = new Intent (this, Home.class);
        startActivity(intent);
    }

    public void onCreate1 (View View) {
        Intent intent = new Intent (this, CreateAccount.class);
        startActivity(intent);
    }

}
