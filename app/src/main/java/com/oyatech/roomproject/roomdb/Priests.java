package com.oyatech.roomproject.roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * This class, the entity which is the table that contains all the needed fields for the
 * priest who will be doing the monthly contributions
 */
@Entity(tableName = "Catholic_Fathers")
public class Priests {
    @PrimaryKey
    public long priestId;

    @ColumnInfo(name = "First Name")
    public String priestName;

    @ColumnInfo(name = "Surname")
    public String priestSurname;

    @ColumnInfo (name = "Parish")
    public String priestParish;

    @ColumnInfo (name = "Contribution")
    public String priestsContri;
}
