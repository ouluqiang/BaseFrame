package com.fariso.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olq.baseframe.AppUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        AppUtils.getAppSHA(this)
    }
}