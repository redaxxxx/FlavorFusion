plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.android.dev.prof.flavorfusion"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android.dev.prof.flavorfusion"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //blur image
    implementation ("jp.wasabeef:blurry:4.0.1")

    //circular image
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Navigation component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.4.1")

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    //viewPager
    implementation ("androidx.viewpager:viewpager:1.0.0")

    // Moshi
    implementation ("com.squareup.moshi:moshi:1.9.3")
    implementation ("com.squareup.moshi:moshi-kotlin:1.9.3")

    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")

    implementation ("com.github.bumptech.glide:glide:4.8.0")


}