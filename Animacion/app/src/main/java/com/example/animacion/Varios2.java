
package com.example.animacion;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;


public class Varios2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) s{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varios2);

        // Cargar el cuadrado
        View squareView = findViewById(R.id.my_square);

        // Cargar la animación de rotación
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.animacion_varios2);

        // Iniciar la animación
        squareView.startAnimation(rotateAnimation);
    }
}