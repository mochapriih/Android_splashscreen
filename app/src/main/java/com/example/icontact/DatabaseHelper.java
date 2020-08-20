package com.example.icontact;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "friend.db";
    public static final String TABLE_NAME = "data_teman";
    public static final String COL_1 = "NIM";
    public static final String COL_2 = "Nama";
    public static final String COL_3 = "Kelas";
    public static final String COL_4 = "Telepon";
    public static final String COL_5 = "Email";
    public static final String COL_6 = "Social Media";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
