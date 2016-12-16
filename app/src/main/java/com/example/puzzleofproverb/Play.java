package com.example.puzzleofproverb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.puzzleofproverb.model.QA;
import com.example.puzzleofproverb.model.QAList;

public class Play extends AppCompatActivity {

    private static final String TAG = Play.class.getSimpleName();
    private QAList mQAList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        final TextView tv_Q=(TextView) findViewById(R.id.tv_Q);
        final Button bt_a1=(Button) findViewById(R.id.bt_a1);
        final Button bt_a2=(Button) findViewById(R.id.bt_a2);
        final Button bt_a3=(Button) findViewById(R.id.bt_a3);
        final Button bt_a4=(Button) findViewById(R.id.bt_a4);
        final Button bt_a5=(Button) findViewById(R.id.bt_a5);
        final Button bt_a6=(Button) findViewById(R.id.bt_a6);

        mQAList = mQAList.getInstance(this);
        mQAList.loadFromDatabase();
        QA random1 = mQAList.getRandomFood();
        tv_Q.setText(random1.getmCOL_Que());
        bt_a1.setText(random1.getmCOL_Choice1());
        bt_a2.setText(random1.getmCOL_Choice2());
        bt_a3.setText(random1.getmCOL_Choice3());
        bt_a4.setText(random1.getmCOL_Choice4());
        bt_a5.setText(random1.getmCOL_Choice5());
        bt_a6.setText(random1.getmCOL_Choice6());

        bt_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });

        bt_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });

        bt_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });
        bt_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });

        bt_a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });

        bt_a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QA random = mQAList.getRandomFood();
                tv_Q.setText(random.getmCOL_Que());
                bt_a1.setText(random.getmCOL_Choice1());
                bt_a2.setText(random.getmCOL_Choice2());
                bt_a3.setText(random.getmCOL_Choice3());
                bt_a4.setText(random.getmCOL_Choice4());
                bt_a5.setText(random.getmCOL_Choice5());
                bt_a6.setText(random.getmCOL_Choice6());
            }
        });











    }
}
