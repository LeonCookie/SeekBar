package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var Suwak: SeekBar
        lateinit var mapa: ImageView

        var l:Float


        mapa = findViewById<ImageView>(R.id.imageViewObrazek)
        Suwak = findViewById<SeekBar>(R.id.seekBar)

        Suwak.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,fromUser: Boolean) {

                //mapa.setRotation(Suwak.progress.toFloat())

                l = (progress.toFloat()/10)
                mapa.alpha= l

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }



}