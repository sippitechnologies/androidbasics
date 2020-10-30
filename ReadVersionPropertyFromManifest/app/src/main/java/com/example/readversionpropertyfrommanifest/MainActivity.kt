package com.example.readversionpropertyfrommanifest

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val packageManager = this.packageManager
        val packageInfo= packageManager.getPackageInfo(this.packageName,PackageManager.GET_ACTIVITIES)
        Log.d("Version Code:",packageInfo.versionName)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            Log.d("Version Name:",packageInfo.longVersionCode.toString())
        }
        else
        {
            Log.d("Version Name:",packageInfo.versionCode.toString())
        }
    }
}