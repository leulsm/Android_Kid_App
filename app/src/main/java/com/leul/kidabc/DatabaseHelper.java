package com.leul.kidabc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //DAATA BASE NAME
    public static final String DBName="kids_dat.db";
    public DatabaseHelper(Context context) {
        super(context, DBName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE KIDS(kidname TEXT primary key,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists KIDS");
    }
// INSEART DATA
    public Boolean insertData(String kidname, String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put("kidname",kidname);
        values.put("password",password);

        long result=db.insert("KIDS",null,values);
        if(result==-1)
            return false;
        else
            return true;
    }
    // CHECK INSEARTED NAME
    public Boolean checkkidsname(String kidname){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * from KIDS where kidname=?",new String[] {kidname});
        if (cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
    //CHECK PASSWORD
    public Boolean checkkidsnamepassword(String kidname,String password){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * from KIDS where kidname=? and password=?",new String[] {kidname,password});
        if (cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
}
