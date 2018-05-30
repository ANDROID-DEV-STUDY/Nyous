package kr.co.androidstudy.nyous.ui.activity

import android.animation.*
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import android.view.animation.AccelerateInterpolator
import kr.co.androidstudy.nyous.R

/**
 * Created by leejongjin on 2018. 5. 25..
 */

class SplashActivity : BaseActivity() {


    companion object {
        val DEFAULT_ANIMATION_DURATION = 1000L

        val PENTAGON_WIDTH = 2.618f

        val PENTAGON_SIDE = 1.618f

        val STAR_EDGE_SIDE = 1f

        val PENTAGON_MID_HEIGHT = 1.538f

        val PENTAGON_HEIGHT = 2.489f
    }

    protected var screenHeight = 0f

    protected var screenWidth = 0f

    protected lateinit var androidLogo: View

    protected lateinit var backLayout: View

    protected lateinit var mainLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showTitleBar(false)
        setContentView(R.layout.activity_splash)
        androidLogo = findViewById(R.id.splash_logo_img)
        backLayout = findViewById(R.id.splash_back_layout)
        mainLayout = findViewById(R.id.splash_main_layout)

        startAnimation()

//        backLayout.setOnClickListener{ startAnimation() }
    }

    fun startAnimation () {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            screenWidth = displayMetrics.widthPixels.toFloat()
            screenHeight = displayMetrics.heightPixels.toFloat()
        } else {
            screenWidth = displayMetrics.heightPixels.toFloat()
            screenHeight = displayMetrics.widthPixels.toFloat()
        }

//        Log.e("SplashActivity", "screenHeight = " + screenHeight + " screenWidth = " + screenWidth)
//        Log.e("SplashActivity", "androidLogo width = " + androidLogo.layoutParams.width + " androidLogo height = " + androidLogo.layoutParams.height)

        val animatorX = ValueAnimator.ofFloat(0f, ((screenWidth * (PENTAGON_SIDE + (STAR_EDGE_SIDE / 2)) / PENTAGON_WIDTH) - (androidLogo.layoutParams.width)), -(((screenWidth * (STAR_EDGE_SIDE / 2)) / PENTAGON_WIDTH) - (androidLogo.layoutParams.width / 3))
                , (screenWidth * PENTAGON_SIDE) / PENTAGON_WIDTH, ((screenWidth * (PENTAGON_SIDE / 2)) / PENTAGON_WIDTH), 0f, ((((screenWidth * PENTAGON_SIDE / 2) / PENTAGON_WIDTH) - ((androidLogo.layoutParams.width) / 3))))

        val animatorY = ValueAnimator.ofFloat(0f, - (screenWidth * PENTAGON_MID_HEIGHT / PENTAGON_HEIGHT), - (screenWidth * PENTAGON_MID_HEIGHT / PENTAGON_HEIGHT), 0f
                , - screenWidth, 0f, - ((((screenWidth * PENTAGON_HEIGHT / 2) / PENTAGON_HEIGHT) - (androidLogo.layoutParams.height) )))

        animatorX.addUpdateListener { androidLogo.translationX = it.animatedValue as Float }
        animatorY.addUpdateListener { androidLogo.translationY = it.animatedValue as Float }

        val animatorSet = AnimatorSet()
        animatorSet.play(animatorX).with(animatorY)
        animatorSet.duration = 2000L
        animatorSet.addListener(object :  Animator.AnimatorListener {
            override fun onAnimationRepeat(p0: Animator?) {
            }

            override fun onAnimationEnd(animator: Animator?) {
                val rotationAnimator = ObjectAnimator.ofFloat(androidLogo, "rotation", 0f, 360f)
                rotationAnimator.duration = DEFAULT_ANIMATION_DURATION
                rotationAnimator.repeatCount = 1

                val objectAnimator = ObjectAnimator.ofObject(
                        mainLayout,
                        "backgroundColor",
                        ArgbEvaluator(),
                        ContextCompat.getColor(this@SplashActivity, R.color.colorPrimaryDark),
                        ContextCompat.getColor(this@SplashActivity, R.color.colorAccent)
                )

                objectAnimator.repeatCount = 1
                objectAnimator.repeatMode = ValueAnimator.REVERSE

                objectAnimator.duration = DEFAULT_ANIMATION_DURATION

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(rotationAnimator, objectAnimator)
                animatorSet.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(p0: Animator?) {
                    }

                    override fun onAnimationCancel(p0: Animator?) {
                    }

                    override fun onAnimationStart(p0: Animator?) {
                    }

                    override fun onAnimationEnd(p0: Animator?) {
                        val intent = Intent(this@SplashActivity, MainActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP )
                        this@SplashActivity.startActivity(intent)
                        this@SplashActivity.finish()
                    }

                })
                animatorSet.start()

            }

            override fun onAnimationCancel(p0: Animator?) {
            }

            override fun onAnimationStart(p0: Animator?) {
            }

        })
        animatorSet.start()
    }

    override fun onResume() {
        super.onResume()
    }
}