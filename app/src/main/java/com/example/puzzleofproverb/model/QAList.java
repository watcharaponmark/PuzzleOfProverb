package com.example.puzzleofproverb.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.puzzleofproverb.DB.DatabaseHelper;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mark on 12/16/16.
 */
public class QAList {
    private static final String TAG = QAList.class.getSimpleName();

    private static QAList mInstance;
    private Context mContext;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<QA> mQAList = new ArrayList<>();
    private Random mRandom = new Random();

    public static QAList getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new QAList(context);
        }
        return mInstance;
    }

    private QAList(Context context) {
        this.mContext = context;
    }

    public void loadFromDatabase() {
        mQAList.clear();

        mHelper = new DatabaseHelper(mContext);
        mDb = mHelper.getWritableDatabase();

        Cursor cursor = mDb.query(DatabaseHelper.TABLE_NAME, null, null, null, null, null, null);

        while (cursor.moveToNext()) {
            String COL_Que = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Que));
            String COL_Ans = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Ans));
            String COL_Choice1 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice1));
            String COL_Choice2 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice2));
            String COL_Choice3 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice3));
            String COL_Choice4 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice4));
            String COL_Choice5 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice5));
            String COL_Choice6 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_Choice6));



            QA qa = new QA(COL_Ans, COL_Que, COL_Choice1,  COL_Choice2,  COL_Choice3,  COL_Choice4,  COL_Choice5,  COL_Choice6);
            mQAList.add(qa);
        }
        cursor.close();
        //mDb.close();
        //mHelper.close();
    }

    public ArrayList<QA> getFoodList() {
        return mQAList;
    }

    public QA getRandomFood() {
        int randomIndex = mRandom.nextInt(mQAList.size());
        QA qa = mQAList.get(randomIndex);
        Log.i(TAG, qa.getmCOL_Ans() + ", " + qa.getmCOL_Que());
        return qa;
    }

}

