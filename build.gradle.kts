apply plugin: 'com.android.application'

android {
    compileSdkVersion 32

    defaultConfig {
        applicationId "com.example.notesapp"
        minSdkVersion 21
        targetSdkVersion 32
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.2'
    implementation 'com.google.android.material:material:1.6.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation "androidx.room:room-runtime:$roomVersion"
    annotationProcessor "androidx.room:room-compiler:$roomVersion"
    implementation "androidx.lifecycle:lifecycle-viewmodel:2.5.0"
    implementation "androidx.lifecycle:lifecycle-livedata:2.5.0"
}