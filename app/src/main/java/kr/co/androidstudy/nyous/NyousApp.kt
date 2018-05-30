package kr.co.androidstudy.nyous

import android.app.Application

/**
 * Created by leejongjin on 2018. 5. 29..
 */

open class NyousApp : Application() {
    companion object {
        lateinit var application: NyousApp
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}