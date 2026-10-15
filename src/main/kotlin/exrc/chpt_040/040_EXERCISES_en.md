# Exercises for the chapter "Functional programming"

## a) Mini-pipeline

Basis: `src/main/kotlin/exrc/chpt_040/a_lambda.kt`

Define the two missing lambdas as variables named `mapper` and `consumer`, so that
"101010" is printed to the console when the program starts:

- the `mapper` converts the number into its binary representation
- the `consumer` processes its input by printing the value passed in (`println()`)

## b) Extended pipeline

Basis: `src/main/kotlin/exrc/chpt_040/b_firstclass.kt`

Uncomment all commented lines in the file mentioned above.

The goal is a processing pipeline that

* generates / supplies the numbers 1 to 10 (supplier)
* only considers numbers that are divisible by a certain, configurable number (the lambda is to be created by
  a function)
* creates a binary string from the numbers, as in a)
* appends the binary strings as lines to a file (or simply prints them with `println`)

## d) Collection Pipeline

Basis: `src/main/kotlin/exrc/chpt_040/d_collection-operations.kt`

In the file mentioned above, implement a processing pipeline based on a
list or range that generates the same output as in b) above, i.e.:

* for a list of numbers 1 to 10
* only those divisible by the number `div` are considered
* then converted into binary string form
* and finally written to a file or printed with println

The variable `div` defines the number used for the "is divisible by" check.

So as a starting point you need a `List` or e.g. a `Range` instance, on which the
processing pipeline is then defined.

Use the existing collection operations such as

* `filter()`
* `map()`
* `forEach()`

## e) Reduction

Basis: `src/main/kotlin/exrc/chpt_040/e_reduction.kt` (remove comments)

You are now faced with more complex data. As input you get a list of orders, each of which has
a set of ordered product ids.

Your task is to turn them into one overall set (`Set`) of ordered product ids:

`List<Order> => Set<String>`

### Bonus

Convert the input into a `Map<String, Int>` so that the number of orders is calculated for each
product id (tip: `groupingBy`)
