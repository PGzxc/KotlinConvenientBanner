package com.example.kotlinconvenientbanner.ui

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.bigkoo.convenientbanner.ConvenientBanner
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator
import com.bigkoo.convenientbanner.listener.OnItemClickListener
import com.example.kotlinconvenientbanner.holder.NetImageHolder
import com.example.kotlinconvenientbanner.R
import com.example.kotlinconvenientbanner.utils.Utils

import java.util.Arrays

/**
 * Created by admin on 2017/12/5.
 */

class ViewPagerNetActivity : AppCompatActivity(), ViewPager.OnPageChangeListener, OnItemClickListener {
    private var bannerNet: ConvenientBanner<Any>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net)
        initView()
        initData()
    }


    private fun initView() {
        bannerNet = findViewById<ConvenientBanner<Any>>(R.id.banner_net)
    }

    private fun initData() {
        bannerNet!!.setPages(CBViewHolderCreator { NetImageHolder() }, Arrays.asList<Any>(*Utils.images))
                .setPageIndicator(intArrayOf(R.drawable.ic_page_indicator, R.drawable.ic_page_indicator_focused))
                .setOnPageChangeListener(this)
                .setOnItemClickListener(this)

    }

    override fun onResume() {
        super.onResume()
        bannerNet!!.startTurning(3000)
    }

    override fun onPause() {
        super.onPause()
        bannerNet!!.stopTurning()
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

    companion object {
        private val TAG = ViewPagerNetActivity::class.java.simpleName
    }
}
