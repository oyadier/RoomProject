package com.oyatech.roomproject.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * This abstract class is the database class for the priest entity which extends The RoomDatabase
 * This class serves as the main access point for the app into the persistence db.
 * It must be annotated as @Database and in entity property containing all the entities that
 * must be associated with the RoomDb
 */

@Database(entities = Priests.class,version = 1)
public abstract class PriestsDatabase extends RoomDatabase {
    public PriestDao mPriestDao;
}
