package com.example.proyek2spkpemilihangedung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessCreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_create_account);
    }
    public void Home(View View){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
