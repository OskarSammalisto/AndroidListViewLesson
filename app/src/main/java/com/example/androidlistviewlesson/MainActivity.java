package com.example.androidlistviewlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] listItems = {"Jacob", "Per", "David", "Susan", "Lois", "Laura"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView nameListView = findViewById(R.id.nameList);

      //  ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listItems);

        PersonAdapter adapter = new PersonAdapter(this, listItems);



        nameListView.setAdapter(adapter);

        //nameListView.setOnItemClickListener();

    }
}
