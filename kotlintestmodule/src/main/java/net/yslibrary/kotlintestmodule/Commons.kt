package net.yslibrary.kotlintestmodule

import android.app.Activity
import android.widget.Toast

/**
 * Created by yshrsmz on 17/10/04.
 */
fun test(): String {
    return "test function"
}

fun Activity.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
