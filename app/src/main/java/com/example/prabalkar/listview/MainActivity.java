package com.example.prabalkar.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgramName;
    public static String [] prgramNameList = {"Java", "C++", "Python", "Ruby", "Os", "Windows", "Dog", "Cat", "Human", "Man", "Girl", "Boy", "Women", "Kolkata", "Mumbai", "Bangalore", "Chennai", "Tamilnadu", "WestBengal", "Jalpaiguri", "Coochbear", "Siliguri", "Html", "Andorid", "Iphone", "Cars", "Bike", "Spoon", "Plate", "Rice", "Shampoo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(new CustomAdapter(MainActivity.this, prgramNameList));
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}
