package com.kachexiongdi.qkljetpackmvvm.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author ningchuanqi
 * @version V1.0
 */
@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class StudentDatabase2 extends RoomDatabase {

    private static final String DATABASE_NAME = "my_db.db";
    private static StudentDatabase2 mInstance;

    //private MyDatabase(){}

    public static synchronized StudentDatabase2 getInstance(Context context){
        if(mInstance == null){
            mInstance = Room.databaseBuilder(context.getApplicationContext(),
                    StudentDatabase2.class,
                    DATABASE_NAME)
                    //.allowMainThreadQueries()
                    .build();
        }
        return mInstance;
    }

    public abstract StudentDao getStudentDao();

}
