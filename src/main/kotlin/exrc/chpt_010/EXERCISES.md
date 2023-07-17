# Übungen zum Kapitel "Einführung"

## Hello World

Schreiben Sie ein Kotlin Programm, welches eine Ausgabe auf der Kommandozeile macht.

Sie können den Code in diesem Package platzieren.

Starten Sie dann Ihr Programm in der IDE.

## Decompile to Java

Sie können mit Intellij eine aus Kotlin generierte `.class` Datei in Java decompilen.

Daran kann man schön erkennen, wie Kotlin intern eigentlich arbeitet.

Schauen Sie in dem Order `out/production/kotlin-training/exrc/chpt_010` nach der
`.class` Datei, die durch diese Übung entstanden ist.

Dann: Menü > Tools > Kotlin > Decompile to Java

## Kotlin Compiler (optional)

Installieren Sie den Kotlin Compiler.

Wechseln Sie auf der Kommandozeile in das Root-Verzeichnis des Projekts.

Kompilieren Sie Ihr Programm von der Kommandozeile, also z.B.:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -d bin
````

und führen es dann aus:

```` shell
kotlin -cp bin exrc.chpt_010.HelloKt
````

Oder kompilieren Sie das Programm, sodass Kotlin ein self-contained JAR inkl. Runtime erstellt:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -include-runtime -d bin/hello.jar 
````

Dieses können Sie dann wie ein gewöhnliches Java JAR starten:

```` shell
java -jar bin/hello.jar
````
