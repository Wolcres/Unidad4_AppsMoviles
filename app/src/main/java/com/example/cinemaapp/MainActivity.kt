package com.example.cinemaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://afaga.com/wp-content/uploads/2019/10/1-International-Union-of-Cinemas-Calls-for-Open-Standards-in-the-Cinema-Industry.jpg", "Cinema Reservacion"))
        list.add(CarouselItem("https://assets.cinemark-core.com/5db771be04daec00076df3f5/content/covers/5e62d726ee924500081e4dc4/desktop/preventa-encanto-1637181623947.jpg", "Encanto"))
        list.add(CarouselItem("https://es.web.img3.acsta.net/pictures/21/11/15/18/17/0807353.jpg", "Spiderman No Way Home"))
        list.add(CarouselItem("https://archivos-cms.cinecolombia.com/images/_aliases/exhibition_embed/1/4/9/0/20941-1-esl-CO/100x510.jpg", "Dune"))
        carousel.addData(list)


    }
}