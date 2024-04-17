# Übungen zum Kapitel "Funktionale Programmierung"

## a) Mini-Pipeline

Grundlage: `src/main/kotlin/exrc/chpt_040/a_lambda.kt`

Definieren Sie die zwei fehlenden Lambdas als Variablen mit Namen `mapper` und `consumer`, sodass die Ausgabe von
"101010" auf der Konsole bei Programmstart erfolgt:

- der `mapper` konvertiert die Zahl in deren binäre Repräsentation
- der `consumer` verarbeitet seinen Input durch Ausgabe des übergebenen Wertes (`println()`)

## b) Erweiterte Pipeline

Grundlage: `src/main/kotlin/exrc/chpt_040/b_firstclass.kt`

Entkommentieren Sie alle kommentierten Zeilen in der oben genannten Datei.

Ziel soll sein, dass die Verarbeitungs-Pipeline

* die Zahlen 1 bis 10 generiert / bereitstellt (Supplier)
* nur Zahlen beachtet, die durch eine gewisse, konfigurierbare Zahl teilbar sind (das Lambda soll mittels
  einer Funktion erzeugt werden)
* wie in a) aus den Zahlen einen binären String erstellt
* die binären Strings als Zeilen einer Datei hinzufügt (oder einfach nur per `println` ausgibt)

## d) Collection Pipeline

Grundlage: `src/main/kotlin/exrc/chpt_040/d_collection-operations.kt`

Implementieren Sie in der oben genannten Datei eine Verarbeitung-Pipeline auf Basis einer
Liste oder Range, welche den gleichen Output generiert wie oben in b). Die Variable `div` definiert die Zahl,
mittels der die "Ist-Teilbar-Durch" Prüfung stattfinden soll.

Sie brauchen also als Ausgangspunkt eine `List` oder z.B. auch eine `Range` Instanz, auf der dann die
Verarbeitungs-Pipeline definiert wird.

Nehmen Sie dafür die vorhandenen Collection-Operations wie

* `filter()`
* `map()`
* `forEach()`

## e) Reduzierung

Grundlage: `src/main/kotlin/exrc/chpt_040/e_reduction.kt` (Kommentare entfernen)

Sie sind nun mit komplexeren Daten konfrontiert. Als Input bekommen Sie eine Liste von Bestellungen, jede hat
eine Menge an bestellten Produkt-Ids.

Ihre Aufgabe ist es, diese in eine gesamthafte Menge (`Set`) an bestellen Produkt-Ids zu bringen:

`List<Order> => Set<String>`

### Bonus

Konvertieren Sie den Input in eine `Map<String, Int>`, sodass für jede Produkt-Id die Anzahl Bestellungen
berechnet wird (Tipp: `groupingBy`)