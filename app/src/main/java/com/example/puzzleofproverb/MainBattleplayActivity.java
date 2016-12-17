package com.example.puzzleofproverb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainBattleplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_battleplay);
        final Button bt_playBattel = (Button) findViewById(R.id.bt_playBattel);
        final EditText et_P1=(EditText)findViewById(R.id.et_P1);
        final EditText et_P2=(EditText)findViewById(R.id.et_P2);
        bt_playBattel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainBattleplayActivity.this, PlayBattle1.class);
                intent.putExtra("et_P1",et_P1.getText().toString());
                intent.putExtra("et_P2",et_P2.getText().toString());
                startActivity(intent);
            }
        });
    }
}