package de.hfu.aufgabe8;

import java.util.Scanner;

public class Userinterface
{
    public static void startProgramLoop()
    {
        while (true)
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

            switch (option) {
                case 1:
                    //Kunde Anlegen
                    System.out.println("Kunde wurde erfasst!\n\n");
                case 2:
                    //Medium erfassen
                    System.out.println("Medium wurde erfasst!\n\n");

                case 3:
                    //Ausleihen
                    System.out.println("Ausleihe wurde erfasst!\n\n");
                case 4:
                    //Verlängern
                    System.out.println("Verlängerung wurde erfasst!\n\n");

                case 5:
                    //Zurückgeben
                    System.out.println("Rückgabe wurde erfasst!\n\n");

                case 0:
                    System.out.println("Vielen Dank für die Nutzung der Software, bis bald!\n\n");
                    break;
                default:
                    System.out.println("Option ist nicht bekannt!\n\n");
            }
        }
    }
}
