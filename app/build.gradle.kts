plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Config.Android.compile

    defaultConfig {
        applicationId = Namespaces.android
        minSdk = Config.Android.min
        targetSdk = Config.Android.target

        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }


    packagingOptions {
        resources.excludes.add("META-INF/licenses/**")
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
    namespace = Namespaces.android
}

dependencies {
    with(Android.AndroidX) {
        implementation(lifecycleRuntimeCompose)
        implementation(lifecycleRuntimeKtx)
        implementation(lifecycleViewmodelKtx)
        implementation(activityCompose)
        implementation(material3)
        implementation(material3WindowSizeClass)
    }

    with(Compose) {
        implementation(compiler)
        implementation(ui)
        implementation(uiGraphics)
        implementation(foundationLayout)
        implementation(material)
        implementation(navigation)
        implementation(uiTooling)
    }

    implementation(project(":common"))
}
