# Übungen zum Kapitel "Generics"

## a) NumberKeyedMap

Erstellen Sie eine Klasse `NumberKeyedMap`, welche als Key-Typ `K` nur Zahlen akzeptiert (`Number`).
Für die Werte `V` kann jeder beliebige Typ genommen werden.

Diese Map soll Funktionen für die Ermittlung des kleinsten und größten Keys anbieten. Da `Number` an
sich nicht vergleichbar ist in Kotlin, kann eine Sortierung z.B. mittels `sortedBy { it.toDouble() }`
erreicht werden.