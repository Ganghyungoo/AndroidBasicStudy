package com.example.fastcampus3

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class WebActivity : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        webview=findViewById(R.id.webview)

        findViewById<Button>(R.id.go).setOnClickListener {
            val url=findViewById<EditText>(R.id.url).text.toString()
            webview.apply {
                webViewClient= WebViewClient()
                settings.javaScriptEnabled=true
            }
            webview.loadUrl(url)
        }
    }


    override fun onBackPressed() {
        if (webview.canGoBack()) { webview.goBack() }
        else { finish() }
    }
}