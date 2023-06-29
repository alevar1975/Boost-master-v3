plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "kotlinmultiplatformsharedmodule"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation project(':shared')
                implementation project(':core')
                implementation project(':automation')
                implementation project(':combo')
                implementation project(':database')
                implementation project(':dana')
                implementation project(':danars')
                implementation project(':danar')
                implementation project(':insight')
                implementation project(':kotlinmultiplatformsharedmodule')
                implementation project(':pump-common')
                implementation project(':rileylink')
                implementation project(':medtronic')
                implementation project(':omnipod-common')
                implementation project(':omnipod-eros')
                implementation project(':omnipod-dash')
                implementation project(':diaconn')
                implementation project(':openhumans')
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.example.kotlinmultiplatformsharedmodule"
    compileSdk = 33
    defaultConfig {
        minSdk = 28
    }
}