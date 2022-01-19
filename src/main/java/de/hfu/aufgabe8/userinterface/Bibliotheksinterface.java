package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;

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
}
