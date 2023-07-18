# Übungen zum Kapitel "Objektoriente Programmierung"

## a) Stack

Grundlage: `src/main/kotlin/exrc/chpt_030/a_stack.kt`

Schreiben Sie eine Klasse `Stack`, also eine Datenklasse, welche einen Stapel von
`String` Werten verwaltet. Dieser bietet folgende Methoden:

* `peek(): String` -- liefert den obersten Wert auf dem Stack
* `push(v: String): Unit` -- legt einen Wert auf dem Stack ab
* `pop(): String` -- entfernt den obersten Wert vom Stack und gibt ihn zurück

Gerne können Sie statt `String` auch einen generischen Typen `<T>` nehmen.

## c) Konstruktor

Grundlage: `src/main/kotlin/exrc/chpt_030/c_constructor.kt`

Schreiben Sie eine Klasse `SuperString`, welche auf drei Arten erzeugt werden kann:

* mit Angabe des darzustellenden Strings
* aus Angabe eines `Char` und der Anzahl Wiederholungen, woraus der String gebildet wird
* einem `Int` für den darzustellenden Unicode Charakter 

## e) Zoologie

Grundlage: `src/main/kotlin/exrc/chpt_030/e_animals.kt`

Bringen Sie die angegebenen Klassen in eine sinnvolle Vererbungshierarchie.

## g) Task

Schreiben Sie eine Klasse `Task`, welche einen Namen und eine optionale Priorität als `Byte` hat. Diese
kann im Bereich 1-5 liegen. Standard ist 3.

Der Name ist final, die Priorität kann jederzeit geändert und abgefragt werden.

Stellen Sie sicher, dass Instanzen immer einen Prioritätswert haben und dass dieser im gültigen Bereich liegt.

## i) Abstrakte Zoologie mit Schnittstellen

Datei: `src/main/kotlin/exrc/chpt_030/animal-interfaces.kt`

Ergänzen Sie die bestehenden Tierklassen um Interfaces. Die Interfaces erweitern Sie aber vorher noch, sodass:

* jedes Tier einen Namen haben kann (Property `name: String`)
* ein Tier mit Flossen weiß, wie viele dies sind (Property `finCount: Int`)
* ein Tier mit Zähnen ein anderes beißen kann (Function `bite(animal:Animal)`)

Dies hat natürlich auch Auswirkungen auf die Klassen.

Vielleicht finden Sie auch Verwendung für eine *abstrakte* Klasse.

## k) Eine eigene BookMap

Erstellen Sie eine Klasse `BookMap`, die von `Map` ableitet.

Nutzen Sie diese, in der Übung wo wir Bücher gemappt haben.

Schreiben Sie für die `BookMap` eine Extension-Function, die für eine beliebige Anzahl an Autoren-Namen all deren 
Bücher alphabetisch nach Titel sortiert zurückgibt (eine Liste für alle Autoren).

## m) Römische Zahlen II

Schreiben Sie die Übung zu den römischen Zahlen auf Enums um.

## o) Expense Report

Es gibt auf Github eine Refactoring-Übung names "Expense Report", die in vielen Programmiersprachen vorliegt.

Schauen Sie sich die Kotlin Variante an und optimieren Sie den bestehenden Code:

https://github.com/christianhujer/expensereport/blob/trunk/expensereport-kotlin/src/main/kotlin/com/nelkinda/training/ExpenseReport.kt

## q) What's our Vector, Victor?

Erstellen Sie eine Klasse `Vector`, welche eine X/Y Koordinate beschreibt.

Instanzen (unten als "V" dargestellt) sollen mittels folgender Operatoren verarbeitet werden können:

* Plus (V+V)
* Minus (V-V)
* Negation (-V)
* Destructuring
* Zugriff auf x/y mittels V['x'] bzw. V['y']

## r) Lazy Id

Erweitern Sie die `Task` Klasse um ein `id` Property, welches mittels Delegation "lazy" erzeugt wird.

Bei der ersten Abfrage des Properties soll dieses einmalig als UUID berechnet werden.

