package com.sippitechnologies.videoview

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        val uri = "android.resource://"+packageName+"/"+R.raw.calendarview
        videoView.setVideoURI(Uri.parse(uri))
        videoView.start()
        videoView.setOnCompletionListener {
            Toast.makeText(this@MainActivity,"Video is Completed",Toast.LENGTH_LONG).show()
        }
        videoView.setOnErrorListener(MediaPlayer.OnErrorListener { mediaPlayer, i, i2 ->
            Toast.makeText(this@MainActivity,"Error in Video Playing",Toast.LENGTH_LONG).show()

            true
        })


    }
}