package com.example.kotlinmultiplatformdemo

class AndroidPlatform : Platform {
    override val name: String = "${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()