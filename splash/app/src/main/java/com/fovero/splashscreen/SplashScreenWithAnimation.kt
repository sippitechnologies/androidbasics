package com.fovero.splashscreen

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class SplashScreenWithAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val packageInfo = packageManager.getPackageInfo(this.packageName,PackageManager.GET_ACTIVITIES)
        val versionCode = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            packageInfo.longVersionCode
        } else {
            packageInfo.versionCode
        }
        val versionDisplayName = packageInfo.versionName
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        supportActionBar?.hide()
        val animationforSplash = AnimationUtils.loadAnimation(this,R.anim.zoom_inout)
        animationforSplash.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationEnd(p0: Animation?) {
                val intent = Intent(this@SplashScreenWithAnimation,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }

            override fun onAnimationStart(p0: Animation?) {

            }
        })
        imageView.startAnimation(animationforSplash)

        txt_version_number.text = "Version ${versionDisplayName}"

    }



}
