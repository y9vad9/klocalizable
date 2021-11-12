package com.y9vad9.localizable

public fun interface KLocalizationBuilder<T> {
    /**
     * Provides [translated] value for [Locale].
     * @param translated - translated value.
     */
    public infix fun Locale.provides(translated: T)
}