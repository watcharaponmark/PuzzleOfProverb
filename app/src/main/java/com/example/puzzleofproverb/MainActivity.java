package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_play1=(Button) findViewById(R.id.bt_play1);
        Button bt_battle1=(Button) findViewById(R.id.bt_battle1);

        assert bt_play1 != null;
        bt_play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainplayActivity.class);
                startActivity(intent);
            }
        });

        assert bt_battle1 != null;
        bt_battle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainBattleplayActivity.class);
                startActivity(intent);
            }
        });

    }
}
