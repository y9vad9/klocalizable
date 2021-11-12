package com.y9vad9.localizable

/**
 * Wrapper locale.
 * @param countryCode - country code (e.x UA).
 * @param languageCode - language code (e.x uk).
 */
public data class Locale(
    public val countryCode: String?,
    public val languageCode: String
) {
    @Suppress("ObjectPropertyName", "unused")
    public companion object {
        public val ENGLISH: Locale = Locale(null, "en")
        public val DEFAULT: Locale = ENGLISH
        public val AFAR: Locale = Locale(null, "aa")
        public val ABKHAZIAN: Locale = Locale(null, "ab")
        public val AVESTAN: Locale = Locale(null, "ae")
        public val AFRIKAANS: Locale = Locale(null, "af")
        public val AKAN: Locale = Locale(null, "ak")
        public val AMHARIC: Locale = Locale(null, "am")
        public val ARAGONESE: Locale = Locale(null, "an")
        public val ARABIC: Locale = Locale(null, "ar")
        public val ASSAMESE: Locale = Locale(null, "as")
        public val AVARIC: Locale = Locale(null, "av")
        public val AYMARA: Locale = Locale(null, "ay")
        public val AZERBAIJANI: Locale = Locale(null, "az")
        public val BASHKIR: Locale = Locale(null, "ba")
        public val BELARUSIAN: Locale = Locale(null, "be")
        public val BULGARIAN: Locale = Locale(null, "bg")
        public val BIHARI: Locale = Locale(null, "bh")
        public val BISLAMA: Locale = Locale(null, "bi")
        public val BAMBARA: Locale = Locale(null, "bm")
        public val BANGLA: Locale = Locale(null, "bn")
        public val TIBETAN: Locale = Locale(null, "bo")
        public val BRETON: Locale = Locale(null, "br")
        public val BOSNIAN: Locale = Locale(null, "bs")
        public val CATALAN: Locale = Locale(null, "ca")
        public val CHECHEN: Locale = Locale(null, "ce")
        public val CHAMORRO: Locale = Locale(null, "ch")
        public val CORSICAN: Locale = Locale(null, "co")
        public val CREE: Locale = Locale(null, "cr")
        public val CZECH: Locale = Locale(null, "cs")
        public val `CHURCH SLAVIC`: Locale = Locale(null, "cu")
        public val CHUVASH: Locale = Locale(null, "cv")
        public val WELSH: Locale = Locale(null, "cy")
        public val DANISH: Locale = Locale(null, "da")
        public val GERMAN: Locale = Locale(null, "de")
        public val DIVEHI: Locale = Locale(null, "dv")
        public val DZONGKHA: Locale = Locale(null, "dz")
        public val EWE: Locale = Locale(null, "ee")
        public val GREEK: Locale = Locale(null, "el")
        public val ESPERANTO: Locale = Locale(null, "eo")
        public val SPANISH: Locale = Locale(null, "es")
        public val ESTONIAN: Locale = Locale(null, "et")
        public val BASQUE: Locale = Locale(null, "eu")
        public val PERSIAN: Locale = Locale(null, "fa")
        public val FULAH: Locale = Locale(null, "ff")
        public val FINNISH: Locale = Locale(null, "fi")
        public val FIJIAN: Locale = Locale(null, "fj")
        public val FAROESE: Locale = Locale(null, "fo")
        public val FRENCH: Locale = Locale(null, "fr")
        public val `WESTERN FRISIAN`: Locale = Locale(null, "fy")
        public val IRISH: Locale = Locale(null, "ga")
        public val `SCOTTISH GAELIC`: Locale = Locale(null, "gd")
        public val GALICIAN: Locale = Locale(null, "gl")
        public val GUARANI: Locale = Locale(null, "gn")
        public val GUJARATI: Locale = Locale(null, "gu")
        public val MANX: Locale = Locale(null, "gv")
        public val HAUSA: Locale = Locale(null, "ha")
        public val HEBREW: Locale = Locale(null, "he")
        public val HINDI: Locale = Locale(null, "hi")
        public val `HIRI MOTU`: Locale = Locale(null, "ho")
        public val CROATIAN: Locale = Locale(null, "hr")
        public val `HAITIAN CREOLE`: Locale = Locale(null, "ht")
        public val HUNGARIAN: Locale = Locale(null, "hu")
        public val ARMENIAN: Locale = Locale(null, "hy")
        public val HERERO: Locale = Locale(null, "hz")
        public val INTERLINGUA: Locale = Locale(null, "ia")
        public val INTERLINGUE: Locale = Locale(null, "ie")
        public val IGBO: Locale = Locale(null, "ig")
        public val `SICHUAN YI`: Locale = Locale(null, "ii")
        public val INUPIAQ: Locale = Locale(null, "ik")
        public val INDONESIAN: Locale = Locale(null, "in")
        public val IDO: Locale = Locale(null, "io")
        public val ICELANDIC: Locale = Locale(null, "is")
        public val ITALIAN: Locale = Locale(null, "it")
        public val INUKTITUT: Locale = Locale(null, "iu")
        public val JAPANESE: Locale = Locale(null, "ja")
        public val YIDDISH: Locale = Locale(null, "ji")
        public val JAVANESE: Locale = Locale(null, "jv")
        public val GEORGIAN: Locale = Locale(null, "ka")
        public val KONGO: Locale = Locale(null, "kg")
        public val KIKUYU: Locale = Locale(null, "ki")
        public val KUANYAMA: Locale = Locale(null, "kj")
        public val KAZAKH: Locale = Locale(null, "kk")
        public val KALAALLISUT: Locale = Locale(null, "kl")
        public val KHMER: Locale = Locale(null, "km")
        public val KANNADA: Locale = Locale(null, "kn")
        public val KOREAN: Locale = Locale(null, "ko")
        public val KANURI: Locale = Locale(null, "kr")
        public val KASHMIRI: Locale = Locale(null, "ks")
        public val KURDISH: Locale = Locale(null, "ku")
        public val KOMI: Locale = Locale(null, "kv")
        public val CORNISH: Locale = Locale(null, "kw")
        public val KYRGYZ: Locale = Locale(null, "ky")
        public val LATIN: Locale = Locale(null, "la")
        public val LUXEMBOURGISH: Locale = Locale(null, "lb")
        public val GANDA: Locale = Locale(null, "lg")
        public val LIMBURGISH: Locale = Locale(null, "li")
        public val LINGALA: Locale = Locale(null, "ln")
        public val LAO: Locale = Locale(null, "lo")
        public val LITHUANIAN: Locale = Locale(null, "lt")
        public val `LUBA-KATANGA`: Locale = Locale(null, "lu")
        public val LATVIAN: Locale = Locale(null, "lv")
        public val MALAGASY: Locale = Locale(null, "mg")
        public val MARSHALLESE: Locale = Locale(null, "mh")
        public val MAORI: Locale = Locale(null, "mi")
        public val MACEDONIAN: Locale = Locale(null, "mk")
        public val MALAYALAM: Locale = Locale(null, "ml")
        public val MONGOLIAN: Locale = Locale(null, "mn")
        public val MOLDAVIAN: Locale = Locale(null, "mo")
        public val MARATHI: Locale = Locale(null, "mr")
        public val MALAY: Locale = Locale(null, "ms")
        public val MALTESE: Locale = Locale(null, "mt")
        public val BURMESE: Locale = Locale(null, "my")
        public val NAURU: Locale = Locale(null, "na")
        public val `NORWEGIAN BOKMAL`: Locale = Locale(null, "nb")
        public val `NORTH NDEBELE`: Locale = Locale(null, "nd")
        public val NEPALI: Locale = Locale(null, "ne")
        public val NDONGA: Locale = Locale(null, "ng")
        public val DUTCH: Locale = Locale(null, "nl")
        public val `NORWEGIAN NYNORSK`: Locale = Locale(null, "nn")
        public val NORWEGIAN: Locale = Locale(null, "no")
        public val `SOUTH NDEBELE`: Locale = Locale(null, "nr")
        public val NAVAJO: Locale = Locale(null, "nv")
        public val NYANJA: Locale = Locale(null, "ny")
        public val OCCITAN: Locale = Locale(null, "oc")
        public val OJIBWA: Locale = Locale(null, "oj")
        public val OROMO: Locale = Locale(null, "om")
        public val ODIA: Locale = Locale(null, "or")
        public val OSSETIC: Locale = Locale(null, "os")
        public val PUNJABI: Locale = Locale(null, "pa")
        public val PALI: Locale = Locale(null, "pi")
        public val POLISH: Locale = Locale(null, "pl")
        public val PASHTO: Locale = Locale(null, "ps")
        public val PORTUGUESE: Locale = Locale(null, "pt")
        public val QUECHUA: Locale = Locale(null, "qu")
        public val ROMANSH: Locale = Locale(null, "rm")
        public val RUNDI: Locale = Locale(null, "rn")
        public val ROMANIAN: Locale = Locale(null, "ro")
        public val RUSSIAN: Locale = Locale(null, "ru")
        public val KINYARWANDA: Locale = Locale(null, "rw")
        public val SANSKRIT: Locale = Locale(null, "sa")
        public val SARDINIAN: Locale = Locale(null, "sc")
        public val SINDHI: Locale = Locale(null, "sd")
        public val `NORTHERN SAMI`: Locale = Locale(null, "se")
        public val SANGO: Locale = Locale(null, "sg")
        public val SINHALA: Locale = Locale(null, "si")
        public val SLOVAK: Locale = Locale(null, "sk")
        public val SLOVENIAN: Locale = Locale(null, "sl")
        public val SAMOAN: Locale = Locale(null, "sm")
        public val SHONA: Locale = Locale(null, "sn")
        public val SOMALI: Locale = Locale(null, "so")
        public val ALBANIAN: Locale = Locale(null, "sq")
        public val SERBIAN: Locale = Locale(null, "sr")
        public val SWATI: Locale = Locale(null, "ss")
        public val `SOUTHERN SOTHO`: Locale = Locale(null, "st")
        public val SUNDANESE: Locale = Locale(null, "su")
        public val SWEDISH: Locale = Locale(null, "sv")
        public val SWAHILI: Locale = Locale(null, "sw")
        public val TAMIL: Locale = Locale(null, "ta")
        public val TELUGU: Locale = Locale(null, "te")
        public val TAJIK: Locale = Locale(null, "tg")
        public val THAI: Locale = Locale(null, "th")
        public val TIGRINYA: Locale = Locale(null, "ti")
        public val TURKMEN: Locale = Locale(null, "tk")
        public val TAGALOG: Locale = Locale(null, "tl")
        public val TSWANA: Locale = Locale(null, "tn")
        public val TONGAN: Locale = Locale(null, "to")
        public val TURKISH: Locale = Locale(null, "tr")
        public val TSONGA: Locale = Locale(null, "ts")
        public val TATAR: Locale = Locale(null, "tt")
        public val TWI: Locale = Locale(null, "tw")
        public val TAHITIAN: Locale = Locale(null, "ty")
        public val UYGHUR: Locale = Locale(null, "ug")
        public val UKRAINIAN: Locale = Locale(null, "uk")
        public val URDU: Locale = Locale(null, "ur")
        public val UZBEK: Locale = Locale(null, "uz")
        public val VENDA: Locale = Locale(null, "ve")
        public val VIETNAMESE: Locale = Locale(null, "vi")
        public val VOLAPUK: Locale = Locale(null, "vo")
        public val WALLOON: Locale = Locale(null, "wa")
        public val WOLOF: Locale = Locale(null, "wo")
        public val XHOSA: Locale = Locale(null, "xh")
        public val YORUBA: Locale = Locale(null, "yo")
        public val ZHUANG: Locale = Locale(null, "za")
        public val CHINESE: Locale = Locale(null, "zh")
        public val ZULU: Locale = Locale(null, "zu")
    }

    override fun toString(): String = "$languageCode-$countryCode"
}