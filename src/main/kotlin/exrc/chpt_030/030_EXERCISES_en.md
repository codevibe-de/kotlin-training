# Exercises for the chapter "Object-oriented programming"

## a) Stack

Basis: `src/main/kotlin/exrc/chpt_030/a_stack.kt`

Write a class `Stack`, i.e. a data class that manages a stack of
`String` values. It offers the following methods:

* `peek(): String` -- returns the top value of the stack
* `push(v: String): Unit` -- puts a value on the stack
* `pop(): String` -- removes the top value from the stack and returns it

Feel free to use a generic type `<T>` instead of `String`.

## c) Constructor

Basis: `src/main/kotlin/exrc/chpt_030/c_constructor.kt`

Write a class `SuperString` that can be created in three ways:

* with the string to be represented
* from a `Char` and the number of repetitions, from which the string is built
* from an `Int` for the Unicode character to be represented

## g) Task

Basis: `src/main/kotlin/exrc/chpt_030/g_task.kt`

Write a class `Task` that has a name and an optional priority as a `Byte`.

The priority can be in the range 1-5. Values outside this range are set to 1 or 5 respectively. The default value
(i.e. only if none is given) is 3.

The name is final, the priority can be changed and queried at any time.

Make sure that instances always have a value for the priority and that it is always within the valid range.

### Bonus:

Let the task implement the `Runnable` interface -- now the task itself has to become abstract as well.
We haven't covered that topic yet, but it isn't hard: just like in Java, write `abstract` in front of the class name.

Then write a class `DelegatingTask` that receives another `Runnable` instance as an additional constructor
parameter. In the `run()` function of `DelegatingTask`, the `run()` call is simply delegated to this other
`Runnable` (because: "don't work late, delegate!" :))

## i) Abstract zoology with interfaces

File: `src/main/kotlin/exrc/chpt_030/animal-interfaces.kt`

The class `Animal` should be abstract, but offer a concrete property `name: String`.

Write subclasses for animal groups or concrete animals that derive from it. Use
the existing interfaces **if they are relevant for the respective group or animal**.

Ideas: `Mammal`, `Fish`, `Shark`, `BlueWhale`, `Orca`, `Lion`

The interfaces are to be extended so that:

* an animal with fins knows how many it has (property `finCount: Int`)
* an animal with teeth can bite another one (function `bite(animal: Animal)`)

PS:

1. not all mammals have teeth, e.g. some whales have no teeth (e.g. the blue whale)
2. not all fish have teeth either, e.g. carp have none (at least not in the jaw, which is what is meant here)

## k) Extended Library

Basis: `src/main/kotlin/exrc/chpt_030/k_extended-library.kt`

Look at the existing `Library` class.

It needs a `Book` class to work. Please create it.

Then write an extension function for the `Library` (e.g. because we can't/don't want to change this class)
that computes a map for all books which aggregates, per author, an alphabetically sorted list of his/her
book titles.

## m) Roman numerals II

Basis: `src/main/kotlin/exrc/chpt_030/m_roman-numbers2.kt`

Rewrite the Roman numerals exercise using enums.

## o) Expense Report

There is a refactoring exercise called "Expense Report" on GitHub that is available in many programming languages.

Look at the Kotlin variant and improve the existing code:

https://github.com/christianhujer/expensereport/blob/trunk/expensereport-kotlin/src/main/kotlin/com/nelkinda/training/ExpenseReport.kt

## q) What's our Vector, Victor?

_Note: use the existing file `q_vector.kt`_

Create a class named `Vector`, which contains X and Y coordinates. Whether you use a data class or a regular class is up to you. With a regular class, implement the operators `component1()` and `component2()` yourself to support destructuring, and also `equals()` and `toString()` for the checks in `main()`.

Instances (shown below as "V") of this class should be able to be processed using the following operators:

* Plus (V + V)
* Minus (V - V)
* Negation (-V)
* Destructuring
* Access to x/y using `V['x']` or `V['y']`

## r) Lazy Id

Extend the `Task` class with an `id` property, which is created lazily via delegation.

https://www.baeldung.com/kotlin/late-vs-lazy-init#lazy-initialization

The property is to be calculated once as a UUID when it is first accessed.

Feel free to print a message in an `init{}` block when an instance is ready, and another one
when the id is calculated. That way you can see what happens in which order ...
