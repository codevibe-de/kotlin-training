package exrc.chpt_045

import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.util.Locale

fun main() {
    var prevDate: LocalDate? = null
}

fun nameOfMonth(month:Int) =
    Month.of(month).getDisplayName(TextStyle.FULL, Locale.getDefault())
