package com.example.cinemaapp;



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

public class Cartelera extends AppCompatActivity implements View.OnClickListener {

    ImageView movieImageView;
    TextView tituloTextView;
    TextView directorTextView;
    TextView generoTextView;
    TextView actoresTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera);

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
    public void onClick(View v) {

    }

}