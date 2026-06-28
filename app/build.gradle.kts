plugins {
    alias(libs.plugins.android.application)
    // Plugin untuk memproses file google-services.json
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.money_track"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.money_track"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // UI Dasar & AndroidX
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)

    // Perbaikan kompatibilitas Activity untuk SDK 35
    implementation("androidx.activity:activity:1.9.3")

    // FITUR LOKASI (Google Play Services)
    implementation("com.google.android.gms:play-services-location:21.0.1")

    // FIREBASE SDK (Menggunakan Bill of Materials / BoM)
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))

    // --- TAMBAHKAN BARIS INI UNTUK MEMPERBAIKI ERROR MESSAGING ---
    implementation("com.google.firebase:firebase-messaging")
    // ------------------------------------------------------------

    implementation("com.google.firebase:firebase-database") // Simpan saldo di cloud
    implementation("com.google.firebase:firebase-auth")     // Sistem login

    // Pengujian
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}