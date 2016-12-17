package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverBattle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_battle);

        Button bt_score1=(Button) findViewById(R.id.bt_sc1bt);
        Button bt_score2=(Button) findViewById(R.id.bt_cs2bt);
        Button cose=(Button) findViewById(R.id.bt_cosebt);
        Button  bt_Replay=(Button)  findViewById(R.id.bt_Replaybt);
        TextView tv_player1bt=(TextView) findViewById(R.id.tv_player1bt);
        TextView tv_player2bt=(TextView) findViewById(R.id.tv_player2bt);

        Intent intent = getIntent();
        String score1= intent.getStringExtra("score1");
        String score2= intent.getStringExtra("score2");
        String name1=intent.getStringExtra("play1");
        String name2=intent.getStringExtra("play2");
        bt_score1.setText(score1);
        bt_score2.setText(score2);
        tv_player1bt.setText(name1);
        tv_player2bt.setText(name2);

        cose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameOverBattle.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bt_Replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameOverBattle.this,MainBattleplayActivity.class);
                startActivity(intent);
            }
        });
    }
}
