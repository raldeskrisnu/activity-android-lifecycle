package com.id.myrepublic.test_android_lifecyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Android Lifecyle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "On Create");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "On Destroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "On Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "On Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "On Stop");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"On Pause");
    }
}
