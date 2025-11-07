plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.betabudget"
    compileSdk {
        version = release(36)

    }

    defaultConfig {
        applicationId = "com.example.betabudget"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            getByName("release") {
                isMinifyEnabled = true // Set this to true
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // --- ADD RETROFIT AND GSON ---
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // --- ADD OKHTTP (for logging network requests) ---
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    // ... (your existing dependencies)
    implementation("androidx.fragment:fragment-ktx:1.6.2")

    // Add Firebase Storage
    implementation("com.google.firebase:firebase-storage-ktx")

    // Add Glide for loading images from a URL
    implementation("com.github.bumptech.glide:glide:4.16.0")


}