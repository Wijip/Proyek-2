package com.example.proyek2spkpemilihangedung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

    }
    public void SuccessCreate(View View){
        Intent intent = new Intent(this, SuccessCreateAccount.class);
        startActivity(intent);
    }

}
