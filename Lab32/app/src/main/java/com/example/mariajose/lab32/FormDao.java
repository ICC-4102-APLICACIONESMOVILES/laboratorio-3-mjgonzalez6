package com.example.mariajose.lab32;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by MariaJose on 03-04-2018.
 */

@Dao
public interface FormDao {
    @Query("SELECT * FROM form")
    List<Form> getAll();

    @Query("SELECT * FROM form WHERE formId IN (:formIds)")
    List<Form> loadAllByIds(int[] formIds);

    @Query("SELECT * FROM form WHERE form_name LIKE :name LIMIT 1")
    Form findByName(String name);

    @Insert
    void insertAll(Form... forms);

    @Delete
    void delete(Form form);
}
