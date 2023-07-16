# Übungen zum Kapitel "Einführung"

## Hello World

Schreiben Sie ein Kotlin Programm, welches eine Ausgabe auf der Kommandozeile macht.

Sie können den Code in diesem Package platzieren.

Starten Sie dann Ihr Programm in der IDE.

## Kotlin Compiler (optional)

Installieren Sie den Kotlin Compiler. Kompilieren Sie Ihr Programm von der Kommandozeile:

```` shell
kotlinc-jvm <source-file> -d <out-dir>
````

und führen es dann aus:

```` shell
kotlin -cp <out-dir> <package>.<class>
````

Oder kompilieren Sie das Programm, sodass Kotlin ein self-contained JAR inkl. Runtime erstellt:

```` shell
kotlinc-jvm hello.kt -include-runtime -d hello.jar 
````

Dieses können Sie dann wie ein gewöhnliches Java JAR starten:

```` shell
java -jar hello.jar
````
