package com.example.calculator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.setBackgroundColor(Color.TRANSPARENT);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("file:///android_asset/index.html");
        setContentView(w);
    }
}
