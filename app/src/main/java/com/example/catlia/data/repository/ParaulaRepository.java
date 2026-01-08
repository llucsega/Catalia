package com.example.catlia.data.repository;

import android.content.Context;

import com.example.catlia.data.db.AppDatabase;
import com.example.catlia.data.entity.Paraula;

import java.util.List;

public class ParaulaRepository {

    private final AppDatabase db;

    public ParaulaRepository(Context context) {
        db = AppDatabase.getInstance(context);
    }

    public void inserir(Paraula p) {
        db.paraulaDao().inserir(p);
    }

    public List<Paraula> obtenirTotes() {
        return db.paraulaDao().obtenirTotes();
    }
}
