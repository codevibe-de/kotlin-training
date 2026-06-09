# Übungen zum Kapitel "Collections & Sequences"

## a) Monate und Jahre

Erstellen Sie eine `Sequence`, welche die Jahre 1900, 2000 und 2100 aufzählt.

Für jedes dieser Jahre soll eine weitere Sequenz die Monate 1 bis 12 aufzählen (innere Schleife).

Dann können wir für jede Kombination von Jahr und Monat eine `LocalDate` Instanz zum
jeweiligen ersten Tag des Monats erzeugen.

Geben Sie für jede dieser Datumsangaben den Abstand zum vorherigen Datum aus (Tipp: `ChronoUnit.DAYS.betweenn()`)

## b) Sequenzen erzeugen

Schauen Sie sich den Sourcecode `exrc/chpt_045/b_seq.kt` an und implementieren Sie die fehlende Funktionalität zur
Erzeugung von Sequenzen.
