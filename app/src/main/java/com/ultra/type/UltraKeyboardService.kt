package com.ultra.type

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class AutoTypeService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // هنا تحط الكود اللي يعالج الأحداث
    }

    override fun onInterrupt() {
        // هنا تحط الكود لو انقطعت الخدمة
    }
}
