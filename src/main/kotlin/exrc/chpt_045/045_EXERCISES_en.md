# Exercises for the chapter "Collections & Sequences"

## a) Months and years

Create a `Sequence` that enumerates the years 1900, 2000 and 2100.

For each of these years, another sequence is to enumerate the months 1 to 12 (inner loop).

Then, for each combination of year and month, we can create a `LocalDate` instance for the
first day of that month.

For each of these dates, print the distance to the previous date (tip: `ChronoUnit.DAYS.between()`)

## b) Creating sequences

Look at the source code `exrc/chpt_045/b_seq.kt` and implement the missing functionality for
creating sequences.
