buildscript {
    dependencies {
        classpath("internal:buildLogic")
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

allprojects {
    // Configure kapt
//pluginManager.withPlugin(rootProject.libs.plugins.kotlin.kapt.get().pluginId) {
//    extensions.getByType<org.jetbrains.kotlin.gradle.plugin.KaptExtension>().correctErrorTypes = true
//}

// Configure Android projects
    pluginManager.withPlugin("com.android.application") {
        configureAndroidProject()
    }
    pluginManager.withPlugin("com.android.library") {
        configureAndroidProject()
    }

// Configure Java to use our chosen language level. Kotlin will automatically
// pick this up
    plugins.withType<JavaBasePlugin>().configureEach {
        extensions.configure<JavaPluginExtension> {
            toolchain {
                languageVersion.set(JavaLanguageVersion.of(17))
            }
        }
    }
}

fun Project.configureAndroidProject() {
    extensions.configure<com.android.build.gradle.BaseExtension> {
        compileSdkVersion(33)
        defaultConfig {
            minSdk = 24
            targetSdk = 33
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
}
