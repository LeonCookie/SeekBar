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
        lateinit var Suwak2: SeekBar
        lateinit var mapa: ImageView


        var a:Float
        var b:Float




        mapa = findViewById<ImageView>(R.id.imageViewObrazek)
        Suwak = findViewById<SeekBar>(R.id.seekBar)
        Suwak2 = findViewById<SeekBar>(R.id.seekBar2)

        Suwak.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,fromUser: Boolean) {

                //mapa.setRotation(Suwak.progress.toFloat())


                a = (progress.toFloat())
                mapa.rotation= a.toFloat()


            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        Suwak2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,fromUser: Boolean) {

                //mapa.setRotation(Suwak.progress.toFloat())

                b = (progress.toFloat())

                mapa.rotationY= b.toFloat()


            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }



}