package com.stepango.blockme.root.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Base activity class that use the support library action bar features.
 *
 * @see AppCompatActivity
 */
class SampleMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("test")
        println("test")
        println("test")
    }
}
