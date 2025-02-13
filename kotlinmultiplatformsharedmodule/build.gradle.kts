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
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-csv:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-yaml:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-msgpack:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobufjs:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-runtime:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-runtime:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-jvm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-jvm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-jvm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-jvm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-native:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-native:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-native:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-native:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-wasm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-wasm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-wasm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-wasm:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-wasm32:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-wasm32:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-wasm32:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-wasm32:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-wasm64:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-wasm64:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-wasm64:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-wasm64:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-native-mt:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-native-mt:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-native-mt:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-native-mt:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-wasm32-mt:1.3.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-csv-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-yaml-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-msgpack-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobufjs-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-runtime-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-runtime-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-jvm-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-jvm-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-jvm-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js-common-jvm-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-common-native-mt-test:1.3.2")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-native-mt-test:1.3.2")
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