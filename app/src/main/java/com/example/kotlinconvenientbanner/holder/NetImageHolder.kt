package com.example.kotlinconvenientbanner.holder

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bigkoo.convenientbanner.holder.Holder
import com.example.kotlinconvenientbanner.R
import com.squareup.picasso.Picasso

/**
 * Created by admin on 2017/12/5.
 */

class NetImageHolder : Holder<String> {
     lateinit var imageView: ImageView

    override fun createView(context: Context): View {
        imageView = ImageView(context)
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        return imageView
    }

    override fun UpdateUI(context: Context, position: Int, data: String) {
        Picasso.with(context).load(data).placeholder(R.drawable.ic_default_adimage).error(R.drawable.ic_default_adimage).into(imageView)
    }
}
