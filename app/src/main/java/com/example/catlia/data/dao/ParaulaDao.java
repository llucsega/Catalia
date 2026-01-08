package com.example.catlia.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.catlia.data.entity.Paraula;

import java.util.List;

@Dao
public interface ParaulaDao {

    @Insert
    void inserir(Paraula paraula);

    @Query("SELECT * FROM paraules")
    List<Paraula> obtenirTotes();

    @Update
    void actualitzar(Paraula paraula);

    @Delete
    void esborrar(Paraula paraula);
}


