package com.example.ejer8

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.IOException

class audioActivity : AppCompatActivity() {

    private lateinit var audioManager: AudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_audio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvAudioState:TextView = findViewById(R.id.tvAudioState)

        val uri:String = "https://www.learningcontainer.com/wp-content/uploads/2020/02/Sample-OGG-File.ogg"

        val audioUri:Uri = Uri.parse(uri)

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, audioUri)

        val btnAudioPlay:Button = findViewById(R.id.btnAudioPlay)
        btnAudioPlay.setOnClickListener{

            tvAudioState.text="Playing"

            if(!mediaPlayer.isPlaying()){
                mediaPlayer.start()
            }

        }

        val btnAudioStop:Button = findViewById(R.id.btnAudioStop)
        btnAudioStop.setOnClickListener{
            tvAudioState.text="Stopped"

            if(mediaPlayer.isPlaying()){
                mediaPlayer.stop()
                mediaPlayer.prepare()
            }

        }

        audioManager =getSystemService(AUDIO_SERVICE) as AudioManager


        val btnSilence:Button = findViewById(R.id.btnSilence)
        btnSilence.setOnClickListener{

            audioManager.adjustVolume(AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI)

        }


        val btnIncrease:Button = findViewById(R.id.btnIncrease)
        btnIncrease.setOnClickListener{

            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI)

        }

        val btnDecrease:Button = findViewById(R.id.btnDecrease)
        btnDecrease.setOnClickListener{

            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI)

        }

    }

}