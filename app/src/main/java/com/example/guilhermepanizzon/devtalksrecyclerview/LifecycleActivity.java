package com.example.guilhermepanizzon.devtalksrecyclerview;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class LifecycleActivity extends AppCompatActivity {

    String msg = "Android:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_activity);
        Log.d(msg, "The onCreate() event");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}