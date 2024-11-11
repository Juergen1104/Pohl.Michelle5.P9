// Michelle Pohl
public class VierGewinntSpiel extends Spiel {

    public VierGewinntSpiel() {
        // Erzeuge ein Spiel mit zwei Spielern und einem VierGewinntBrett mit 7 Spalten und 6 Zeilen
        super(2, new VierGewinntBrett(6, 7), 21);
    }

    public static void main(String[] args) {
        VierGewinntSpiel spiel = new VierGewinntSpiel();
        spiel.spielen();
    }

    @Override
    public void ziehen(Spieler spieler) {
        int spalte;

        while (true) {
            System.out.println("Spieler Nr. " + spieler.getID());
            System.out.print("Spalte eingeben: ");

            spalte = IOTools.readInteger("Spalte eingeben: ");
            spalte--;

            if (spalte >= 0 && spalte < brett.anzSpalten && brett.hinzufuegen(spieler, spalte, -1)) {
                break;  // Beende die Schleife, wenn der Zug gültig ist und erfolgreich hinzugefügt wurde
            } else {
                System.out.println("Ungültige Spalte oder Spalte ist voll. Bitte erneut versuchen.");
            }
        }
    }
}
