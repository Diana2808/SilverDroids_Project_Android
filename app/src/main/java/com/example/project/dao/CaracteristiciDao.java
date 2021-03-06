package com.example.project.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.project.claseBD.CaracteristiciBD;

import java.util.List;

@Dao
public interface CaracteristiciDao {

    @Insert
    long insert(CaracteristiciBD caracteristici);

    @Update
    int update(CaracteristiciBD caracteristici);

    @Delete
    int delete(CaracteristiciBD caracteristiciBD);


    @Query("SELECT * FROM caracteristici")
    List<CaracteristiciBD> getAllCaracteristici();
}
