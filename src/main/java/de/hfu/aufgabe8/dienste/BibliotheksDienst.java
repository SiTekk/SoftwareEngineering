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

            medienverwaltung.mediumErfassen("Informatik 1", "Olaf Neiße", 1);
            medienverwaltung.mediumErfassen("Informatik 2", "Olaf Neiße", 1);
            medienverwaltung.mediumErfassen("Softwareengineering 1", "Bernhard Hollunder", 1);
            medienverwaltung.mediumErfassen("Softwareengineering 2", "Bernhard Hollunder", 1);
            medienverwaltung.mediumErfassen("Automaten und Formale Sprachen 1", "Bernhard Hollunder", 1);
            medienverwaltung.mediumErfassen("Automaten und Formale Sprachen 2", "Bernhard Hollunder", 1);
            medienverwaltung.mediumErfassen("Datenbanken 1", "Lothar Piepmeyer", 2);
            medienverwaltung.mediumErfassen("Datenbanken 2", "Lothar Piepmeyer", 2);
            medienverwaltung.mediumErfassen("Datenbanken 3", "Lothar Piepmeyer", 2);
            medienverwaltung.mediumErfassen("Datenbanken 4", "Lothar Piepmeyer", 2);

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
