package kr.co.androidstudy.nyous.ui.activity

import android.animation.*
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import android.view.animation.AccelerateInterpolator
import kr.co.androidstudy.nyous.R
import kr.co.androidstudy.nyous.ui.vm.NyousViewModel

class MainActivity : BaseActivity() {


    private lateinit var model: NyousViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showTitleBar(false)
        setContentView(R.layout.activity_main)
    }

    private fun testPost() {
//        model = getViewModel()
//        lifecycle.addObserver(model)
    }

    private fun getViewModel(): NyousViewModel {
        return ViewModelProviders.of(this).get(NyousViewModel::class.java)
    }
}
