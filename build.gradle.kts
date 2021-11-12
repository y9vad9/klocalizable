import org.jetbrains.kotlin.konan.properties.loadProperties

plugins {
    id(Deps.Plugins.Configuration.Kotlin.Mpp)
    id("deploy")
}

group = AppInfo.PACKAGE
version = AppInfo.VERSION

kotlin {
    jvm()
    js {
        browser()
        nodejs()
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlin.OptIn")
            explicitApi()
        }
    }
}

val deployProperties = rootProject.file("deploy.properties")

deploy {
    if(!deployProperties.exists())
        ignore = true
    else {
        val properties = loadProperties(deployProperties.absolutePath)
        host = properties["host"] as String?
        user = properties["user"] as String?
        password = properties["password"] as String?
        deployPath = properties["deployPath"] as String?

        componentName = "kotlin"
        group = AppInfo.PACKAGE
        version = AppInfo.VERSION
        artifactId = "klocalizable"
        name = "klocalizable"
        description = "Simple localization library for kotlin"
    }
}

