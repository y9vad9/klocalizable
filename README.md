# klocalizable
Simple Kotlin localization library.

## Example
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

## Implementation
Put next in your gradle:
```kotlin
repositories {
    maven("https://maven.y9vad9.com")
}
dependencies {
    implementation("com.y9vad9.localizable")
}
```
