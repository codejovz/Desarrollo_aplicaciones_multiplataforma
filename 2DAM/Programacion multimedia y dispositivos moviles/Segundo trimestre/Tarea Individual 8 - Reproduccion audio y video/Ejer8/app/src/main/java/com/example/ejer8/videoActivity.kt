package com.example.ejer8

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class videoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_video)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val videoView: VideoView = findViewById(R.id.videoView)

        val  videoUrl:String="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
        val videoUri:Uri = Uri.parse(videoUrl)
        videoView.setVideoURI(videoUri)

        val tvVideoState: TextView = findViewById(R.id.tvVideoState)

        val btnVideoPause:Button = findViewById(R.id.btnVideoPause)
        btnVideoPause.setOnClickListener{
            videoView.pause()
            tvVideoState.text="Paused"

        }

        val btnVideoPlay:Button = findViewById(R.id.btnVideoPlay)
        btnVideoPlay.setOnClickListener{
            videoView.start()
            tvVideoState.text="Playing"
        }


    }
}