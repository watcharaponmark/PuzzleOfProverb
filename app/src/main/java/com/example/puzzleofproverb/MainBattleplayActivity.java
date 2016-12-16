package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBattleplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_battleplay);
        final Button bt_playBattel = (Button) findViewById(R.id.bt_playBattel);
        bt_playBattel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainBattleplayActivity.this, Play.class);
                startActivity(intent);
            }
        });
    }
}