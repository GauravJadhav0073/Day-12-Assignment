package com.example.day12assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Android : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val webset = findViewById<WebView>(R.id.webview)
        websetup(webset)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun websetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://developer.android.com/?gclid=CjwKCAjw5dqgBhBNEiwA7PryaKTa4L4ETknOmrnB1jpXOS1ta0_Q6rLlwP9hm5xRPz4t1Ic5FYQ7gRoCtWwQAvD_BwE&gclsrc=aw.ds")
        }

    }
}