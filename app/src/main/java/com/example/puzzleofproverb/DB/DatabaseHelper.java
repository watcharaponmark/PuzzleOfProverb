package com.example.puzzleofproverb.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "what_to_eat.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "QuAn";
    public static final String COL_ID = "_id";
    public static final String COL_Ans = "Ans";
    public static final String COL_Que = "Que";
    public static final String COL_Choice1 = "Choice1";
    public static final String COL_Choice2 = "Choice2";
    public static final String COL_Choice3 = "Choice3";
    public static final String COL_Choice4 = "Choice4";
    public static final String COL_Choice5 = "Choice5";
    public static final String COL_Choice6 = "Choice6";

    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_Ans + " TEXT, "
                    + COL_Que + " TEXT, "
                    + COL_Choice1 + " TEXT, "
                    + COL_Choice2 + " TEXT, "
                    + COL_Choice3 + " TEXT, "
                    + COL_Choice4 + " TEXT, "
                    + COL_Choice5 + " TEXT, "
                    + COL_Choice6 + " TEXT"
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "ข้าวผัด.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ข้าวผัด");
        cv.put(COL_Que, "kao_pad.jpg");
        cv.put(COL_Choice1, "kao_pad.jpg");
        cv.put(COL_Choice2, "kao_pad.jpg");
        cv.put(COL_Choice3, "kao_pad.jpg");
        cv.put(COL_Choice4, "kao_pad.jpg");
        cv.put(COL_Choice5, "kao_pad.jpg");
        cv.put(COL_Choice6, "kao_pad.jpg");
        db.insert(TABLE_NAME, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
