package com.app.trackify

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform