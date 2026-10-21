# Exercises for the chapter "Introduction"

## a) Hello World

Write a Kotlin program that produces some output on the command line.

You can put the code in this package.

Then run your program in the IDE.

## b) Decompile to Java

IntelliJ can decompile a `.class` file generated from Kotlin into Java.

This nicely shows how Kotlin actually works internally.

Look in the folder `target/classes/exrc/chpt_010` for the
`.class` file created by this exercise.

Then: Menu > Tools > Kotlin > Decompile to Java

## c) Change the Kotlin version

This project is built with Maven, so the Kotlin version is defined in the build file, not in the IDE settings.

Change the property `kotlin.version` in `pom.xml`, e.g. from `2.2.21` to `2.1.20`, and reload the Maven project (Maven tool window > Reload All Maven Projects).

Then check where the new version shows up:

- Settings > Build, Execution, Deployment > Compiler > Kotlin Compiler: "Kotlin compiler version"
- Project tool window > External Libraries: `kotlin-stdlib`

Set the version back to `2.2.21` afterwards.

## d) Kotlin Compiler (optional)

Install the Kotlin compiler from https://github.com/JetBrains/kotlin/releases

On the command line, change to the root directory of the project.

Compile your program from the command line, e.g.:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -d bin
````

and then run it:

```` shell
kotlin -cp bin exrc.chpt_010.HelloKt
````

Or compile the program so that Kotlin creates a self-contained JAR including the runtime:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -include-runtime -d bin/hello.jar 
````

You can then run it like a regular Java JAR:

```` shell
java -jar bin/hello.jar
````
