package dependencies

object Dep {

    object GradlePlugin {

        object Android {
            val version = "3.6.1"
            val android = "com.android.tools.build:gradle:$version"
            val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.version}"
        }

        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"

        object Oss {
            val version = "1.2.1"
            val cookpadLicense = "gradle.plugin.com.cookpad.android.plugin:plugin:$version"
        }
    }

    object Test {
        val junit = "junit:junit:4.13"
        val androidJunit4Ktx = "androidx.test.ext:junit-ktx:1.1.1"
        val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Kotlin.Coroutines.version}"
        val kotlinTestAssertions = "io.kotlintest:kotlintest-assertions:3.1.10"
        val testingKtx = "androidx.navigation:navigation-testing:2.3.0-alpha03"
    }

    object AndroidX {

        val coreKtx = "androidx.core:core-ktx:1.2.0"
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        val design = "com.google.android.material:material:1.2.0-alpha04"
        val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.0"

        object LiveData {
            val version = "2.2.0"
            val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:$version"
            val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        }

        object Navigation {
            val version = "2.2.1"
            val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }

    object Kotlin {
        val version = "1.3.70"

        val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"

        object Coroutines {
            val version = "1.3.4"
            val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        }

        object Serialization {
            val version = "0.20.0"

            val serializationAndroid = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:$version"
        }
    }

    object Ktor {
        val version = "1.3.1"
        val clientCore = "io.ktor:ktor-client-core:$version"
        val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        val json = "io.ktor:ktor-client-json-jvm:$version"
        val serialization = "io.ktor:ktor-client-serialization-jvm:$version"
    }

    object OkHttp {
        val version = "4.4.1"
        val client = "com.squareup.okhttp3:okhttp:$version"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Groupie {
        val version = "2.7.2"
        val groupie = "com.xwray:groupie:$version"
        val databinding = "com.xwray:groupie-databinding:$version"
    }

    object Coil {
        val version = "0.9.5"
        val coil = "io.coil-kt:coil:$version"
    }

    object Klock {
        val version = "1.9.1"
        val common = "com.soywiz.korlibs.klock:klock:$version"
    }

    object MockK {
        val jvm = "io.mockk:mockk:1.9.3"
    }

    object Timber {
        val android = "com.jakewharton.timber:timber-android:5.0.0-SNAPSHOT"
    }

    object Insetter {
        val insetter = "dev.chrisbanes:insetter-ktx:0.2.0"
    }

}
