package com.example.dartsparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CreateGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_game);

        Spinner startPointSP = findViewById(R.id.startPointSP);
        String[] items = new String[]{"101","201","301","401","501","701","1001"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        startPointSP.setAdapter(adapter);

        Spinner setSP = findViewById(R.id.setSP);
        String[] items2 = new String[]{"1", "2", "3","4", "5", "6","7"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        setSP.setAdapter(adapter2);

        Spinner legSP = findViewById(R.id.legSP);
        String[] items3 = new String[]{"1", "2", "3","4", "5"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        legSP.setAdapter(adapter3);

        Spinner checkInSP = findViewById(R.id.checkInSP);
        String[] items4 = new String[]{"Simple", "Double", "Triple","Bull"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        checkInSP.setAdapter(adapter4);

        Spinner setModeSP = findViewById(R.id.setModeSP);
        String[] items5 = new String[]{"First Of", "Best Of"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
        setModeSP.setAdapter(adapter5);

    }
    public void playGame(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}