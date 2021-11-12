![Maven metadata URL](https://img.shields.io/maven-metadata/v?label=%24version&metadataUrl=https%3A%2F%2Fmaven.y9vad9.com%2Fcom%2Fy9vad9%2Fklocalizable%2Fmaven-metadata.xml)
# klocalizable
Simple Kotlin localization library.

## Example
For simple words / sentences library has next DSL:
```kotlin
object Strings {
    val helloWorld: String by localized(
        default = "Hello, World!", localeProvider
    ) {
        Locale.RUSSIAN provides "Привет, мир!"
        Locale.UKRAINIAN provides "Привіт, світ"
    }
}
```
### Word forms support
If you need to make different forms of words / sentences you can make next:
```kotlin
object Strings {
    object Human : KLocalizedForms<String>() {
        override val single: String by localized(localeProvider) {
            Locale.ENGLISH provides "Human"
            Locale.RUSSIAN provides "Человек"
            Locale.UKRAINIAN provides "Людина"
        }
        override val plural: String by localized(localeProvider) {
            Locale.ENGLISH provides "Humans"
            Locale.RUSSIAN provides "Люди"
            Locale.UKRAINIAN provides "Люди"
        }
    }
}
```
Also, if you need more forms you can extend `KLocalizedForms<T>` and add yours.

## Implementation
Put next in your build.gradle.kts:
```kotlin
repositories {
    maven("https://maven.y9vad9.com")
}
dependencies {
    implementation("com.y9vad9.localizable:klocalizable:$version")
}
```
