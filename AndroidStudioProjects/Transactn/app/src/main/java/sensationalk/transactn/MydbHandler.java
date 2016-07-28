package sensationalk.transactn;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class MydbHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="infos.db";
    private static final String TABLE_INFO="infos";
    private static final String COLUMN_ID="_id";
    private static  final String COLUMN_Name="_Name";
    private static  final String COLUMN__AccountNo="_AccountNo";

    public MydbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
String query= "CREATE TABLE "+ TABLE_INFO + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," + COLUMN_Name + " TEXT ,"+ COLUMN__AccountNo + " TEXT " +

        ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
db.execSQL("DROP TABLE IF EXISTS"+TABLE_INFO);
        onCreate(db);
    }
    // add a record
    public void AddInfo(Info info)
    {

        ContentValues values= new ContentValues();
        values.put(COLUMN_Name, info.get_Name());
        values.put(COLUMN__AccountNo, info.get_AccountNo());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_INFO, null, values);
        db.close();

    }
public void Delete(String Name)
{
    SQLiteDatabase db = getWritableDatabase();
    db.execSQL("DELETE FROM" + TABLE_INFO + " WHERE " + COLUMN_ID + " =\"" + 1 + "\";");
}
    public Cursor display()
    {
        SQLiteDatabase db = getReadableDatabase();

        return db.query(TABLE_INFO, new String[] {COLUMN_ID, COLUMN_Name,
                COLUMN__AccountNo}, null, null, null, null, null);
    }

  /*  public  String dispay()
    {
        String dbstring="";
        SQLiteDatabase db = getReadableDatabase();

        String query="SELECT * FROM " + TABLE_INFO + ";";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
        while (!c.isAfterLast())
        {
            if(c.getString(c.getColumnIndex("Name"))!=null)
            {
                dbstring+=c.getColumnIndex("Name") + "  "+ c.getColumnIndex("AcountNo");
                dbstring+="\n";

            }

        }

        db.close();
        return  dbstring;
    }
*/
}
