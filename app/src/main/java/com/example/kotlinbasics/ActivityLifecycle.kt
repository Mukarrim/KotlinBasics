package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityLifecycle : AppCompatActivity() {

    private val TAG: String = "MainActivity"

    /*
        * Creating the references of resources to be used
        * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "OnCreate: Creating the references of resources to be used")
        finish()
    }

    /*
    * Makes sure all the resources are allocated
    * */
    override fun onStart() {
        super.onStart()

        Log.d(TAG, "OnStart: Makes sure all the resources are allocated")
    }

    /*
    * User gets to see and interact with the Activity
    * */
    override fun onResume() {
        super.onResume()

        Log.d(TAG, "OnResume: User gets to see and interact with the Activity")
    }

    /*
    * Holds/Pauses the activity until further instruction
    * Either OnResume or OnStop
    * */
    override fun onPause() {
        super.onPause()

        Log.d(TAG, "OnPause: Holds/Pauses the activity until further instruction")
    }

    /*
    * Makes sure that all the resources are removed
    * */
    override fun onStop() {
        super.onStop()

        Log.d(TAG, "OnStop: Makes sure that all the resources are removed")
    }

    /*
    * Remove the Activity reference itself
    * Removing the existence of Activity
    * */
    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "OnDestroy: Remove the Activity reference itself")
    }


}