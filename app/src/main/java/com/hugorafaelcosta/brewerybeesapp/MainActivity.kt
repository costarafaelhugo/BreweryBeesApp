package com.hugorafaelcosta.brewerybeesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

import com.hugorafaelcosta.brewerybeesapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}