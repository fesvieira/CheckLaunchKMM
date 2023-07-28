package com.fesvieira.checklaunchkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform