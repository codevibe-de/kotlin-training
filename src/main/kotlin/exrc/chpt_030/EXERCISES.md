# Übungen zum Kapitel "Objektoriente Programmierung"

## Konstruktor

Schreiben Sie eine Klasse `SuperString`, welche auf drei Arten erzeugt werden kann:

* mit Angabe des darzustellenden Strings
* aus Angabe eines Characters und der Anzahl Wiederholungen, woraus der String gebildet wird
* einem Int für den darzustellenden Unicode Charakter

## Stack

Schreiben Sie eine Klasse `Stack`, also eine Datenklasse, welche einen Stapel von
Werten verwaltet. Dieser bietet folgende Methoden:

* `peek(): String` -- liefert den obersten Wert auf dem Stack
* `push(v: String): Unit` -- legt einen Wert auf dem Stack ab
* `pop(): String` -- entfernt den obersten Wert vom Stack und gibt ihn zurück

Gerne können Sie statt `String` auch einen generischen Typen `<T>` nehmen.

## Vererbung

Datei: `src/main/kotlin/exrc/chpt_030/animals.kt`

Bringen Sie die angegebenen Klassen und Interfaces in eine sinnvolle Vererbungshierachie.

Erweitern Sie die Interfaces, sodass

* jedes Tier einen Namen haben kann
* ein Tier mit Flossen weiß, wie viele dies sind ("finCount")
* ein Tier mit Zähnen weiß, ob diese wieder nachwachsen ("hasRegeneratingTeeth")

Dies hat natürlich auch Auswirkungen auf die Klassen.

## Expense Report

Es gibt auf Github eine Refactoring-Übung names "Expense Report", die in vielen Programmiersprachen vorliegt.

Schauen Sie sich die Kotlin Variante an und optimieren Sie den bestehenden Code:

https://github.com/christianhujer/expensereport/blob/trunk/expensereport-kotlin/src/main/kotlin/com/nelkinda/training/ExpenseReport.kt

## Operatoren

Erstellen Sie eine Klasse `Vector`, welche eine X/Y Koordinate beschreibt.

Instanzen (unten als "V" dargestellt) sollen mittels folgender Operatoren verarbeitet werden können:

* plus (V+V)
* minus (V-V)
* faktor (V*f)
* negation (-V)
* Zugriff auf x/y V["x"] ????

## Interface Properties

aÜberarbeiten Sie die Tier-Hierarchie so, dass statt Funktionen Properties in den Interfaces verwendet werden.

## Property get/set

Schreiben Sie eine Klasse `Task`, welche einen Namen und eine optionale Priorität als `Byte` hat. Diese
kann im Bereich 1-5 liegen. Standard ist 3.

Der Name ist final, die Priorität kann jederzeit geändert und abgefragt werden.

Stellen Sie sicher, dass Instanzen immer einen Prioritätswert haben und dass dieser im gültigen Bereich liegt.

## Delegate Property

Erweitern Sie die `Task` Klasse um ein `id` Property, welches mittels Delegation "lazy" erzeugt wird.

Bei der ersten Abfrage des Properties soll dieses einmalig als UUID berechnet werden.

