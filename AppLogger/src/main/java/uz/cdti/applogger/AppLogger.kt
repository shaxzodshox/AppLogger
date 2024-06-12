package uz.cdti.applogger

import android.util.Log

object AppLogger {
    fun log(message: String, tag: String = "AppLogger"){
        Log.d(tag, message)
    }
}