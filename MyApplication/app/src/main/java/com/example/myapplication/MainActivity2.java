package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Recibe el Intent y extrae los datos que fueron enviados desde MainActivity
        String receivedData = getIntent().getStringExtra("data_key");

        // Actualiza la UI con el dato recibido
        TextView textView = findViewById(R.id.textView);
        textView.setText(receivedData);
    }
}
