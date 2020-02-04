package com.example.budgeter_v01;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String TABLE_NAME = "user_table";
    private static final String COL1 = "ID";
    private static final String COL2 = "Username";
    private static final String COL3 = "Password";
    private static final String COL4 = "Email";

    public DatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}

