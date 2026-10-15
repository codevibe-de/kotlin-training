# Exercises for the chapter "Generics"

## a) NumberKeyedMap

Create a class `NumberKeyedMap` that only accepts numbers (`Number`) as key type `K`.
Any type can be used for the values `V`.

This map is to offer functions for determining the smallest and the largest key. Since `Number` itself
is not comparable in Kotlin, sorting can be done e.g. with `sortedBy { it.toDouble() }`.
