package com.example.catlia.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.catlia.data.dao.ParaulaDao;
import com.example.catlia.data.entity.Paraula;

@Database(entities = {Paraula.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract ParaulaDao paraulaDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "catlia_database"
                    ).allowMainThreadQueries() // només per treball de classe
                    .build();
        }
        return INSTANCE;
    }
}
