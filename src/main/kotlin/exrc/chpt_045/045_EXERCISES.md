# Übungen zum Kapitel "Collections & Sequences"

## a) Monate und Jahre

Erstellen Sie eine `Sequence`, welche die Jahre 1900, 2000 und 2100 aufzählt.

Für jedes Jahr wollen wir eine weitere Sequenz der Monate 1 bis 12 haben.

Für jede Kombination von Jahr und Monat erzeugen Sie eine `LocalDate` Instanz zum
jeweiligen ersten Tag des Monats.

Geben Sie für jede Datumsangabe den Abstand zum vorherigen Datum aus (Tipp: `ChronoUnit.DAYS.betweenn()`)

