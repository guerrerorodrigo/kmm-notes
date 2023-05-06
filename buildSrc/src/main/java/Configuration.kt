object Config {
    object Android {
        const val min = 21
        const val compile = 33
        const val target = compile
        const val versionCode = 1
        const val versionName = "1.0.0"
    }

    object iOS {
        const val appName = "AppName"
    }

    object Web {
        const val appName = "AppName" // Update import name in load.mjs to match this name
    }
}
