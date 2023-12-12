package com.example.androidtvfireanalytics

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FirebaseAnalyticsEvent().sendEvent("test")
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()
        }
    }
}