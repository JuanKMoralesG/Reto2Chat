package com.example.reto2chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animacion_personalizada);

        // Asignar un Listener a la animación
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // La animación ha comenzado
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                //La animación se ha repetido
            }
        });

        // Iniciar la animación en una vista específica
        View vistaAnimada = findViewById(R.id.vista_animada); // Reemplaza R.id.vista_animada con el ID de tu vista
        vistaAnimada.startAnimation(animation);
    }
}