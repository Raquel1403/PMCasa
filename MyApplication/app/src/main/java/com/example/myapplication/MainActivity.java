package com.example.myapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estado onCreate");

        // Enviar un Intent durante la etapa de onCreate()
        Intent intentOnCreate = new Intent(MainActivity.this, SecondActivity.class);
        intentOnCreate.putExtra("data_key", "Dato enviado desde onCreate()");
        startActivity(intentOnCreate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Estado onStart");

        // Enviar un Intent durante la etapa de onStart()
        Intent intentOnStart = new Intent(MainActivity.this, SecondActivity.class);
        intentOnStart.putExtra("data_key", "Dato enviado desde onStart()");
        startActivity(intentOnStart);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estado onResume");

        // Enviar un Intent durante la etapa de onResume()
        Intent intentOnResume = new Intent(MainActivity.this, SecondActivity.class);
        intentOnResume.putExtra("data_key", "Dato enviado desde onResume()");
        startActivity(intentOnResume);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Estado onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estado onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Estado onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estado onDestroy");
    }
}
