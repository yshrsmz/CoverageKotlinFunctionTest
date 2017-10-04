package net.yslibrary.coveragekotlinfunctiontest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.yslibrary.kotlintestmodule.test
import net.yslibrary.kotlintestmodule.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        toast("this is test")
    }
}
