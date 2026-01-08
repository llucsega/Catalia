package com.example.catlia.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "paraules")
public class Paraula {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    public String text = "";

    @NonNull
    public String categoria = "";

    @NonNull
    public String nivell = "";
}
