package com.example.rachit.myapplication01;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rachit on 15-03-2016.
 */
public class Dbhelper extends SQLiteOpenHelper {


    public SQLiteDatabase DB;
    public static final String DATABASE_NAME = "verification_DB";
    //personal_table

    private static final String fname = "firstname";
    private static final String lname = "lastname";
    private static final String address = "address";
    private static final String city = "city";
    private static final String zip = "zip";
    private static final String company = "company";
    private static final String status = "status";
    private static final String business = "business";
    private static final String telephn = "telephn";
    private String PERSONAL_TABLE = "Pt";
    private Context mContext;


    public Dbhelper(Context mContext) {

        super(mContext, DATABASE_NAME, null, 1);
        this.mContext = mContext;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_PERSONAL_TABLE = "CREATE TABLE IF NOT EXISTS " + PERSONAL_TABLE +
                "("
                + fname + " TEXT DEFAULT '',"
                + lname + " TEXT DEFAULT '',"
                + address + " TEXT DEFAULT '',"
                + city + " TEXT DEFAULT '',"
                + zip + " TEXT DEFAULT '',"
                + company + " TEXT DEFAULT '',"
                + status + " TEXT DEFAULT '',"
                + business + " TEXT DEFAULT '',"
                + telephn + " TEXT DEFAULT ''"
                + ")";

        db.execSQL(CREATE_PERSONAL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long saveAddress(String frt, String lrt, String ad, String cit, String zi, String com, String st, String bus, String tele) {

        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(fname, frt);
        contentValues.put(lname, lrt);
        contentValues.put(address, ad);
        contentValues.put(city, cit);
        contentValues.put(zip, zi);
        contentValues.put(company, com);
        contentValues.put(status, st);
        contentValues.put(business, bus);
        contentValues.put(telephn, tele);
        long query = db.insert(PERSONAL_TABLE, null, contentValues);
        db.close();
        return query;
    }

//  public ArrayList<String> getRecord()
//  {
//
//      SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
//      ArrayList<String> stringArrayList = new ArrayList<>();
//      Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + PERSONAL_TABLE, null);
//
//      if(cursor!=null && cursor.moveToFirst())
//      {
//          do {
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(fname)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(lname)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(address)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(city)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(zip)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(company)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(status)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(business)));
//              stringArrayList.add(cursor.getString(cursor.getColumnIndex(telephn)));
//
//
//          }while (cursor.moveToNext());
//      }
//
//      return stringArrayList;
//
//  }





//    if(cursor != null && cursor.moveToFirst())
//
//    {
//        do {
//            Record record = new Record();
//
//            record.setfName(cursor.getInt(cursor.getColumnIndex(FirstName)));
//            arrayList.add(Record);
//
//
//        } while (cursor.moveToNext());
//    }
//        sqLiteDatabase.close();
//        return arrayList;
//    }

}