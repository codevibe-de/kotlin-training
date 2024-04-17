# Exercises for chapter "Functional programming"

## a) Mini-pipeline

Basis: `src/main/kotlin/exrc/chpt_040/a_lambda.kt`

Define the two missing lambdas as variables named `mapper` and `consumer` so that an output of
"101010" is printed on the console at program start.

## b) Extended pipeline

Basis: `src/main/kotlin/exrc/chpt_040/b_firstclass.kt`

Uncomment all commented lines in the above file.

Then write code so that the given processing pipeline:

* processes the numbers from 1 to 10 (supplier)
* only considers numbers that are divisible by a certain, configurable number -- make sure to create a
  parameterized factory method to obtain a lambda instance (filter)
* creates a binary string from the numbers as in task "a" (mapper)
* appends the binary strings as lines to a file (or simply prints as lines to the terminal)

## d) Collection Pipeline

Basis: `src/main/kotlin/exrc/chpt_040/d_collection-operations.kt`

In the file mentioned above, implement a processing pipeline based on a list or range, which generates the same output
as in task "b".

To do this, use existing collection operations such as

* `filter()`
* `map()`
* `foreach()`

## e) Reduction

Basis: `src/main/kotlin/exrc/chpt_040/e_reduction.kt` (remove comments)

You are now confronted with more complex data. As input, you have a list of orders, each of which has
a number of ordered products described by their ID.

Your task is to bring a list of Orders into a set of ordered product IDs:

`List<Order> => Set<String>`

### Bonus

Convert the input into a `Map<String, Int>` so that the number of orders is calculated for each product id
(hint: `groupingBy`)