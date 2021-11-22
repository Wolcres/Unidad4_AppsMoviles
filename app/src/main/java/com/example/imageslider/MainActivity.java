package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.one,
    R.drawable.two,
    R.drawable.three,
    R.drawable.four,
    //R.drawable.five,
    R.drawable.six};
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity3.class));
            }
        });

    }

    public void Cartelera(View view){

        Intent Cartelera = new Intent(this, MainActivity2.class);
        startActivity(Cartelera);

    }

    public void Creditos(View view){

        Intent Creditos = new Intent(this, MainActivity3.class);
        startActivity(Creditos);

    }



}