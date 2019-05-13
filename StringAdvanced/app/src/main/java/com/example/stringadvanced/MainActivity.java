package com.example.stringadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nameString = "Mike, Bob, Alan, James";
        String[] name = nameString.split(", ");
        for (String names: name
             ) {
            Log.i("I'm ", names);
        }
        String geometry = "geometry";
        String metr = geometry.substring(3, 4);
        Log.i(metr);
    }
}
