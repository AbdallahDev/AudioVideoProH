package com.example.abdallahsarayrah.audiovideoproh

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_audio.*

class AudioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)
        val audio = MediaPlayer()
        var indexPlayPause: Boolean = true
        var indexStop: Boolean = false//this mean the stop button not pressed yet
        audio.setDataSource("http://audio3.islamweb.net/adan/457131.mp3")
        audio.prepare()

        buttonPlayPause.setOnClickListener {
            when {
                indexStop -> {//this if the stop button has been pressed
                    audio.prepare()
                    when {
                        indexPlayPause -> {
                            audio.start()
                            indexPlayPause = false
                            buttonPlayPause.setBackgroundResource(R.drawable.pause_icon)
                            buttonPlayPause.width = 400
                        }
                        !indexPlayPause -> {
                            audio.pause()
                            indexPlayPause = true
                            buttonPlayPause.setBackgroundResource(R.drawable.play_icon)
                        }
                    }
                    indexStop = false
                }
                !indexStop -> {//when the stop button not pressed yet
                    when {
                        indexPlayPause -> {
                            audio.start()
                            indexPlayPause = false
                            buttonPlayPause.setBackgroundResource(R.drawable.pause_icon)
                            buttonPlayPause.width = 400
                        }
                        !indexPlayPause -> {
                            audio.pause()
                            indexPlayPause = true
                            buttonPlayPause.setBackgroundResource(R.drawable.play_icon)
                        }
                    }
                }
            }
        }

        buttonStop.setOnClickListener {
            audio.stop()
            indexPlayPause = true
            indexStop = true//this to indicate that the stop button has been pressed
            buttonPlayPause.setBackgroundResource(R.drawable.play_icon)
        }
    }


}
