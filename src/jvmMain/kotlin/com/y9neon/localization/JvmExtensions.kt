package com.y9neon.localization

import com.y9vad9.localizable.Locale

public fun java.util.Locale.toLocale(): Locale = Locale(country, language)

public fun Locale.toJavaLocale(): java.util.Locale = java.util.Locale(languageCode, countryCode)