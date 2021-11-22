package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity implements  View.OnClickListener{

    ImageView movieImageView;
    TextView tituloTextView;
    TextView directorTextView;
    TextView generoTextView;
    TextView actoresTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        movieImageView = (ImageView) findViewById(R.id.movie_image);
        tituloTextView = (TextView) findViewById(R.id.titulo);
        directorTextView = (TextView) findViewById(R.id.director);
        generoTextView = (TextView) findViewById(R.id.genero);


        Button buttonEncanto = (Button) findViewById(R.id.encanto_button);
        Button buttonClifford = (Button) findViewById(R.id.clifford_button);
        Button buttonResident = (Button) findViewById(R.id.resident_button);
        Button buttonSpiderman = (Button) findViewById(R.id.spiderman_button);
        Button buttonCazafantasmas = (Button) findViewById(R.id.cazafantasmas_button);
        Button buttonDune = (Button) findViewById(R.id.dune_button);

        buttonEncanto.setOnClickListener(this);
        buttonClifford.setOnClickListener(this);
        buttonResident.setOnClickListener(this);
        buttonSpiderman.setOnClickListener(this);
        buttonCazafantasmas.setOnClickListener(this);
        buttonDune.setOnClickListener(this);

        tituloTextView.setText("Título de la película");
        directorTextView.setText("Nombre del director");
        generoTextView.setText("Nombre del género");
        actoresTextView.setText("Nombre de los actores");

    }

    @Override
    public void onClick(View buttonView) {

        int buttonId = buttonView.getId();
        int imageId;
        switch (buttonId) {
            case R.id.encanto_button:
                imageId = R.drawable.one;
                tituloTextView.setText("Encanto");
                directorTextView.setText("Byron Howard");
                actoresTextView.setText("Stephanie Beatriz, María Cecilia Botero");
                generoTextView.setText("Animación");
                break;

            case R.id.clifford_button:
                imageId = R.drawable.two;
                tituloTextView.setText("Clifford");
                directorTextView.setText("Walt Becker");
                actoresTextView.setText("Jack Whitehall, Darby Camp");
                generoTextView.setText("Aventura");
                break;

            case R.id.resident_button:
                imageId = R.drawable.three;
                tituloTextView.setText("Resident Evil");
                directorTextView.setText("Johannes Roberts");
                actoresTextView.setText("Kaya Scodelario, Hannah John-Kamen");
                generoTextView.setText("Acción");
                break;

            case R.id.spiderman_button:
                imageId = R.drawable.four;
                tituloTextView.setText("Spiderman No Way Home");
                directorTextView.setText("Jon Watts");
                actoresTextView.setText("Tom Holland, Zendaya, Benedict Cumberbatch");
                generoTextView.setText("Cine de superhéroes");
                break;



            case R.id.cazafantasmas_button:
                imageId = R.drawable.five;
                tituloTextView.setText("Caza Fantasmas");
                directorTextView.setText("Jason Reitman");
                actoresTextView.setText("Mckenna Grace, Finn Wolfhard");
                generoTextView.setText("Aventura");
                break;

            case R.id.dune_button:
                imageId = R.drawable.six;
                tituloTextView.setText("Dune");
                directorTextView.setText("Denis Villeneuve");
                actoresTextView.setText("Timothée Chalamet, Rebecca Ferguson, Zendaya");
                generoTextView.setText("Ciencia Ficción");
                break;
            default:
                imageId = 0;
        }

        if (imageId != 0) {
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this, imageId));
        }

    }

    public void Anterior(View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);

    }

}