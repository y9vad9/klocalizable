package com.y9vad9.localizable

public class KLocalized<T>(private val translations: Map<Locale, T>) {
    public operator fun get(locale: Locale): T? = translations[locale]
}