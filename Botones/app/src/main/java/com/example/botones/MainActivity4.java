package com.example.botones;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final TextView textView = findViewById(R.id.textView);

        Button boton4 = (Button) findViewById(R.id.button4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("BOTÓN 1 PULSADO");
                textView.setTextColor(Color.RED);
            }
        });

        Button boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("BOTÓN 2 PULSADO");
                textView.setTextColor(Color.GREEN);
            }
        });
    }
}