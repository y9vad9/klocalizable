package com.y9vad9.localizable

/**
 * Provides current [Locale] for delegates.
 */
public interface CurrentLocalizationProvider {
    public fun provide(): Locale
}