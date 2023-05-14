package com.example.submissionaplikasiandroidsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.CollapsibleActionView
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.appbar.CollapsingToolbarLayout

class details_activity : AppCompatActivity() {

    companion object{
        const val nama_players = "name_players"
        const val details_players = "details_players"
        const val photo_players = "photo_players"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val img : ImageView = findViewById(R.id.photo_player)
        val text1 : TextView = findViewById(R.id.name_player)
        val text2 : TextView = findViewById(R.id.details_player)

        val getText1 = intent.getStringExtra(nama_players)
        val getText2 = intent.getStringExtra(details_players)
        val getImg = intent.getIntExtra(photo_players, 0)

        val resultText1 = getText1
        text1.text = resultText1
        val resultText2 = getText2
        text2.text = resultText2
        val resultPhoto = getImg
        img.setImageResource(resultPhoto)

        supportActionBar?.title = resultText1


    }

}