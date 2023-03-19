package com.example.day12assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Blockchain : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)

        val webset = findViewById<WebView>(R.id.webview)
        websetup(webset)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun websetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true
            loadUrl("https://www.w3schools.com/python/python_ml_getting_started.asp ")
        }
    }
}