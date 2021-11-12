package com.y9vad9.localizable

import kotlin.properties.Delegates

public abstract class KLocalizedForms<T> {
    /**
     * Single form of word / sentence.
     */
    public open val single: T by Delegates.notNull()

    /**
     * Plural form of word / sentence.
     */
    public open val plural: T by Delegates.notNull()
}