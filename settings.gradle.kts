pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}


rootProject.name = "klocalizable"

includeBuild("buildUtils/dependencies")
includeBuild("buildUtils/configuration")
includeBuild("buildUtils/deploy")