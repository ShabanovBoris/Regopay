plugins{
    `kotlin-dsl`
}

group = "internal"
version = 1.0

repositories{
    google()
    mavenCentral()
    gradlePluginPortal()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
    implementation("com.android.tools.build:gradle:8.0.0")
}