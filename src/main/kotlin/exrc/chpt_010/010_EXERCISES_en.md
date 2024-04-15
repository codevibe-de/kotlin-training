# Exercises for the chapter "Introduction"

## Hello World

Write a Kotlin program that produces some output on the command line.

You can place the code in this package.

Then start your program in the IDE.

## Decompile to Java

You can use Intellij to decompile a Kotlin generated `.class` file to Java.

This is a good way to see how Kotlin actually works internally.

Look in folder `out/production/kotlin-training/exrc/chpt_010` for the
`.class` file created by this exercise.

Then: Menu > Tools > Kotlin > Decompile to Java

## Change the Kotlin version

Change the Kotlin **compiler** version via the *IDE global* settings.

Change the version of the **Kotlin Runtime Library** via the *IDE module* settings.

## Kotlin Compiler (optional)

Install the Kotlin Compiler from https://github.com/JetBrains/kotlin/releases

Change to the root directory of the project on the command line.

Compile your program from the command line, e.g:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -d bin
````

and then execute it:

```` shell
kotlin -cp bin exrc.chpt_010.HelloKt
````

Or compile the program so that Kotlin creates a self-contained JAR including runtime:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -include-runtime -d bin/hello.jar 
````

You can then start this like a normal Java JAR:

```` shell
java -jar bin/hello.jar
````
