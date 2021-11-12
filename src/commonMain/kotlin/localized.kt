package com.y9vad9.localizable

public fun <T> localized(
    localizationProvider: CurrentLocalizationProvider,
    builder: KLocalizationBuilder<T>.() -> Unit
): KLocalizedDelegate<T> {
    val variants: MutableMap<Locale, T> = mutableMapOf()
    val localizationBuilder = KLocalizationBuilder<T> { translated ->
        variants[this] = translated
    }
    localizationBuilder.apply(builder)
    return KLocalizedDelegate(KLocalized(variants), localizationProvider)
}

public fun <T> localized(
    default: T,
    localizationProvider: CurrentLocalizationProvider,
    builder: KLocalizationBuilder<T>.() -> Unit
) : KLocalizedDelegate<T> = localized(localizationProvider) {
    Locale.DEFAULT provides default
    builder()
}