plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.london.doctour"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.london.doctour"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Core dependencies
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Material design dependencies
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // JUnit dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Coroutines dependencies
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    // ViewBinding delegates dependencies
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.9")

    // Datastore dependencies
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // Paging3 dependencies
    implementation("androidx.paging:paging-runtime-ktx:3.2.1")
    implementation("androidx.paging:paging-common-ktx:3.2.1")

    // Circle indicator dependencies
    implementation("me.relex:circleindicator:2.1.6")

    // Dots indicator dependencies
    implementation("com.tbuonomo:dotsindicator:4.3")

    // Circle imageviews dependencies
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // Lottie Animation dependencies
    implementation("com.airbnb.android:lottie:5.2.0")

    // Splash screen dependencies
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Dagger Hilt dependencies
    implementation("com.google.dagger:hilt-android:2.46.1")
    implementation("com.google.dagger:hilt-compiler:2.46.1")

    // Activity dependencies
    implementation("androidx.activity:activity-ktx:1.7.2")

    // Fragment dependencies
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    // Lifecycle dependencies
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // Navigation dependencies
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.2")

    // Retrofit dependencies
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    // OkHttp dependencies
    implementation("com.squareup.okhttp3:okhttp-bom:5.0.0-alpha.11")
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    // Glide dependencies
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Moshi dependencies
    implementation("com.squareup.moshi:moshi:1.14.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")

    // Room dependencies
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

    // Dublicated fix dependencies
    implementation("org.jetbrains.kotlin:kotlin-bom:1.8.0")

    // ViewPager2 dependencies
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    // Google Play services dependencies
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    // Legacy services dependencies
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // SMS configuration dependencies
    implementation("com.github.fraggjkee:sms-confirmation-view:1.7.1")

    // Gson converter dependencies
    implementation("com.squareup.retrofit2:converter-gson:2.5.0")
    implementation("com.google.code.gson:gson:2.9.0")

    // Event bus dependencies
    implementation("org.greenrobot:eventbus:3.2.0")

    // LibPhoneNumber dependencies
    implementation("com.googlecode.libphonenumber:libphonenumber:8.13.14")
}