package com.example.tema5act3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    CheckBox checkBox1;
    CheckBox checkBox2;
    Button boton;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializamos los componentes
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        boton = findViewById(R.id.button);
        resultado = findViewById(R.id.resultado);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenemos los valores de los EditText como enteros
                String valor1 = editText1.getText().toString();
                String valor2 = editText2.getText().toString();

                // Validamos que ambos EditText contengan números
                if (!valor1.isEmpty() && !valor2.isEmpty()) {
                    int num1 = Integer.parseInt(valor1);
                    int num2 = Integer.parseInt(valor2);
                    String resultadoTexto = "";

                    // Verificamos el estado de cada CheckBox
                    if (checkBox1.isChecked()) {
                        resultadoTexto += (sumar(num1, num2)) + " ";
                    }
                    if (checkBox2.isChecked()) {
                        resultadoTexto += (restar(num1, num2));
                    }

                    // Mostramos el resultado en el TextView
                    resultado.setText(resultadoTexto);
                } else {
                    resultado.setText("Por favor, ingrese ambos números.");
                }
            }
        });
    }

    // Métodos para sumar y restar
    public String sumar(int a, int b) {
        int res = a + b;
        return "La suma es: " + res;
    }

    public String restar(int a, int b) {
        int res = a - b;
        return "La resta es: " + res;
    }
}
