package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.dienste.Medieninterface;
import de.hfu.aufgabe8.dienste.Nutzerinterface;
import de.hfu.aufgabe8.entities.Medium;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.Iterator;
import java.util.Scanner;

public class Bibliotheksinterface
{
    public static void MediumErfassen()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Typen: (1) Buch (2) Tonträger");
        System.out.print("Wählen Sie den Medientyp: ");
        int option = sc.nextInt();

        if (option == 1)
        {
            //TODO Buch anlegen
            //BibliotheksDienst.getMedieninterface().mediumErfassen();

        }
        else if (option == 2)
        {
            //TODO Tonträger anlegen

        }
        else
        {
            System.out.println("Fehlerhafte Eingabe");
        }
    }

    public static void MeidumAusleihen()
    {
        Medium medium = MediumAuswaehlen(BibliotheksDienst.getMedieninterface().getMedienListeIterator());
        Nutzer nutzer = BibliotheksDienst.getNutzerinterface().getLoggedInUser();
        if(BibliotheksDienst.getMedieninterface().mediumAusleihen(medium, nutzer))
            System.out.println("Medium: " + medium.getTitel() + " von: " + nutzer.getBenutzername() + " ausgeliehen.");
        else
            System.out.println("Medium ist aktuell Ausgeliehen.");
    }

    public static Medium MediumAuswaehlen(Iterator<Medium> iterator)
    {
        while (iterator.hasNext())
        {
            Medium m = iterator.next();
            System.out.println(m.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ID des Mediums ein:");
        int id = sc.nextInt();

        return BibliotheksDienst.getMedieninterface().getMediumById(id);
    }
}
