buildscript {
    ext {
        roomVersion = "2.5.0"
    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:7.2.1"
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
} 