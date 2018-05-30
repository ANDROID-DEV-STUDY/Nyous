package kr.co.androidstudy.nyous.ui.activity

import android.animation.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.view.View
import android.view.animation.AccelerateInterpolator
import kr.co.androidstudy.nyous.R

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showTitleBar(false)
        setContentView(R.layout.activity_main)
    }
}
