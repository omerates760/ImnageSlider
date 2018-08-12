package com.example.omera.videoslider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

            internal lateinit var viewpager :ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager=findViewById(R.id.viewpager) as ViewPager
        val adapter=sliderAdapter(this)
        viewpager.adapter=adapter
    }



}


