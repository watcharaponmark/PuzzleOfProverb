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
        cv.put(COL_Ans, "ใต้ถุนร้าน");
        cv.put(COL_Que, "เก็บเบี้ย");
        cv.put(COL_Choice1, "ใต้ถุนร้าน");
        cv.put(COL_Choice2, "ลูกหนี้");
        cv.put(COL_Choice3, "ใต้ถุนร้าน ");
        cv.put(COL_Choice4, "ไปเสียดอก");
        cv.put(COL_Choice5, "เก็บดอก");
        cv.put(COL_Choice6, "เก็บทำไม");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ผสมน้อย");
        cv.put(COL_Que, "เก็บเล็ก");
        cv.put(COL_Choice1, "ผสมน้อย");
        cv.put(COL_Choice2, "เก็บเช้า");
        cv.put(COL_Choice3, "เก็บค่ำ");
        cv.put(COL_Choice4, "เก็บทุกวัน");
        cv.put(COL_Choice5, "เก็บดอก");
        cv.put(COL_Choice6, "เก็บใหญ่");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ตื่นตูม");
        cv.put(COL_Que, "กระต่าย");
        cv.put(COL_Choice1, "น่ารัก");
        cv.put(COL_Choice2, "พันธ์แท้");
        cv.put(COL_Choice3, "ริ่มทาง");
        cv.put(COL_Choice4, "ตื่นตูม");
        cv.put(COL_Choice5, "อาร์สยาม");
        cv.put(COL_Choice6, "ตัวเล็ก");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "รอมริบ");
        cv.put(COL_Que, "เก็บหอม");
        cv.put(COL_Choice1, "หัวใหญ่");
        cv.put(COL_Choice2, "จากสวน");
        cv.put(COL_Choice3, "มาทำกิน");
        cv.put(COL_Choice4, "เก็บทำไม");
        cv.put(COL_Choice5, "ริ่มรั้ว");
        cv.put(COL_Choice6, "รอมริบ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ใบหยก");
        cv.put(COL_Que, "กิ่งทอง");
        cv.put(COL_Choice1, "ใบหน่าน");
        cv.put(COL_Choice2, "ทองแท่ง");
        cv.put(COL_Choice3, "ใบหยก");
        cv.put(COL_Choice4, "ราคาแพง");
        cv.put(COL_Choice5, "ต้นก็ทอง");
        cv.put(COL_Choice6, "ของใคร");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ออกทางประตู");
        cv.put(COL_Que, "เข้าตามตรอก");
        cv.put(COL_Choice1, "ออกตามกำแพง");
        cv.put(COL_Choice2, "ออกถนนใหญ่");
        cv.put(COL_Choice3, "ออกตามหน้าต่าง");
        cv.put(COL_Choice4, "ออกทางประตู");
        cv.put(COL_Choice5, "ออกตามซอย");
        cv.put(COL_Choice6, "เข้าตามซอก");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "หมากแพง");
        cv.put(COL_Que, "ข้าวยาก");
        cv.put(COL_Choice1, "ขาวสวย");
        cv.put(COL_Choice2, "ข้าวเหนียว");
        cv.put(COL_Choice3, "หมากอร่อย");
        cv.put(COL_Choice4, "หมากแพง");
        cv.put(COL_Choice5, "หมากไม้");
        cv.put(COL_Choice6, "หมากอร่อย");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "จับตั๊กแตน");
        cv.put(COL_Que, "ขี่ช้าง");
        cv.put(COL_Choice1, "จับแน่นๆ");
        cv.put(COL_Choice2, "กลัวตก");
        cv.put(COL_Choice3, "จับตั๊กแตน");
        cv.put(COL_Choice4, "ช้างไม่ให้ขี่");
        cv.put(COL_Choice5, "ช้างไม่ให้ขี่");
        cv.put(COL_Choice6, "จับขโมย");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "แกงร้อน");
        cv.put(COL_Que, "ข้าวแดง");
        cv.put(COL_Choice1, "ในคุก");
        cv.put(COL_Choice2, "แกงร้อน");
        cv.put(COL_Choice3, "แสนอร่อย");
        cv.put(COL_Choice4, "แกงเย็น");
        cv.put(COL_Choice5, "น้ำโอเลี้ยง");
        cv.put(COL_Choice6, "เป็นไงว่ะ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "เอาตาไปไร่");
        cv.put(COL_Que, "เอาหูไปนา");
        cv.put(COL_Choice1, "เอามาทำไม");
        cv.put(COL_Choice2, "เอาตาไปไร่");
        cv.put(COL_Choice3, "เอาตามาด้วย");
        cv.put(COL_Choice4, "แล้วเจองูเห่า");
        cv.put(COL_Choice5, "เอาหูไปไร่");
        cv.put(COL_Choice6, "เอาเขาไปไร่");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "เอาตัวไม่รอด");
        cv.put(COL_Que, "ความรู้ท่วมหัว");
        cv.put(COL_Choice1, "เพราะเรียนมาเยอะ");
        cv.put(COL_Choice2, "แต่กลัวสอบตก");
        cv.put(COL_Choice3, "เอาตัวไม่รอด");
        cv.put(COL_Choice4, "แต่ท่วมหัวเข่า");
        cv.put(COL_Choice5, "ท่วมบ้านท่วมเมือง");
        cv.put(COL_Choice6, "ความกลัวก็มี");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "คาเขา");
        cv.put(COL_Que, "คาหนัง");
        cv.put(COL_Choice1, "คาเขา");
        cv.put(COL_Choice2, "ตะลุง");
        cv.put(COL_Choice3, "กลางแปลง");
        cv.put(COL_Choice4, "ในโรง");
        cv.put(COL_Choice5, "รอบค่ำ");
        cv.put(COL_Choice6, "คาหลังคา");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ชนแกะ");
        cv.put(COL_Que, "จับแพะ");
        cv.put(COL_Choice1, "จับแกะ");
        cv.put(COL_Choice2, "เกาะดำ");
        cv.put(COL_Choice3, " แพะไม่ให้จับ");
        cv.put(COL_Choice4, "ผิดฝูง");
        cv.put(COL_Choice5, "ชนแกะ");
        cv.put(COL_Choice6, "จับไง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "สองแคม");
        cv.put(COL_Que, "เหยียบเรือ");
        cv.put(COL_Choice1, "สองแคม");
        cv.put(COL_Choice2, "เรือก็ร่ม");
        cv.put(COL_Choice3, "ทำไม");
        cv.put(COL_Choice4, "แล้วพ่าย");
        cv.put(COL_Choice5, "แล้วพ่าย");
        cv.put(COL_Choice6, "เหยียบของใคร");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "พลอยโจน");
        cv.put(COL_Que, "ตกกะได");
        cv.put(COL_Choice1, "ขาหัก");
        cv.put(COL_Choice2, "เจ็บไหม");
        cv.put(COL_Choice3, "สไลด์ลงพื้น");
        cv.put(COL_Choice4, "พลอยโจน");
        cv.put(COL_Choice5, "ดังปัง");
        cv.put(COL_Choice6, "โอ้ยเจ็บ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ไปงัดไม้ซุง");
        cv.put(COL_Que, " เอาไม้ซีก");
        cv.put(COL_Choice1, "มาแคะฟัน");
        cv.put(COL_Choice2, "ไปงัดไม้ซุง");
        cv.put(COL_Choice3, "มาสร้างบ้าน");
        cv.put(COL_Choice4, "ไปงัดบ้าน");
        cv.put(COL_Choice5, "มาทาสีให้สวย");
        cv.put(COL_Choice6, "ไปทำไม่จิ้มฟัน");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ละลายแม่น้ำ");
        cv.put(COL_Que, "ตำน้ำพริก");
        cv.put(COL_Choice1, "น้ำพริกกะปิ");
        cv.put(COL_Choice2, "น้ำพริกลงเรือ");
        cv.put(COL_Choice3, "ละลายแม่น้ำ");
        cv.put(COL_Choice4, "ให้สามี");
        cv.put(COL_Choice5, "แสนร่อย");
        cv.put(COL_Choice6, "น้ำพริกตาแดง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ไม่ทั่วฟ้า");
        cv.put(COL_Que, "ฝนตก");
        cv.put(COL_Choice1, "ต้องกางร่ม");
        cv.put(COL_Choice2, "กลางเมือง");
        cv.put(COL_Choice3, "ฤดูหนาว");
        cv.put(COL_Choice4, "ฤดูฝน");
        cv.put(COL_Choice5, "แดดออก");
        cv.put(COL_Choice6, "ไม่ทั่วฟ้า");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "สองหัว");
        cv.put(COL_Que, "นก");
        cv.put(COL_Choice1, "แสนสวย");
        cv.put(COL_Choice2, "แก้ว");
        cv.put(COL_Choice3, "สองหัว");
        cv.put(COL_Choice4, "ขุนทอง");
        cv.put(COL_Choice5, "พันธืใหม่");
        cv.put(COL_Choice6, "พิราบ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_Ans, "ให้ว่ายน้ำ");
        cv.put(COL_Que, "สอนจระเข้");
        cv.put(COL_Choice1, "ให้อ้าปาก");
        cv.put(COL_Choice2, "ให้ว่านพระ");
        cv.put(COL_Choice3, "ให้ว่ายน้ำ");
        cv.put(COL_Choice4, "ให้จำ");
        cv.put(COL_Choice5, "สอนทำไม");
        cv.put(COL_Choice6, "จระเข้ไม่จำ");
        db.insert(TABLE_NAME, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
