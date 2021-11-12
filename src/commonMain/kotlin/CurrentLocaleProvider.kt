package com.y9vad9.localizable

/**
 * Provides current [Locale] for delegates.
 */
public interface CurrentLocaleProvider {
    public fun provide(): Locale
}