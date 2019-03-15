package com.example.activitylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","Invoking onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivityLife","Invoking onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivityLife","Invoking onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivityLife","Invoking onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivityLife","Invoking onDestroy()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivityLife","Invoking onRestart");
    }
}
