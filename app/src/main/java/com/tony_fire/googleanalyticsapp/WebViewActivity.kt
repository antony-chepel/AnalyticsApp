package com.tony_fire.googleanalyticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.tony_fire.googleanalyticsapp.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        getUrlIntent()
    }

    fun getUrlIntent(){
        val i = intent
        val myWebView: WebView = findViewById(R.id.webview)
        val url = i.getStringExtra("Url")
        myWebView.loadUrl("$url")

    }
}