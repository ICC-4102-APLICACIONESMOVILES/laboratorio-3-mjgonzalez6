package com.example.mariajose.lab32;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by MariaJose on 03-04-2018.
 */

@Database(entities = {Form.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    private Context applicationContext;

    public abstract FormDao userDao();

    AppDataBase db = Room.databaseBuilder(getApplicationContext(),
            AppDataBase.class, "database-name").build();

    public Context getApplicationContext() {
        return applicationContext;
    }
}
