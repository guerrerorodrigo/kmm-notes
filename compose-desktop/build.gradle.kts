import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose") version Versions.composeDesktop
    application
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":common"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

application {
    mainClass.set("MainKt")
}
