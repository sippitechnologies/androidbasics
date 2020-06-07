package com.sippitechnologies.sharedpreferencedemo

import android.content.Context
import android.content.SharedPreferences

class AppPreferenceManager(context:Context) {
    object PREF_KEYS {
        const val LOGIN_STATUS= "status"
        const val PREFERENCE_KEY= "APP_PREFERENCE"
    }
    var sharedPreferences:SharedPreferences
    var editor:SharedPreferences.Editor
    init {
        sharedPreferences = context.getSharedPreferences(PREF_KEYS.PREFERENCE_KEY,Context.MODE_PRIVATE)
        editor=sharedPreferences.edit()
    }
    fun logout()
    {
        editor.clear()
        editor.commit()
    }
    fun isLoggedIn():Boolean
    {
       return sharedPreferences.getBoolean(PREF_KEYS.LOGIN_STATUS,false)
    }
    fun setLoggedInStatus(value:Boolean)
    {
        editor.putBoolean(PREF_KEYS.LOGIN_STATUS,value)
        editor.commit()
    }
}