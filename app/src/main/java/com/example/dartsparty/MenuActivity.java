package com.example.dartsparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void signOut(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void createGame(View view){
        Intent intent = new Intent(this, CreateGameActivity.class);
        startActivity(intent);
    }
}