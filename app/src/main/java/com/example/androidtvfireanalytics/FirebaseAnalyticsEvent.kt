package com.example.androidtvfireanalytics


import android.content.Context
import android.os.Bundle
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics
import com.google.firebase.analytics.setConsent

class FirebaseAnalyticsEvent {

    fun sendEvent(
        name: String? = null,
        context: Context? = null
    ) {
        val param = Bundle()
        if (name != null) {
            param.putString("screenIdKey", name + "idKey")
            param.putString("screenTitleKey",  name + "titleKey")
        }

        if (context != null) {
            val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
            param.putString("full_text", "text")
            param.putString("画面ID", "NameText")
            param.putString("画面タイトル", "NameClassText")

            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.LOGIN, param)
        }
    }
}
