package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Player2 extends AppCompatActivity {
    private static final String TAG = Player2.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);

        Button bt_score=(Button) findViewById(R.id.bt_scorePl1);
        Button  bt_Replay=(Button)  findViewById(R.id.bt_play_pl2);

        final Intent intent3=getIntent();
        final String score= intent3.getStringExtra("score");
        bt_score.setText("คะแนน :"+score);

        bt_Replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Player2.this,PlayBattle2.class);
                intent.putIntegerArrayListExtra("arrqa1",intent3.getIntegerArrayListExtra("arrqa1"));
                intent.putExtra("score1",score);
                intent.putExtra("play1",intent3.getStringExtra("play1"));
                intent.putExtra("play2",intent3.getStringExtra("play2"));
                startActivity(intent);
            }
        });

    }
    }

