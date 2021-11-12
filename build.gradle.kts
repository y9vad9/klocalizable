plugins {
    id(Deps.Plugins.Configuration.Kotlin.Mpp)
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