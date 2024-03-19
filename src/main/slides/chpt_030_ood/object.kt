package chpt_030_ood

class Foo {
    val settings = object : SettingsProvider {
        override val flagThis = true
        override val flagThat = false
    }

    object Settings {
        val flag = true
    }
}

interface SettingsProvider {
    val flagThis: Boolean
    val flagThat: Boolean
}

fun main() {
    Foo().settings.flagThis
    Foo.Settings.flag
}