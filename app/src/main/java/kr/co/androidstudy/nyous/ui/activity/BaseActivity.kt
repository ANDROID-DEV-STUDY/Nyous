package kr.co.androidstudy.nyous.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Window

/**
 * Created by leejongjin on 2018. 5. 28..
 */
open class BaseActivity : AppCompatActivity() {

    val LOG_TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun showTitleBar(show: Boolean) {
        if (!show) {
            supportActionBar?.hide()
        }
    }
}
