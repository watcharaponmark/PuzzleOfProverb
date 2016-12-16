package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        Button bt_score=(Button) findViewById(R.id.bt_score);
        Button cose=(Button) findViewById(R.id.bt_coseGOV);
        Button  bt_Replay=(Button)  findViewById(R.id.bt_Replay);
        cose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameOver.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bt_Replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameOver.this,Play.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        String score= intent.getStringExtra("score");
        bt_score.setText(score);
    }
}
