package com.example.spinner1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = findViewById(R.id.miSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valores, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adaptador, View view, int posicion, long id) {
                String value = adaptador.getItemAtPosition(posicion).toString();
                Toast.makeText(getApplicationContext(), "Has seleccionado: " + value, Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> adaptador) {
                Toast.makeText(getApplicationContext(), "No has seleccionado nada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}