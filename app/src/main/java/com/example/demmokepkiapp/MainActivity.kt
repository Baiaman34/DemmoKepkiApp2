package com.example.demmokepkiapp

import ImageSlideAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val viewPagerAdapter = ImageSlideAdapter(this, arrayListOf(R.drawable.cap2,R.drawable.cap3,R.drawable.cap4,R.drawable.cap5))
            findViewById<ViewPager>(R.id.cap).adapter = viewPagerAdapter
            val indicator = findViewById<CircleIndicator>(R.id.indicator)
            indicator.setViewPager(findViewById(R.id.cap))
    }
}