# Exercises for the chapter "Syntax"

## a) Multiples of 3 and 5

Write a program that, for all numbers below a given upper limit, adds up the numbers that are
divisible by either 3 or 5. If a number is divisible by both, it is only counted once.

````text
addUp(3) = 0
addUp(10) = 23    // since 3 + 5 + 6 + 9
````

Lambdas only come later, so feel free to solve this exercise without lambdas. There are
interesting options for that, too :)

## c) Library

You start developing the business logic for a library. Use the file `c_library.kt` as a starting
point.

The central part is the function `addBook`, which takes the following parameters:

* `title: String`, required
* `isbn: String`, optional, default value "?"
* `price: Float`, required
* `author: String`, optional, default value "??"

For now, the method body just does a simple `println` with the parameters. You can build a
single-line or multi-line string here :)

Now call the method with the following combinations of arguments:

* all parameters
* only title, isbn, price
* only title, price
* only title, price, author (naming each of the three arguments)

### Bonus:

Allow one or more books to be defined via command-line arguments, in the format
`<title>:<price>`.

Your program should split these pairs and turn them into function calls.

You can split them e.g. with the following statement. It uses "destructuring", which we will
cover in detail later:

````kotlin
val parts = arg.split(":")
val (titleString, priceString) = parts
````

Feel free to handle errors that occur while parsing.

## d) Variadic print()

Write a top-level function `vprint()` that can print any number of values (similar to
[Python](https://docs.python.org/3/library/functions.html#print)).

In addition, the function **can** be passed:

- a separator string that is printed between two values (default is `" "`)
- an end string that is printed after all values (default is `"\n"`)

## e) Statistics

Write a method that takes

* any number of `Int` values
* and a calculation type as a string ("sum", "min", "max", "avg")

Depending on the calculation type, the numbers are to be calculated accordingly and returned as an `Int`.

## f) Roman numerals

Write a function that calculates a decimal number from a Roman numeral:

* I = 1
* II = 2
* LXIV = 64
* XCIX = 99
* MCMIX = 1909

So the subtractive notation applies: https://en.wikipedia.org/wiki/Roman_numerals#Standard_form

No further checks of the order of the characters are needed...

The `CharArray`, which can be created from a string, is helpful for the solution.

## g) Mapping library

*Note: some code is prepared in the file `g_collections.kt`. Please don't use streams/functional
style in this exercise yet!*

There are a number of books in your library. We want to manage them in two ways:

* a 1:1 mapping from ISBN to book title
* a 1:n mapping from an author to his/her book titles

Start by creating the two variables for these maps. Which generic types do the maps
need?

The `addBook2()` function should then fill both variables (mappings) based on the arguments passed.

For the 1:n mapping, the map's methods `containsKey` and `getValue` are particularly helpful.

### Bonus:

We read a list of books from a suboptimally designed CSV file.

You will find it in the project under the name `books.csv`. Each line has the following format (the
characters "<" and ">" are not literals and belong to the placeholder):

````text
<isbn>,<title> (<author>),"<price>","<description>"
````

Read the file line by line (see the predefined function `readLinesFromFile()`) and extract the
information needed to add the book to the library. This can be done nicely with a `Regex`,
which you can develop e.g. with https://regex101.com/.

## j) Extension Functions

*Note: some code is prepared in the file `j_extensionFunctions.kt`.
Uncomment it and make it work :)*

You can experiment with three possible _extension functions_ for the type `String`:

1. counting the number of vowels (including umlauts)
2. conversion to camel case ("Wir lernen Kotlin" becomes "WirLernenKotlin")
3. inserting a space between each letter ("Hallo" becomes "H a l l o")

Hints:

* split a `String`: `String.split()`
* access a `Char` of a string with `str[0]` or with `for(c in string)` on the string
  (because a string can be iterated using the index operator)
* both `String` and `Char` provide case conversion functions, but for
  a `Char` the return value is a `String`!
