package com.kachexiongdi.qkljetpackmvvm.adapter

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.kachexiongdi.qkljetpackmvvm.R

/**
 *   author : qiukailong
 *   date   : 2021/4/30  2:27 PM
 *   desc   :
 */
object ImageViewAdapter {
    @BindingAdapter("android:src")
    @JvmStatic
    fun setSrc(view: ImageView, bitmap: Bitmap) {
        view.setImageBitmap(bitmap)
    }

    @BindingAdapter("android:src")
    @JvmStatic
    fun setSrc(view: ImageView, resId: Int) {
        view.setImageResource(resId)
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun setSrc(view: ImageView, imageUrl: String) {
        Glide.with(view.context).load(imageUrl)
            .into(view)
    }

    @BindingAdapter("app:imageUrl", "app:placeHolder", "app:error")
    @JvmStatic
    fun setSrc(
        view: ImageView,
        imageUrl: String,
        holderDrawable: Int,
        errorDrawable: Int
    ) {
        Glide.with(view.context).load(imageUrl)
            .placeholder(holderDrawable)
            .error(errorDrawable)
            .into(view)
    }
}