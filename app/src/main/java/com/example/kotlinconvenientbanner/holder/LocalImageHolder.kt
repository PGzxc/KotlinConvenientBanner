package com.example.kotlinconvenientbanner.holder

import android.content.Context
import android.view.View
import android.widget.ImageView

import com.bigkoo.convenientbanner.holder.Holder

/**
 * Created by admin on 2017/12/5.
 */

class LocalImageHolder : Holder<Int> {
    internal lateinit var imageView: ImageView

    override fun createView(context: Context): View {
        imageView = ImageView(context)
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        return imageView
    }

    override fun UpdateUI(context: Context, position: Int, data: Int?) {
        imageView.setImageResource(data!!)

    }
}
