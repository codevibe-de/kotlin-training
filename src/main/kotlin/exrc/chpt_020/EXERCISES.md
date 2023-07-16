# Übungen zum Kapitel "Syntax"

## Ein Brief

Lassen Sie einen Multi-Line String ausgeben, in dem Sie folgende Inhalte per Template Expressions einfügen:

* Konstanten
* Variablen
* Rückgabe von Funktionsaufrufen

## Argumente parsen

Schreiben Sie ein Programm, welchem Kommandozeilenargumente in der Form `<value>:<type>` übergeben werden können, wie
z.B. "123:Int" und "true:Boolean".

Ihr Programm soll diese Paare aufsplitten und dann je nach Typangabe in die entsprechende native Form umwandeln und
diesen dann als Erfolgsmeldung ausgeben.

Dabei auftretende Fehler lassen wir unbehandelt auftreten.

## Bücherei

Sie beginnen die Geschäftslogik für eine Bücherei zu entwickeln.

Dabei ist der zentrale Bestandteil die Funktion `addBook`, die folgende Parameter verarbeiten kann:

* `title: String`, erforderlich
* `isbn: String`, optional, Default-Wert ""
* `price: Float`, optional, Default-Wert 0.0
* `author: String`, optional, Default-Wert ""

Der Methodenkörper macht vorerst nur ein einfaches `println` mit den Parametern.

Rufen Sie die Methode mit folgenden Argument-Kombinationen auf:

* für alle Parameter
* title, isbn, price
* title, price
* title, isbn, author

## Fehlerbehandlung beim Argumente parsen

Ergänzen Sie nun den Argumente-Parser von vorhin um eine Fehlerbehandlung, sodass fehlerhafte Werte übersprungen und die
danach folgenden doch noch geparst werden.

## Statistik

Schreiben Sie eine Methode, die

* eine beliebige Anzahl an `Int` Werten
* sowie eine Berechnungsart als String ("sum", "min", "max", "avg")

annimmt. Je nach Berechnungsart sollen die Zahlen entsprechend berechnet und als `Int` zurückgegeben werden.

## Römische Zahlen

Schreiben Sie eine Funktion, welche aus einer römischen Zahl eine dezimale Zahl berechnet:

* I = 1
* II = 2
* LXIV = 64
* XCIX = 99
* MCMIX = 1909

Es gilt also die Subtraktionsregel: https://de.wikipedia.org/wiki/R%C3%B6mische_Zahlschrift#Subtraktionsregel

Weitere Überprüfungen auf die Reihenfolge der Zeichen braucht nicht zu erfolgen...

Hilfreich für die Lösung ist das `CharArray`, welches aus einem String erzeugt werden kann.

## Gemappte Bücherei

Es gibt eine Reihe an Büchern in Ihrer Bücherei. Diese wollen wir auf zwei Arten verwalten:

* ein 1:1 Mapping von ISBN auf ein Buch
* ein 1:n Mapping von einem Autor auf seine Bücher

Schreiben Sie die zwei Funktionen, welche für jedes Mapping eine `Map` erstellen.

## Bücherei Import

Wir lesen eine Liste an Büchern von einer suboptimal konzipierten CSV Datei ein.

Diese finden Sie im Projekt unter dem Namen `books.csv`. Jede Zeile hat folgendes Format:

````text
<isbn>,<title> (<author>),"<price>","<description>"
````

Lesen Sie die Datei Zeile für Zeile ein (z.B. mit `File.readLines()`) und extrahieren Sie die
notwendigen Informationen, um das Buch der Bücherei hinzuzufügen. 

## 

Erstellen Sie eine eigene `BooksMap` Klasse, welche von einer `Map` erbt und nur Bücher verwalten kann.

