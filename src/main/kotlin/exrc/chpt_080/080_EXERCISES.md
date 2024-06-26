# Übungen zum Kapitel "Testing"

## a) FactorialCalculator

File: `src/main/kotlin/exrc/chpt_080/a_assertions.kt`

Schreiben Sie zwei Testfälle für die vorhandene Klasse `FactorialCalculator`.

* wird eine Exception mit richtiger Message für falschen Input erzeugt?
* stimmt das Ergebnis für eine Reihe an vorgegebenen Inputs und erwarteten Outputs?

Die Testfälle können Sie per Intellij generieren lassen (Code > Generate). Da wir keinen separaten Test-Source Ordner
haben darf der Testfall Sourcecode in das gleiche Verzeichnis (ausnahmsweise ...)

## c) OrderService

File: `src/main/kotlin/exrc/chpt_080/c_orderService.kt`

Es gibt einen `OrderService`, der über einen `ProductApiClient` einen Drittservice nach Produktdetails anfragt.

Den API-Client wollen wir mocken, um die Geschäftslogik des Service zu testen:

* bei der ersten Anfrage nach `isAvailable()` liefert der Client ein `false`, danach ein `true` (Hint: `returnsMany()`)
* die beiden vorhandenen Produkte sollen je Anfrage zurückgegeben werden

Folgende Dinge sind zu tun:

1. den Mock programmieren
2. die Geschäftslogik von `OrderService.calculateOrderTotal` implementieren (als Übung zu List-Operations)
3. den Mock auf korrekte Aufrufe überprüfen (für beide Funktionen des API-Clients)

