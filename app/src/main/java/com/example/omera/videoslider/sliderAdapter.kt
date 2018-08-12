package com.example.omera.videoslider

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

class sliderAdapter(private val context: Context) : PagerAdapter() {
    private var layoutInflater:LayoutInflater?=null
    private val images = arrayOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five)
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ===`object`
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v=layoutInflater!!.inflate(R.layout.slider_item,null)
        val image=v.findViewById<View>(R.id.slider_img)
        image.setBackgroundResource(images[position])
        var vp=container as ViewPager
        vp.addView(v,0)
        return v


    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp=container as ViewPager
        val v=`object` as View
        vp.removeView(v)
    }


}