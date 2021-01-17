package com.oyatech.roomproject.roomdb;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * The Data Access Object which contains all the method to perform the db operations
 */
@Dao
public interface PriestDao {
    /**
     * The name of the table specified must to writing in the selection command
     * @return
     */
    @Query("SELECT * FROM Catholic_Fathers")
List<Priests> getAllPriests();

    @Query("SELECT * FROM Catholic_Fathers WHERE Contribution > :priestContri")
    List<Priests> moreThanThisContribution (String priestContri);

    @Insert
    public void insertPriest(Priests... priests);

    @Update
    public void updatePriest(Priests priests);



}
