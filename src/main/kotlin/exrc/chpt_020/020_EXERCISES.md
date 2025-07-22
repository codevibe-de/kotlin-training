# Übungen zum Kapitel "Syntax"

## a) Vielfache von 3 und 5

Schreiben Sie ein Programm, welches für alle Zahlen unterhalb einer gegebenen Obergrenze die Zahlen addiert, die
entweder durch 3 oder 5 teilbar sind. Ist eine Zahl durch beides teilbar, so wird diese nur einmal gezählt.

````text
addUp(3) = 0
addUp(10) = 23    // da 3 + 5 + 6 + 9
````

Lambdas kommen erst später, Sie können diese Übung gerne noch ohne Lambdas entwickeln. Auch hierfür gibt es
spannende Möglichkeiten :)

## c) Bücherei

Sie beginnen die Geschäftslogik für eine Bücherei zu entwickeln.

Dabei ist der zentrale Bestandteil die Funktion `addBook`, die folgende Parameter verarbeiten kann:

* `title: String`, erforderlich
* `isbn: String`, optional, Default-Wert "?"
* `price: Float`, erforderlich
* `author: String`, optional, Default-Wert "??"

Der Methodenkörper macht vorerst nur ein einfaches `println` mit den Parametern. Hier können Sie einen
einzeiligen oder auch mehrzeiligen String zusammenbasteln :)

Nun rufen Sie die Methode mit folgenden Argument-Kombinationen auf:

* alle Parameter
* nur title, isbn, price
* nur title, price
* nur title, price, author (dabei jedes der drei Argumente benennen)

### Bonus:

Erlauben Sie, dass ein oder mehrere Bücher per Kommandozeilenparameter definiert werden können. Dies
kann im Format `<title>:<price>` erfolgen.

Ihr Programm soll diese Paare aufsplitten und daraus Funktionsaufrufe generieren.

Aufsplitten geht z.B. mittels folgender Anweisung. Dieses nutzt "Destructuring", was wir später noch
ausführlich kennenlernen:

````kotlin
val parts = arg.split(":")
val (titleString, priceString) = parts
````

Beim Parsen auftretende Fehler können Sie gerne behandeln.

## e) Statistik

Schreiben Sie eine Methode, die

* eine beliebige Anzahl an `Int` Werten
* sowie eine Berechnungsart als String ("sum", "min", "max", "avg")

annimmt. Je nach Berechnungsart sollen die Zahlen entsprechend berechnet und als `Int` zurückgegeben werden.

## f) Römische Zahlen

Schreiben Sie eine Funktion, welche aus einer römischen Zahl eine dezimale Zahl berechnet:

* I = 1
* II = 2
* LXIV = 64
* XCIX = 99
* MCMIX = 1909

Es gilt also die Subtraktionsregel: https://de.wikipedia.org/wiki/R%C3%B6mische_Zahlschrift#Subtraktionsregel

Weitere Überprüfungen auf die Reihenfolge der Zeichen brauchen nicht zu erfolgen...

Hilfreich für die Lösung ist das `CharArray`, welches aus einem String erzeugt werden kann.

## g) Gemappte Bücherei

*Hinweise: Etwas Code ist in der Datei `g_collections.kt` vorbereitet. In dieser Übung bitte noch 
nicht mit Streams/Funktional arbeiten!*

Es gibt eine Reihe an Büchern in Ihrer Bücherei. Diese wollen wir auf zwei Arten verwalten:

* ein 1:1 Mapping von ISBN auf Buchtitel
* ein 1:n Mapping von einem Autor auf seine Buchtitel

Beginnen Sie damit, die zwei Variablen für diese Maps anzulegen. Welche generischen Typen müssen die Maps
jeweils haben?

In der `addBook2()` Funktion sollen dann beide Variablen (Mappings) anhand der übergebenen Argumenten befüllt werden.

Für das 1:n Mapping sind insbesondere die Methoden `containsKey` und `getValue` der Map hilfreich.

### Bonus:

Wir lesen eine Liste an Büchern von einer suboptimal konzipierten CSV Datei ein.

Diese finden Sie im Projekt unter dem Namen `books.csv`. Jede Zeile hat folgendes Format (die
Zeichen "<" und ">" sind kein Literal und gehören zum Platzhalter):

````text
<isbn>,<title> (<author>),"<price>","<description>"
````

Lesen Sie die Datei Zeile für Zeile ein (siehe vordefinierte Funktion `readLinesFromFile()`) und extrahieren Sie die
notwendigen Informationen, um das Buch der Bücherei hinzuzufügen. Dies kann geschickt mit einer `Regex`
erfolgen, die Sie z.B. mit https://regex101.com/ entwickeln können.

## j) Extension Functions

*Hinweise: Etwas Code ist in der Datei `j_extensionFunctions.kt` vorbereitet.
Diesen auskommentieren und zum Laufen bringen :)*

Sie können sich an drei möglichen _Extension Functions_ für den Typ `String` austoben:

1. Zählen der Anzahl Vokale (inklusive Umlaute)
2. Umwandlung in Camelcase ("Wir lernen Kotlin" wird zu "WirLernenKotlin")
3. Einfügen eines Leerzeichens zwischen jedem Buchstaben ("Hallo" wird zu "H a l l o")

Hinweise:

* einen `String` splitten: `String.split()`
* auf einen `Char` eines Strings zugreifen mit `str[0]` oder mittels `for(c in string)` auf dem String
  (denn ein String ist mittels Index-Operator iterierbar)
* sowohl `String` als auch `Char` bieten Funktionen zur Umwandlung der Groß-/Kleinschreibung, aber bei
  einem `Char` ist der Rückgabewert dann ein `String`!

