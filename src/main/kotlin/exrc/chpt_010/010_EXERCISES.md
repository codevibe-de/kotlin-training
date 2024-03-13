# Übungen zum Kapitel "Einführung"

## Hello World

Schreiben Sie ein Kotlin Programm, welches eine Ausgabe auf der Kommandozeile macht.

Sie können den Code in diesem Package platzieren.

Starten Sie dann Ihr Programm in der IDE.

## Decompile to Java

Sie können mit Intellij eine aus Kotlin generierte `.class` Datei in Java dekompilieren.

Daran kann man schön erkennen, wie Kotlin intern eigentlich arbeitet.

Schauen Sie in dem Ordner `out/production/kotlin-training/exrc/chpt_010` nach der
`.class` Datei, die durch diese Übung entstanden ist.

Dann: Menü > Tools > Kotlin > Decompile to Java

## Änderung der Kotlin Version

Ändern Sie die Kotlin Compiler Version über die globalen Settings.

Ändern Sie die Version der Kotlin Runtime Library über die Modul-Settings.

## Kotlin Compiler (optional)

Installieren Sie den Kotlin Compiler von https://github.com/JetBrains/kotlin/releases

Wechseln Sie auf der Kommandozeile in das Root-Verzeichnis des Projekts.

Kompilieren Sie Ihr Programm von der Kommandozeile, also z.B.:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -d bin
````

und führen es dann aus:

```` shell
kotlin -cp bin exrc.chpt_010.HelloKt
````

Oder kompilieren Sie das Programm, sodass Kotlin ein self-contained JAR inklusive Runtime erstellt:

```` shell
kotlinc-jvm src/main/kotlin/exrc/chpt_010/hello.kt -include-runtime -d bin/hello.jar 
````

Dieses können Sie dann wie ein gewöhnliches Java JAR starten:

```` shell
java -jar bin/hello.jar
````
