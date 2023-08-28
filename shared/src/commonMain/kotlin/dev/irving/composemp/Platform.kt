package dev.irving.composemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform