package com.example.guilhermepanizzon.devtalksrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by guilhermepanizzon on 06/02/17.
 */

public class InitialActivity extends AppCompatActivity{
    ListView listViewInitial;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listViewInitial = (ListView) findViewById(R.id.main_listview);

        String[] values = new String[]{
          "Activity Lifecycle", "RecyclerView"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listViewInitial.setAdapter(adapter);
        listViewInitial.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:

                        break;
                    case 1:
                        Intent recyclerViewActivity = new Intent(getApplicationContext(), RecyclerViewActivity.class);
                        startActivity(recyclerViewActivity);
                        break;
                }

            }
        });


    }

}