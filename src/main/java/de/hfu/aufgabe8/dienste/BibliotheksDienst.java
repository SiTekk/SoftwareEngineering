package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;

public class BibliotheksDienst
{
    public static Nutzerverwaltung nutzerverwaltung;
    public static Medienverwaltung medienverwaltung;

    private static boolean initialized = false;

    public static void initialize()
    {
        if (!initialized)
        {
            nutzerverwaltung = new Nutzerverwaltung();
            medienverwaltung = new Medienverwaltung();

            Standort hfu_Bibliothek = new Standort();
            Medium medium1 = new Buch("Informatik 1", "Olaf Neiße", "0000001", "Programmierung 1", Genre.Informatik, LocalDate.of(2000, 1, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium2 = new Buch("Informatik 2", "Olaf Neiße", "0000002", "Programmierung 2", Genre.Informatik, LocalDate.of(2000, 1, 2), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium3 = new Buch("Softwareengineering 1", "Bernhard Hollunder", "0000003", "Softwareengineering für Dummies 1", Genre.Informatik, LocalDate.of(2000, 1, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium4 = new Buch("Softwareengineering 2", "Bernhard Hollunder", "0000004", "Softwareengineering für Dummies 2", Genre.Informatik, LocalDate.of(2000, 1, 2), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium5 = new Buch("Automaten und Formale Sprachen 1", "Bernhard Hollunder", "0000005", "Krasse Dinge in der Informatik", Genre.Comedy, LocalDate.of(2000, 2, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
            Medium medium6 = new Buch("Automaten und Formale Sprachen 2", "Bernhard Hollunder", "0000006", "Kellerautomaten und Co", Genre.Informatik, LocalDate.of(2000, 2, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");

            Medium medium7 = new Tontraeger("Datenbanken 1", "Lothar Piepmeyer", "0000007", "SELECT * FROM KÖNNEN", Genre.Thriller, LocalDate.of(1945, 5, 8), "HFU Boss", "Deutsch", 120, "Lothar Piepmeyer");
            Medium medium8 = new Tontraeger("Datenbanken 2", "Lothar Piepmeyer", "0000008", "SELECT * FROM KÖNNEN", Genre.Fantasy, LocalDate.of(1945, 3, 9), "HFU Boss", "Deutsch", 60, "Piepmeyer");
            Medium medium9 = new Tontraeger("Datenbanken 3", "Lothar Piepmeyer", "0000009", "SELECT * FROM KÖNNEN", Genre.Roman, LocalDate.of(1945, 3, 10), "HFU Boss", "Deutsch", 90, "Piepmeyer");
            Medium medium10 = new Tontraeger("Datenbanken 4", "Lothar Piepmeyer", "0000010", "SELECT * FROM KÖNNEN", Genre.SciFi, LocalDate.of(1945, 3, 11), "HFU Boss", "Deutsch", 33, "Piepmeyer");

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

            Kunde kunde1 = new Kunde("Max", "Mustermann",
                    "mm@test.de", "max.muster",
                    "passwort", LocalDate.of(2000, 12, 24),
                    Fakultaet.Informatik, "Musterstrasse", 1,
                    "Nordpol", "00001", "08002222222");

            nutzerverwaltung.nutzerHinzufuegen(kunde1);

            initialized = true;
        }
    }
}
