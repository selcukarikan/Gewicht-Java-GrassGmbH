
import java.util.LinkedList;
public class Gewicht {
            private LinkedList<Integer> gewichtListe;

            public Gewicht() {
                gewichtListe = new LinkedList<>();
            }

            public int setWeight(int weight) {
                if (weight > 0 && weight <= 200) {
                    gewichtListe.add(weight);
                    if (gewichtListe.size() > 10) {
                        gewichtListe.removeFirst();
                    }
                    return 0;
                } else {
                    return -2;
                }
            }

            public int ermittleSummierung() {
                int summierung = 0;
                for (int gewicht : gewichtListe) {
                    summierung += gewicht;
                }
                return summierung;
            }

            public double ermittleDurchschnittwert() {
                if (gewichtListe.isEmpty()) {
                    return 0.0;
                } else {
                    int summierung = ermittleSummierung();
                    return (double) summierung / gewichtListe.size();
                }
            }

            public static void main(String[] args) {
                Gewicht gewicht = new Gewicht();

                // Beispielverwendung
                int[] gewichte = {150, 180, 220, 170, 190, 200, 160, 210, 140, 130, 250};

                for (int gewichtWert : gewichte) {
                    int ergebnis = gewicht.setWeight(gewichtWert);
                    if (ergebnis == 0) {
                        System.out.println(gewichtWert + " kg wurde hinzugefügt.");
                    } else {
                        System.out.println("Fehler: " + gewichtWert + " kg konnte nicht hinzugefügt werden. (Fehlercode: " + ergebnis + ")");
                    }
                }

                System.out.println("Summierung der letzten 10 Gewichte: " + gewicht.ermittleSummierung() + " kg");
                System.out.println("Durchschnitt der letzten 10 Gewichte: " + gewicht.ermittleDurchschnittwert() + " kg");
            }
        }

