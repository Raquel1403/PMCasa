package com.example.animacion;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Alfa1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfa1);

        // Cargar el cuadrado
        View squareView = findViewById(R.id.my_square);

        // Cargar la animación de rotación
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_alfa1);

        // Iniciar la animación
        squareView.startAnimation(rotateAnimation);
    }
}
