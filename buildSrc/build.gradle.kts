plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
}
