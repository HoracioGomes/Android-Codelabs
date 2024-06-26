package com.horacio.androidcodelabs.extensions

import android.view.View
import android.view.animation.Animation

fun View.startAnimation(anim: Animation, onEnd: () -> Unit) {
    anim.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(animation: Animation?) = Unit

        override fun onAnimationEnd(animation: Animation?) = onEnd()

        override fun onAnimationRepeat(animation: Animation?) = Unit

    })

    this.startAnimation(anim)
}

fun View.setVisible(show: Boolean) {
    if (show) this.visibility = View.VISIBLE else this.visibility = View.GONE
}