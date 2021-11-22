package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView textView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.creditos);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Creditos\n\n"+"Autor: Daniel Arboleda Cuervo\n\n"+"Correo: arboleda.daniel785@gmail.com\n\n"+"Hobbies: Jugar videojuegos, salir y\n comer sandwiches de mantequilla de maní");

        textView.startAnimation(animation);


    }
}