package com.example.radiobutton;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        RadioGroup miGrupo = findViewById(R.id.radioGrupo);
        miGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedId = miGrupo.getCheckedRadioButtonId();
                if (checkedId == R.id.radioButton1){
                    textView.setText("PULSADO LUNES");
                } else if (checkedId == R.id.radioButton2) {
                    textView.setText("PULSADO MARTES");
                } else if (checkedId == R.id.radioButton3) {
                    textView.setText("PULSADO MIÉRCOLES");
                }else if (checkedId == R.id.radioButton4) {
                    textView.setText("PULSADO JUEVES");
                }else if (checkedId == R.id.radioButton5) {
                    textView.setText("PULSADO VIERNES");
                }else if (checkedId == R.id.radioButton6) {
                    textView.setText("PULSADO SÁBADO");
                }else if (checkedId == R.id.radioButton7) {
                    textView.setText("PULSADO DOMINGO");
                }

            }
        });
    }
}