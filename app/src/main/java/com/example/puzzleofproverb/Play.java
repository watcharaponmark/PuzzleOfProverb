package com.example.puzzleofproverb;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puzzleofproverb.model.QA;
import com.example.puzzleofproverb.model.QAList;

import org.w3c.dom.Text;

import java.sql.Time;

public class Play extends AppCompatActivity {

    private static final String TAG = Play.class.getSimpleName();
    private QAList mQAList;
    private String mTime1;
    private int mTime2;
    private int mScore=0;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        final TextView tv_t1=(TextView) findViewById(R.id.tv_t1);
        final TextView tv_t2=(TextView) findViewById(R.id.tv_t2);
        final Button bt_cost=(Button) findViewById(R.id.bt_cost);
        final TextView tv_score2=(TextView)findViewById(R.id.tv_score2);
        final  ImageView im_play=(ImageView) findViewById(R.id.im_play);

        final Intent intent=getIntent();
        String status = intent.getStringExtra("status");

            final TextView tv_Q = (TextView) findViewById(R.id.tv_Q);
            final Button bt_a1 = (Button) findViewById(R.id.bt_a1);
            final Button bt_a2 = (Button) findViewById(R.id.bt_a2);
            final Button bt_a3 = (Button) findViewById(R.id.bt_a3);
            final Button bt_a4 = (Button) findViewById(R.id.bt_a4);
            final Button bt_a5 = (Button) findViewById(R.id.bt_a5);
            final Button bt_a6 = (Button) findViewById(R.id.bt_a6);

            mQAList = mQAList.getInstance(this);
            mQAList.loadFromDatabase();
            final QA random = mQAList.getRandomFood();
            tv_Q.setText(random.getmCOL_Que());
            bt_a1.setText(random.getmCOL_Choice1());
            bt_a2.setText(random.getmCOL_Choice2());
            bt_a3.setText(random.getmCOL_Choice3());
            bt_a4.setText(random.getmCOL_Choice4());
            bt_a5.setText(random.getmCOL_Choice5());
            bt_a6.setText(random.getmCOL_Choice6());


            bt_a1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice1())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });

            bt_a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice2())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });

            bt_a3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice3())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });
            bt_a4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice4())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });

            bt_a5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice5())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });

            bt_a6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(random.getmCOL_Ans().equals(random.getmCOL_Choice6())){
                        mScore++;
                        tv_score2.setText(mScore);
                        QA random = mQAList.getRandomFood();
                        count++;
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        if(count==0){
                            im_play.setImageResource(R.drawable.a);
                        }else if(count==1){
                            im_play.setImageResource(R.drawable.a1);
                        }else if(count==2){
                            im_play.setImageResource(R.drawable.a2);
                        }else if(count==3){
                            im_play.setImageResource(R.drawable.a3);
                        }else if(count==4){
                            im_play.setImageResource(R.drawable.a4);
                        }else if(count==5){
                            im_play.setImageResource(R.drawable.a5);
                        }else if(count==6){
                            im_play.setImageResource(R.drawable.a6);
                        }else if(count==7){
                            im_play.setImageResource(R.drawable.a7);
                        }else if(count==8){
                            im_play.setImageResource(R.drawable.a8);
                        }else if(count==9){
                            im_play.setImageResource(R.drawable.a9);
                        }else if(count==10){
                            im_play.setImageResource(R.drawable.a10);
                        }
                    }else{

                        im_play.setImageResource(R.drawable.a);
                        QA random = mQAList.getRandomFood();
                        tv_Q.setText(random.getmCOL_Que());
                        bt_a1.setText(random.getmCOL_Choice1());
                        bt_a2.setText(random.getmCOL_Choice2());
                        bt_a3.setText(random.getmCOL_Choice3());
                        bt_a4.setText(random.getmCOL_Choice4());
                        bt_a5.setText(random.getmCOL_Choice5());
                        bt_a6.setText(random.getmCOL_Choice6());
                        count=0;
                        im_play.setImageResource(R.drawable.a);
                    }

                }
            });


        bt_cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Play.this,GameOver.class);
                String score= tv_score2.getText().toString();
                intent.putExtra("score",score);
                startActivity(intent);

            }
        });
        mTime1 = "01";
        mTime2 = 60;
        CountDownTimer cdt = new CountDownTimer(1000*60, 1000) {
            public void onTick(long millisUntilFinished) {
                --mTime2;
                tv_t1.setText(mTime1);
                if(mTime2<10) {
                    tv_t2.setText("0"+Integer.toString(mTime2));
                }else{
                    tv_t2.setText(Integer.toString(mTime2));
                }
                mTime1 = "00";

            }

            public void onFinish() {
                Intent intent2=new Intent(Play.this,GameOver.class);
                String score= tv_score2.getText().toString();
                intent2.putExtra("score",score);
                startActivity(intent2);

            }
        }.start();


    }
}
