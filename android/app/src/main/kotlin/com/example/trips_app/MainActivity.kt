package com.example.trips_app

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)
        this.getWindow().setStatusBarColor(android.graphics.Color.TRANSPARENT);
    }
}
