package com.example.puzzleofproverb;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainplay);
        Button bt=(Button) findViewById(R.id.bt_play2);
        assert bt != null;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player =MediaPlayer.create(MainplayActivity.this,R.raw.click);
                player.start();
                Intent intent=new Intent(MainplayActivity.this,Play.class);
                intent.putExtra("status","play");
                startActivity(intent);
            }
        });
    }
}
