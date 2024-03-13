# Exercises for the chapter "Syntax"

## a) Multiples of 3 and 5

Write a program which, for all numbers below a given upper limit, adds all numbers that are divisible
by either 3 or 5. If a number is divisible by both, it is counted only once.

````text
addUp(3) = 0
addUp(10) = 23 // since 3 + 5 + 6 + 9
````

Lambdas will be used later, you are asked to complete this exercise without lambdas.

## c) Library

Now we start developing the business logic for a library.

The central component will be a function `addBook`, which can process the following parameters:

* `title: String`, required
* `isbn: String`, optional, default value "?"
* `price: Float`, required
* `author: String`, optional, default value "??"

The method body initially does a simple `println` with the given parameters, only. To do this you can create a
single-line or multi-line string :)

Now call the method with the following argument combinations:

* all parameters
* only title, isbn, price
* only title, price
* only title, price, author (naming each of the three arguments)

### Bonus:

Allow one or more books to be defined via command line parameters. This
can be in the format `<title>:<price>`.

Your program should split these pairs and generate function calls from them.

Splitting is possible, for example, using the following instruction. This uses "destructuring", which we will learn
about more later.

````kotlin
val parts = arg.split(":")
val (titleString, priceString) = parts
````

You are welcome to handle errors that occur during parsing.

## e) Statistics

Write a method that accepts

* any number of `Int` values
* as well as a calculation operator type given as a string ("sum", "min", "max", "avg")

Depending on the operator type, the numbers should be calculated accordingly and returned as `Int`.

## f) Roman numerals

Write a function that calculates a decimal number from a Roman numeral:

* I = 1
* II = 2
* LXIV = 64
* XCIX = 99
* MCMIX = 1909

Note that the so-called "subtractive notation" applies: https://en.wikipedia.org/wiki/Roman_numerals#Standard_form

There is no need to check the order of the characters any further...

Helpful for the solution is the `CharArray`, which can be generated from a string.

## g) Mapping library

There are a number of books in your library. We want to manage them in two ways:

* a 1:1 mapping from ISBN to book title
* a 1:n mapping from an author to his books (titles)

Write the two functions that create a `Map` for each use case.

Some code is prepared for you in the file `src/main/kotlin/exrc/chpt_020/g_collections.kt`.

### Bonus:

Let's read a list of books from a suboptimally designed CSV file.

This can be found in the project under the name `books.csv`. Each line has the following format (the
characters "<" and ">" are not literals and are placeholders):

````text
<isbn>,<title> (<author>),"<price>","<description>"
````

Read the file line by line (see predefined function `readLinesFromFile()`) and extract the necessary
information to add the book to the library. This can be done nicely with a `Regex`, which you can develop
with https://regex101.com/, for example.

## j) Extension Functions

You can experiment with these ideas for creating extension functions for the `String` type:

1. counting the number of vowels (including umlauts)
2. conversion to Camelcase ("We learn Kotlin" becomes "WeLearnKotlin")
3. inserting a space between each letter ("Hallo" becomes "H a l l o")

Hints:

* split a `string`: `String.split()`
* access a `char` of a string with `str[0]` or with `for(c in string)` on the string
  (because a string can be iterated using the index operator)
* both `String` and `Char` provide case conversion functions -- however note that the case conversion of a `Char`
  returns a `String`!

