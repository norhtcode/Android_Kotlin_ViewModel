package com.example.android_kotlin_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_kotlin_viewmodel.ui.main.MainFragment

//The main activity provides an empty container (main_activity.xml) space in form of a FrameLayout, in which content will appear.
//The FrameLayout container is just a placeholder which will be replaced at runtime by the content
//of the first screen that is to appear when the app launches. This content will typically take the form of a Fragment (main_fragment.xml).
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {

            //Replaces the FrameLayout placeholder with the a fragment, by replace the object with the id of container with the MainFragment.
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()

        }
    }
}