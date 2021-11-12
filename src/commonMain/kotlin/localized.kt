package com.y9vad9.localizable

public fun <T> localized(
    localizationProvider: CurrentLocaleProvider,
    builder: KLocalizationBuilder<T>.() -> Unit
): KLocalizedDelegate<T> {
    return KLocalizedDelegate(klocalized(builder), localizationProvider)
}

public fun <T> localized(
    default: T,
    localizationProvider: CurrentLocaleProvider,
    builder: KLocalizationBuilder<T>.() -> Unit
) : KLocalizedDelegate<T> = localized(localizationProvider) {
    Locale.DEFAULT provides default
    builder()
}

public fun <T> klocalized(
    default: T,
    builder: KLocalizationBuilder<T>.() -> Unit
): KLocalized<T> {
    return klocalized {
        Locale.DEFAULT provides default
        builder()
    }
}

public fun <T> klocalized(
    builder: KLocalizationBuilder<T>.() -> Unit
): KLocalized<T> {
    val variants: MutableMap<Locale, T> = mutableMapOf()
    val localizationBuilder = KLocalizationBuilder<T> { translated ->
        variants[this] = translated
    }
    localizationBuilder.apply(builder)
    return KLocalized(variants)
}