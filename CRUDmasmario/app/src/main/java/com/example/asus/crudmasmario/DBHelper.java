package com.example.asus.crudmasmario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Asus on 22/12/2017.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    protected static final String DATABASE_NAME = "cruddb";
    protected static final String TABLE_NAME = "crud";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlMutabaah = "CREATE TABLE " + TABLE_NAME + " " +
                "( ID INTEGER PRIMARY KEY, INPUT TEXT ) ";
        db.execSQL(sqlMutabaah);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME + "";
        db.execSQL(sql);
        onCreate(db);
    }
}
