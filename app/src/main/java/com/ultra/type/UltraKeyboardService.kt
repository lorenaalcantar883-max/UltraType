package com.ultra.type
import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class UltraKeyboardService : InputMethodService() {
    override fun onCreateInputView(): View {
        val layout = LinearLayout(this).apply {
            setBackgroundColor(0xFFDDDDDD.toInt())
        }
        val btnType = Button(this).apply {
            text = "AUTO TYPE"
            setOnClickListener {
                val ic = currentInputConnection
                val text = "Hello, this is human-like typing."
                Thread {
                    for (char in text) {
                        ic?.commitText(char.toString(), 1)
                        Thread.sleep((60..150).random().toLong())
                    }
                }.start()
            }
        }
        layout.addView(btnType)
        return layout
    }
}
