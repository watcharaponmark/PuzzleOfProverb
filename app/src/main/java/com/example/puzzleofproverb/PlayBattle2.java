package com.example.puzzleofproverb;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puzzleofproverb.model.QA;
import com.example.puzzleofproverb.model.QAList;

import java.util.ArrayList;

public class PlayBattle2 extends AppCompatActivity {

    private static final String TAG = PlayBattle2.class.getSimpleName();
    private QAList mQAList;
    private String mTime1;
    private int mTime2;
    private int mScore=0;
    private int count=0;
    private QA random;
    private int index=0;
    int countSize=-1;
    ArrayList<Integer> arrqa1;
    private int testScore=mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_battle2);
        final Intent intent=getIntent();

        arrqa1=new ArrayList<Integer>(intent.getIntegerArrayListExtra("arrqa1"));
        final TextView tv_t1=(TextView) findViewById(R.id.tv_t1_b2);
        final TextView tv_t2=(TextView) findViewById(R.id.tv_t1_b2);
        final Button bt_cost=(Button) findViewById(R.id.bt_cost12_b2);
        final TextView tv_score2=(TextView)findViewById(R.id.tv_score12_b2);
        final ImageView im_play=(ImageView) findViewById(R.id.im_play_b2);

        final TextView tv_Q = (TextView) findViewById(R.id.tv_Q_b2);
        final Button bt_a1 = (Button) findViewById(R.id.bt_a1_b2);
        final Button bt_a2 = (Button) findViewById(R.id.bt_a2_b2);
        final Button bt_a3 = (Button) findViewById(R.id.bt_a3_b2);
        final Button bt_a4 = (Button) findViewById(R.id.bt_a4_b2);
        final Button bt_a5 = (Button) findViewById(R.id.bt_a5_b2);
        final Button bt_a6 = (Button) findViewById(R.id.bt_a6_b2);
        TextView tv_player2=(TextView)findViewById(R.id.tv_player2);

        final String play1= intent.getStringExtra("play1");
        final String play2= intent.getStringExtra("play2");
        final String score1=intent.getStringExtra("score1");
        tv_player2.setText(play2);
        mQAList = mQAList.getInstance(this);
        mQAList.loadFromDatabase();
        if(countSize<=arrqa1.size()) {
            random= mQAList.getRandomBattle2(arrqa1.get(index));
            arrqa1.remove(index);
           countSize++;
        }else{
            random = mQAList.getRandomQA();
        }
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
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));

                    }
                    testScore++;
                    count++;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else {
                        random = mQAList.getRandomQA();
                    }
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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{
                    count=0;
                    testScore=0;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());



                }

            }
        });

        bt_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(random.getmCOL_Ans().equals(random.getmCOL_Choice2())){
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));
                    }
                    testScore++;
                    count++;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{


                    count=0;
                    testScore=0;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());

                }

            }
        });

        bt_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(random.getmCOL_Ans().equals(random.getmCOL_Choice3())){
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));
                    }
                    testScore++;
                    count++;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{


                    count=0;
                    testScore=0;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());

                }

            }
        });
        bt_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(random.getmCOL_Ans().equals(random.getmCOL_Choice4())){
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));
                    }
                    testScore++;
                    count++;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{


                    count=0;
                    testScore=0;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());

                }

            }
        });

        bt_a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(random.getmCOL_Ans().equals(random.getmCOL_Choice5())){
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));
                    }
                    testScore++;
                    count++;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }
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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{


                    count=0;
                    testScore=0;
                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else {
                        random = mQAList.getRandomQA();
                    }

                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());

                }

            }
        });

        bt_a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(random.getmCOL_Ans().equals(random.getmCOL_Choice6())){
                    if(testScore==mScore) {
                        mScore++;
                        tv_score2.setText(Integer.toString(mScore));
                    }
                    testScore++;
                    count++;

                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else{
                        random = mQAList.getRandomQA();
                    }

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
                        Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                        String score= tv_score2.getText().toString();
                        intentc.putExtra("score1",score1);
                        intentc.putExtra("score2",score);
                        intentc.putExtra("play1",play1);
                        intentc.putExtra("play2",play2);
                        startActivity(intentc);
                    }
                }else{

                    count=0;
                    testScore=0;

                    if(countSize<=arrqa1.size()) {
                        random= mQAList.getRandomBattle2(arrqa1.get(index));
                        arrqa1.remove(index);
                        countSize++;
                    }else if(arrqa1.size()<0){
                        random = mQAList.getRandomQA();
                    }

                    im_play.setImageResource(R.drawable.a);
                    tv_Q.setText(random.getmCOL_Que());
                    bt_a1.setText(random.getmCOL_Choice1());
                    bt_a2.setText(random.getmCOL_Choice2());
                    bt_a3.setText(random.getmCOL_Choice3());
                    bt_a4.setText(random.getmCOL_Choice4());
                    bt_a5.setText(random.getmCOL_Choice5());
                    bt_a6.setText(random.getmCOL_Choice6());


                }

            }
        });


        bt_cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc=new Intent(PlayBattle2.this,GameOverBattle.class);
                String score= tv_score2.getText().toString();
                intentc.putExtra("score1",score1);
                intentc.putExtra("score2",score);
                intentc.putExtra("play1",play1);
                intentc.putExtra("play2",play2);
                startActivity(intentc);
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
                Intent intent2=new Intent(PlayBattle2.this,GameOverBattle.class);
                String score= tv_score2.getText().toString();
                intent2.putExtra("score1",score1);
                intent2.putExtra("score2",score);
                intent2.putExtra("play1",play1);
                intent2.putExtra("play2",play2);
                startActivity(intent2);

            }
        }.start();


    }
}


