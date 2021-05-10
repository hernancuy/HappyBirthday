package com.example.happybirthday

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.cancion)
        mediaPlayer.start()
    }


}