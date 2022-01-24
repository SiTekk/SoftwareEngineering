package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Medium;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.Iterator;
import java.util.Scanner;

public class Bibliotheksinterface {
    public static void MediumErfassen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Typen: (1) Buch (2) Tonträger");
        System.out.print("Wählen Sie den Medientyp: ");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            System.out.print("Buchtitel: ");
            String titel = sc.nextLine();

            System.out.print("Buchautor: ");
            String autor = sc.nextLine();

            BibliotheksDienst.getMedieninterface().mediumErfassen(titel, autor, 1);

        } else if (option == 2) {
            System.out.print("Titel: ");
            String titel = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();

            BibliotheksDienst.getMedieninterface().mediumErfassen(titel, autor, 2);

        } else {
            System.out.println("Fehlerhafte Eingabe");
        }

        System.out.println("Medium wurde erfasst!\n\n");

    }

    public static void MediumAusleihen() {
        Medium medium = MediumAuswaehlen(BibliotheksDienst.getMedieninterface().getMedienListeIterator());
        Nutzer nutzer = BibliotheksDienst.getNutzerinterface().getLoggedInUser();
        if (BibliotheksDienst.getMedieninterface().mediumAusleihen(medium, nutzer))
            System.out.println("Medium: " + medium.getTitel() + " von: " + nutzer.getBenutzername() + " ausgeliehen.");
        else
            System.out.println("Medium ist aktuell Ausgeliehen, oder die maximale Ausleihanzahl wurde erreicht.");
    }

    public static void MediumZurueckgeben() {
        if (BibliotheksDienst.getNutzerinterface().getLoggedInUser().getAusleihen().size() != 0) {
            Medium medium = MediumAuswaehlen(BibliotheksDienst.getNutzerinterface().getLoggedInUser().getAusleihen().iterator());
            if (medium != null) {
                BibliotheksDienst.getMedieninterface().mediumZurueckgeben(medium);
                System.out.println("Rückgabe wurde erfasst!\n\n");
            }
        } else {
            System.out.println("Keine Ausleihen vorhanden!");
        }
    }

    public static void MediumVerlaengern() {
        if (BibliotheksDienst.getNutzerinterface().getLoggedInUser().getAusleihen().size() != 0) {
            Medium medium = MediumAuswaehlen(BibliotheksDienst.getNutzerinterface().getLoggedInUser().getAusleihen().iterator());
            if (medium != null) {
                BibliotheksDienst.getMedieninterface().mediumVerlaengern(medium);
                System.out.println("Verlängerung wurde erfasst!\n\n");
            }
        } else {
            System.out.println("Keine Ausleihen vorhanden!");
        }
    }

    public static Medium MediumAuswaehlen(Iterator iterator) {
        while (iterator.hasNext()) {
            Object o = iterator.next();
            Medium m;

            if (o instanceof Medium)
                m = (Medium) o;
            else
                m = ((Ausleihe) o).getGebuchtesMedium();

            System.out.println(m.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ID des Mediums ein:");
        int id = sc.nextInt();

        return BibliotheksDienst.getMedieninterface().getMediumById(id);
    }

}
