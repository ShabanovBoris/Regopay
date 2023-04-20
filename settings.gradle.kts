pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Regopay"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

includeBuild("./buildLogic")
include(
    ":app",
    ":core:theme"
)
