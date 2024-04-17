# Übungen zum Kapitel "Objektorientierte Programmierung"

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

## g) Task

Grundlage: `src/main/kotlin/exrc/chpt_030/g_task.kt`

Schreiben Sie eine Klasse `Task`, welche einen Namen und eine optionale Priorität als `Byte` hat. Diese
kann im Bereich 1-5 liegen. Standard ist 3.

Der Name ist final, die Priorität kann jederzeit geändert und abgefragt werden.

Stellen Sie sicher, dass Instanzen immer einen Wert für die Priorität haben und dass dieser im gültigen Bereich liegt.

### Bonus:

Lassen Sie den Task das Interface `Runnable` implementieren -- nun muss der Task an sich aber auch abstrakt
werden. Das Thema hatten wir noch nicht, ist aber nicht schwer: Einfach wie in Java `abstract` vor den Klassennamen
schreiben.

Schreiben Sie dann eine Klasse `DelegatingTask` welche als zusätzlichen Konstruktor-Parameter eine andere
`Runnable` Instanz erhalten kann. In der `run()` Funktion vom `DelegatingTask` wird dann an dieses andere `Runnable`
einfach der `run()` Aufruf delegiert (denn: "don't work late, delegate!" :))

## i) Abstrakte Zoologie mit Schnittstellen

Datei: `src/main/kotlin/exrc/chpt_030/animal-interfaces.kt`

Die Klasse `Animal` soll abstrakt sein und ein abstraktes Property `name: String` anbieten.

Schreiben Sie Subklassen für Tiergattungen oder konkrete Tiere, die davon ableiten. Nutzen Sie
die vorhandenen Interfaces, **wenn dies für die jeweilige Gattung oder das Tier relevant ist**.

Ideen: `Mammal`, `Fish`, `Shark`, `BlueWhale`, `Orca`, `Lion`

Die Interfaces sollen erweitert werden, sodass:

* ein Tier mit Flossen weiß, wie viele dies sind (Property `finCount: Int`)
* ein Tier mit Zähnen ein anderes beißen kann (Function `bite(animal: Animal)`)

PS:

1. nicht alle Säugetiere haben Zähne, z.B. haben manche Wale keine Zähne (z.B. Blauwal)
2. auch nicht alle Fische haben Zähne, z.B. haben Karpfen keine (zumindest nicht im Kiefer, was hier gemeint ist)

## k) Extended Library

Grundlage: `src/main/kotlin/exrc/chpt_030/k_extended-library.kt`

Schauen Sie sich die bestehende `Library` Klasse an.

Diese benötigt eine `Book` Klasse, um arbeiten zu können. Erstellen Sie bitte diese.

Schreiben Sie dann für die `Library`  
eine Extension-Function (z.B. weil wir diese Klasse nicht verändern können/wollen), die für alle Bücher eine Map
berechnet, welche je Autor eine alphabetisch
sortierte Liste seiner/ihrer Buch-Titel aggregiert.

## m) Römische Zahlen II

Grundlage: `src/main/kotlin/exrc/chpt_030/m_roman-numbers2.kt`

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

https://www.baeldung.com/kotlin/late-vs-lazy-init#lazy-initialization

Bei der ersten Abfrage des Properties soll dieses einmalig als UUID berechnet werden.

Gerne können Sie in einem `init{}` Block eine Ausgabe erzeugen, dass eine Instanz fertig ist und außerdem
bei der Berechnung der id eine Ausgabe machen. So kann man sehen, was in welcher Reihenfolge passiert ...

