package com.example.puzzleofproverb.model;

public class QA {
    private String mCOL_Ans;
    private String mCOL_Que;
    private String mCOL_Choice1;
    private String mCOL_Choice2;
    private String mCOL_Choice3;
    private String mCOL_Choice4;
    private String mCOL_Choice5;
    private String mCOL_Choice6;

    public QA(String mCOL_Ans, String mCOL_Que, String mCOL_Choice1, String mCOL_Choice2, String mCOL_Choice3, String mCOL_Choice4, String mCOL_Choice5, String mCOL_Choice6) {
        this.mCOL_Ans = mCOL_Ans;
        this.mCOL_Que = mCOL_Que;
        this.mCOL_Choice1 = mCOL_Choice1;
        this.mCOL_Choice2 = mCOL_Choice2;
        this.mCOL_Choice3 = mCOL_Choice3;
        this.mCOL_Choice4 = mCOL_Choice4;
        this.mCOL_Choice5 = mCOL_Choice5;
        this.mCOL_Choice6 = mCOL_Choice6;
    }
    public QA(){

    }

    public String getmCOL_Ans() {
        return mCOL_Ans;
    }

    public String getmCOL_Que() {
        return mCOL_Que;
    }

    public String getmCOL_Choice1() {
        return mCOL_Choice1;
    }

    public String getmCOL_Choice2() {
        return mCOL_Choice2;
    }

    public String getmCOL_Choice3() {
        return mCOL_Choice3;
    }

    public String getmCOL_Choice4() {
        return mCOL_Choice4;
    }

    public String getmCOL_Choice5() {
        return mCOL_Choice5;
    }

    public String getmCOL_Choice6() {
        return mCOL_Choice6;
    }

    public void setmCOL_Ans(String mCOL_Ans) {
        this.mCOL_Ans = mCOL_Ans;
    }

    public void setmCOL_Que(String mCOL_Que) {
        this.mCOL_Que = mCOL_Que;
    }

    public void setmCOL_Choice1(String mCOL_Choice1) {
        this.mCOL_Choice1 = mCOL_Choice1;
    }

    public void setmCOL_Choice2(String mCOL_Choice2) {
        this.mCOL_Choice2 = mCOL_Choice2;
    }

    public void setmCOL_Choice3(String mCOL_Choice3) {
        this.mCOL_Choice3 = mCOL_Choice3;
    }

    public void setmCOL_Choice4(String mCOL_Choice4) {
        this.mCOL_Choice4 = mCOL_Choice4;
    }

    public void setmCOL_Choice5(String mCOL_Choice5) {
        this.mCOL_Choice5 = mCOL_Choice5;
    }

    public void setmCOL_Choice6(String mCOL_Choice6) {
        this.mCOL_Choice6 = mCOL_Choice6;
    }

    @Override
    public String toString() {
        return "QA{" +
                "mCOL_Ans='" + mCOL_Ans + '\'' +
                ", mCOL_Que='" + mCOL_Que + '\'' +
                ", mCOL_Choice1='" + mCOL_Choice1 + '\'' +
                ", mCOL_Choice2='" + mCOL_Choice2 + '\'' +
                ", mCOL_Choice3='" + mCOL_Choice3 + '\'' +
                ", mCOL_Choice4='" + mCOL_Choice4 + '\'' +
                ", mCOL_Choice5='" + mCOL_Choice5 + '\'' +
                ", mCOL_Choice6='" + mCOL_Choice6 + '\'' +
                '}';
    }
}
