# Exercises for chapter "Object-oriented programming"

## a) Stack

Basis: `src/main/kotlin/exrc/chpt_030/a_stack.kt`

Write a class `Stack`, i.e. a data class that manages a stack of
`String` values, providing the following methods:

* `peek(): String` -- returns the top value on the stack
* `push(v: String): Unit` -- places a value on the stack
* `pop(): String` -- removes the top value from the stack and returns it

You can also use a generic type `<T>` instead of `String`.

## c) Constructor

Basis: `src/main/kotlin/exrc/chpt_030/c_constructor.kt`

Write a class `SuperString`, which can be created in three ways:

* by specifying the string to be displayed
* by specifying a `Char` and the number of repetitions from which the string is formed
* an `Int` for the Unicode character to be represented

## e) Zoology

Basis: `src/main/kotlin/exrc/chpt_030/e_animals.kt`

Bring the specified classes into a meaningful inheritance hierarchy.

## g) Task

Basis: `src/main/kotlin/exrc/chpt_030/g_task.kt`

Write a class `Task`, which has a name and an optional priority as `Byte`. This
can be in the range 1-5. The default is 3.

The name is final, the priority can be changed and queried at any time.

Make sure that instances always have a priority value and that this is within the valid range.

### Bonus:

Let the `Task` class implement the `Runnable` interface -- but now `Task` itself must be abstract.

Then write a class `DelegatingTask`, which receives another `Runnable` instance as an additional constructor parameter.

The `DelegatingTask.run()` function simply delegates to that Runnable instance ("don't work late, delegate!" :)

## i) Abstract zoology with interfaces

File: `src/main/kotlin/exrc/chpt_030/animal-interfaces.kt`

The class `Animal` should be abstract and offer an abstract property `name: String`.

Write subclasses for animal genera or concrete animals that derive from them. Use
the existing interfaces if this is relevant for your species or animal.

Ideas: `Mammal`, `Fish`, `Shark`, `BlueWhale`, `Orca`, `Lion`

The interfaces should be extended so that:

* an animal with fins knows how many there are (property `finCount: Int`)
* an animal with teeth can bite another animal (Function `bite(animal: Animal)`)

PS:

1. not all mammals have teeth, e.g., some whales have no teeth (blue whale)
2. not all fish have teeth either, e.g., carps have none (at least not in their jaws, which is what is meant here)

## k) Extended Library

Basis: `src/main/kotlin/exrc/chpt_030/k_extended-library.kt`

Take a look at the existing `Library` class.

This needs a `Book` class to work. Please create this.

Then create an **extension** function for the `Library` class (e.g., because we cannot/do not want to change this class),
which calculates a map for all books that contains an alphabetically sorted list of book titles by author.

## m) Roman numerals II

Basis: `src/main/kotlin/exrc/chpt_030/m_roman-numbers2.kt`

Rewrite the exercise on Roman numerals to enums.

## o) Expense Report

There is a refactoring exercise on GitHub called "Expense Report", which is available in many programming languages.

Take a look at the Kotlin variant and optimize the existing code:

https://github.com/christianhujer/expensereport/blob/trunk/expensereport-kotlin/src/main/kotlin/com/nelkinda/training/ExpenseReport.kt

## q) What's our Vector, Victor?

Create some class `Vector`, which describes an X/Y coordinate. This can be a data or regular class.

Instances (shown below as "V") of this class should be able to be processed using the following operators:

* Plus (V + V)
* Minus (V - V)
* Negation (-V)
* Destructuring
* Access to x/y using `V['x']` or `V['y']`

## r) Lazy Id

Extend the `Task` class with an `id` property, which is created using delegation method "lazy".

https://www.baeldung.com/kotlin/late-vs-lazy-init#lazy-initialization

When the property is queried for the first time, it should be calculated once as a UUID.

You are welcome to generate an output in an `init{}` block that indicates when an instance is ready and also
when calculating the id. This way you can see what happens in which order...

