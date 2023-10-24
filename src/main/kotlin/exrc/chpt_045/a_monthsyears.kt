package exrc.chpt_045

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    var prevDate: LocalDate? = null
    (1900 .. 2100 step 100).asSequence()
        .forEach { year ->
            println("JAHR $year")
            prevDate = null
            (1..12).asSequence().forEach { month ->
                val date = LocalDate.of(year, month, 1)
                if (prevDate != null) {
                    println("  " + nameOfMonth(month-1) + ": " + ChronoUnit.DAYS.between(prevDate, date))
                }
                prevDate = date
            }
        }

}

fun nameOfMonth(month:Int) =
    Month.of(month).getDisplayName(TextStyle.FULL, Locale.getDefault())
