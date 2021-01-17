package com.oyatech.roomproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;

import com.oyatech.roomproject.roomdb.PriestDao;
import com.oyatech.roomproject.roomdb.Priests;
import com.oyatech.roomproject.roomdb.PriestsDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {
PriestsDatabase mPriestsDatabase;
    private List<Priests> mPriests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Creating and building a database singleton class
         */
        mPriestsDatabase = Room.databaseBuilder(getApplicationContext(),
                PriestsDatabase.class,"PriestsDatabase")
                .build();

        PriestDao priestDao = mPriestsDatabase.mPriestDao;
        mPriests = priestDao.getAllPriests();

    }




}