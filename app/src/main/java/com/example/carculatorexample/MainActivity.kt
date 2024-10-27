package com.example.carculatorexample

import android.content.res.Configuration
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.WindowCompat
import com.example.carculatorexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListener()

    }

    // 클릭리스너 초기화
    private fun setClickListener() {

        // 모드 버튼 클릭 리스너
        binding.buttonMode.setOnClickListener{

            updateDarkMode()

        }

    }

    // 다크모드 업데이트 메서드
    private fun updateDarkMode() {

        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

        if (currentNightMode == Configuration.UI_MODE_NIGHT_YES) {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO) // 낮 모드로 변경

        } else {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) // 밤 모드로 변경

        }

    } // updateDarkMode()

}