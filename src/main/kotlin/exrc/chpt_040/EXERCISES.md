# Übungen zum Kapitel "Funktionale Programmierung"

## a) Mini-Pipeline

Grundlage: `src/main/kotlin/exrc/chpt_040/a_lambda.kt`

Definieren Sie die zwei fehlenden Lambdas als Variablen mit Namen `mapper` und `consumer`, sodass die Ausgabe von
"101010" auf der Konsole bei Programmstart erfolgt.

## b) Erweiterte Pipeline

Grundlage: `src/main/kotlin/exrc/chpt_040/b_firstclass.kt`

Entkommentieren Sie alle kommentierten Zeilen in der oben genannten Datei.

Ziel soll sein, dass die Verarbeitungs-Pipeline

* mittels einer Generator-Funktion die Zahlen 1 bis 10 verarbeitet (daher wird dieses Lambda innerhalb der Schleife
  erzeugt)
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

Sie sind nun mit komplexeren Daten konfrontiert. Als Input bekommen Sie eine Liste von Bestellungen, jede hat
eine Menge an bestellten Produkt-Ids.

Ihre Aufgabe ist es, diese in eine gesamthafte Menge an Ids zu bringen:

`List<Order(productIds:Set<String>)> => Set<String>`

### Bonus

Konvertieren Sie den Input in eine `Map<String, Int>`, sodass für jede Id die Anzahl Bestellungen
definiert ist.