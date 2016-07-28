package com.sensationalk.android.assignmentk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 29/06/2016.
 */
public class SqlDbhelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "Record.db";
    public SqlDbhelper(Context context)
    {
        super(context,DATABASE_NAME, null, VERSION);



    }


    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("CREATE Table "+DataSchema.RecordTable.NAME +"("
+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"
        + DataSchema.RecordTable.Cols.Email+","
        + DataSchema.RecordTable.Cols.Username+","
        +DataSchema.RecordTable.Cols.Password+","
        +DataSchema.RecordTable.Cols.Name +")"

);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {


    }
    private String Email;
    private String Username;
    private String Password;
    private String Name;


    public void AddRecord(ModelClass model)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val = new ContentValues();
        val.put(DataSchema.RecordTable.Cols.Email, model.getEmail());
        val.put(DataSchema.RecordTable.Cols.Username, model.getUsername());
        val.put(DataSchema.RecordTable.Cols.Password, model.getPassword());
        val.put(DataSchema.RecordTable.Cols.Name, model.getName());
        db.insert(DataSchema.RecordTable.NAME, null, val);
        db.close();
    }

}
