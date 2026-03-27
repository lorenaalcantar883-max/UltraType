package com.ultra.type

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // إنشاء واجهة بسيطة برمجياً
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50, 50, 50, 50)
        }

        val title = TextView(this).apply {
            text = "UltraType Dashboard"
            textSize = 24f
            setPadding(0, 0, 0, 50)
        }

        val btnEnable = Button(this).apply {
            text = "1. Enable Keyboard"
            setOnClickListener {
                startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS))
            }
        }

        val btnSelect = Button(this).apply {
            text = "2. Select UltraType"
            setOnClickListener {
                val imeManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imeManager.showInputMethodPicker()
            }
        }

        layout.addView(title)
        layout.addView(btnEnable)
        layout.addView(btnSelect)
        setContentView(layout)
    }
}
