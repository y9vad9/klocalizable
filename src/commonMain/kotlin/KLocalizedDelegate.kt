package com.y9vad9.localizable

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

public class KLocalizedDelegate<T>(private val localized: KLocalized<T>, private val provider: CurrentLocalizationProvider) : ReadOnlyProperty<Any?, T> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        val currentLocale = provider.provide()
        return chooseVariant(currentLocale)
            ?: throw IllegalStateException("Localized ${property.name} didn't have localization for $currentLocale. " +
                "Unable to use Locale.DEFAULT as fallback, because it isn't specified.")
    }

    private fun chooseVariant(currentLocale: Locale): T? {
        if(localized[currentLocale] != null)
            return localized[currentLocale]!!

        val available = localized.translations.keys
        val langCodeMatches = available.filter { it.languageCode == currentLocale.languageCode }

        return if(langCodeMatches.isNotEmpty())
            localized[langCodeMatches.first()]
        else localized[Locale.DEFAULT]
    }
}