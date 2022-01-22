package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.dienste.Medieninterface;

import java.util.Formatter;
import java.util.Scanner;

public class Userinterface
{

    private static boolean login()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte loggen Sie sich ein:");

        System.out.print("Benutzername: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        return BibliotheksDienst.getNutzerinterface().login(username, password);
    }

    public static void startProgramLoop()
    {
        if (!login())
            return;

        while (true)
        {
            System.out.println("--------------------------\n\n");

            System.out.println("Was m�chten sie tun?");
            System.out.println("(1) User anlegen");
            System.out.println("(2) Medien in Bestand erfassen");
            System.out.println("(3) Ausleihen");
            System.out.println("(4) Verl�ngern");
            System.out.println("(5) Zur�ckgeben");
            System.out.println("(0) Programm beenden");
            System.out.print("Geben sie die gew�nschte Option an: ");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    // Kunde anlegen
                    Kundeninterface.KundeAnlegen();
                    System.out.println("Kunde wurde erfasst!\n\n");
                    break;
                case 2:
                    //Medium erfassen
                    Bibliotheksinterface.MediumErfassen();
                    System.out.println("Medium wurde erfasst!\n\n");
                    break;

                case 3:
                    //Ausleihen
                    Bibliotheksinterface.MeidumAusleihen();
                    System.out.println("Ausleihe wurde erfasst!\n\n");
                    break;
                case 4:
                    //Verl�ngern
                    System.out.println("Verl�ngerung wurde erfasst!\n\n");
                    break;

                case 5:
                    //Zur�ckgeben
                    System.out.println("R�ckgabe wurde erfasst!\n\n");
                    break;

                case 0:
                    System.out.println("Vielen Dank f�r die Nutzung der Software, bis bald!\n\n");
                    break;
                default:
                    System.out.println("Option ist nicht bekannt!\n\n");
                    break;
            }
        }
    }
}
