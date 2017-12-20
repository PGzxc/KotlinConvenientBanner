package com.example.kotlinconvenientbanner.ui

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

import com.bigkoo.convenientbanner.ConvenientBanner
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator
import com.bigkoo.convenientbanner.listener.OnItemClickListener
import com.example.kotlinconvenientbanner.holder.LocalImageHolder
import com.example.kotlinconvenientbanner.R
import com.example.kotlinconvenientbanner.utils.Utils

import java.util.ArrayList

/**
 * Created by admin on 2017/12/5.
 */

class ViewPagerLocalActivity : AppCompatActivity(), ViewPager.OnPageChangeListener, OnItemClickListener {
    private val images = ArrayList<Any>()
    private var banner: ConvenientBanner<Any>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local)
        initView()
        initData()
    }

    private fun initView() {
        banner = findViewById<ConvenientBanner<Any>>(R.id.banner)
    }

    private fun initData() {

        for (i in 0..6) {
            images.add(Utils.getResId("ic_test_" + i, R.drawable::class.java))
        }

        banner!!.setPages(CBViewHolderCreator { LocalImageHolder() }, images)
                .setPageIndicator(intArrayOf(R.drawable.ic_page_indicator, R.drawable.ic_page_indicator_focused))
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setOnPageChangeListener(this)
                .setOnItemClickListener(this)

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        Log.d(TAG, "监听到翻到第" + position + "了")
    }

    override fun onPageScrollStateChanged(state: Int) {

    }


    override fun onItemClick(position: Int) {
        Toast.makeText(this, "点击了第：" + position + "个", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        banner!!.startTurning(3000)
    }

    override fun onPause() {
        super.onPause()
        banner!!.stopTurning()
    }

    companion object {

        private val TAG = ViewPagerLocalActivity::class.java.simpleName
    }
}
