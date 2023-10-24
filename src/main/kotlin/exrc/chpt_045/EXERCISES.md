# Übungen zum Kapitel "Collections & Sequences"

## a) Monate und Jahre

Erstellen Sie eine `Sequence`, welche die Jahre von 2000 bis 2020 aufzählt.

Für jeder Jahr wollen wir eine weitere Sequenz der Monate 1 bis 12 haben.

Für jede Kombination von Jahr und Monat erzeugen Sie eine `LocalDate` Instanz zum
jeweiligen ersten Tag des Monats.

Geben Sie für jede Datumsangabe den Abstand zum vorherigen Datum aus (Tipp: `ChronoUnit.DAYS.betweenn()`)

