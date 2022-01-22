package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;

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
        boolean quit = false;

        if (!login())
            return;

        while (!quit)
        {
            System.out.println("--------------------------\n\n");

            System.out.println("Was möchten sie tun?");
            System.out.println("(1) User anlegen");
            System.out.println("(2) Medien in Bestand erfassen");
            System.out.println("(3) Ausleihen");
            System.out.println("(4) Verlängern");
            System.out.println("(5) Zurückgeben");
            System.out.println("(0) Programm beenden");
            System.out.print("Geben sie die gewünschte Option an: ");

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
                    Bibliotheksinterface.MediumAusleihen();
                    System.out.println("Ausleihe wurde erfasst!\n\n");
                    break;
                case 4:
                    //Verlängern
                    Bibliotheksinterface.MediumVerlaengern();
                    System.out.println("Verlängerung wurde erfasst!\n\n");
                    break;

                case 5:
                    //Zurückgeben
                    Bibliotheksinterface.MediumZurueckgeben();
                    System.out.println("Rückgabe wurde erfasst!\n\n");
                    break;

                case 0:
                    quit = true;
                    System.out.println("Vielen Dank für die Nutzung der Software, bis bald!\n\n");
                    break;

                default:
                    System.out.println("Option ist nicht bekannt!\n\n");
                    break;
            }
        }

        BibliotheksDienst.getNutzerinterface().logout();
    }
}
