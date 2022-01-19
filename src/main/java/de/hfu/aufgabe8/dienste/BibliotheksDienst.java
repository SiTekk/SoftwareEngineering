package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;

public class BibliotheksDienst
{
    private static Nutzerverwaltung nutzerverwaltung;
    private static Medienverwaltung medienverwaltung;

    private static boolean initialized = false;

    public static void initialize()
    {
        if (!initialized)
        {
            nutzerverwaltung = new Nutzerverwaltung();
            medienverwaltung = new Medienverwaltung();

            Standort hfu_Bibliothek = new Standort();
            Medium medium1 = new Buch("Informatik 1", "Olaf Nei�e", "0000001", "Programmierung 1", Genre.Informatik, LocalDate.of(2000, 1, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium2 = new Buch("Informatik 2", "Olaf Nei�e", "0000002", "Programmierung 2", Genre.Informatik, LocalDate.of(2000, 1, 2), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium3 = new Buch("Softwareengineering 1", "Bernhard Hollunder", "0000003", "Softwareengineering f�r Dummies 1", Genre.Informatik, LocalDate.of(2000, 1, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium4 = new Buch("Softwareengineering 2", "Bernhard Hollunder", "0000004", "Softwareengineering f�r Dummies 2", Genre.Informatik, LocalDate.of(2000, 1, 2), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium5 = new Buch("Automaten und Formale Sprachen 1", "Bernhard Hollunder", "0000005", "Krasse Dinge in der Informatik", Genre.Comedy, LocalDate.of(2000, 2, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium6 = new Buch("Automaten und Formale Sprachen 2", "Bernhard Hollunder", "0000006", "Kellerautomaten und Co", Genre.Informatik, LocalDate.of(2000, 2, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");

            Medium medium7 = new Tontraeger("Datenbanken 1", "Lothar Piepmeyer", "0000007", "SELECT * FROM K�NNEN", Genre.Thriller, LocalDate.of(1945, 5, 8), "HFU Boss", "Deutsch", 120, "Lothar Piepmeyer");
            Medium medium8 = new Tontraeger("Datenbanken 2", "Lothar Piepmeyer", "0000008", "SELECT * FROM K�NNEN", Genre.Fantasy, LocalDate.of(1945, 3, 9), "HFU Boss", "Deutsch", 60, "Piepmeyer");
            Medium medium9 = new Tontraeger("Datenbanken 3", "Lothar Piepmeyer", "0000009", "SELECT * FROM K�NNEN", Genre.Roman, LocalDate.of(1945, 3, 10), "HFU Boss", "Deutsch", 90, "Piepmeyer");
            Medium medium10 = new Tontraeger("Datenbanken 4", "Lothar Piepmeyer", "0000010", "SELECT * FROM K�NNEN", Genre.SciFi, LocalDate.of(1945, 3, 11), "HFU Boss", "Deutsch", 33, "Piepmeyer");

            medienverwaltung.mediumErfassen(medium1, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium2, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium3, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium4, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium5, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium6, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium7, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium8, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium9, hfu_Bibliothek);
            medienverwaltung.mediumErfassen(medium10, hfu_Bibliothek);


            nutzerverwaltung.nutzerHinzufuegen("Donald", "Duck", "dduck", "1234" );

            initialized = true;

            /*
            System.out.println("\nKunde 2 leiht 5 Medien aus:");
            medienverwaltung.mediumAusleihen(medium5, kunde2);
            medienverwaltung.mediumAusleihen(medium7, kunde2);
            medienverwaltung.mediumAusleihen(medium8, kunde2);
            medienverwaltung.mediumAusleihen(medium9, kunde2);
            medienverwaltung.mediumAusleihen(medium10, kunde2);
            */
        }
    }

    public static Nutzerinterface getNutzerinterface()
    {
        if(!initialized)
            throw new NullPointerException("Bilbiotheksdienst wurde noch nicht initialisiert!");
        else
            return nutzerverwaltung;
    }

    public static Medieninterface getMedieninterface()
    {
        if(!initialized)
            throw new NullPointerException("Bilbiotheksdienst wurde noch nicht initialisiert!");
        else
            return medienverwaltung;
    }
}
