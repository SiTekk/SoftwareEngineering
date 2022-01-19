package de.hfu.aufgabe8;

import java.util.Scanner;

public class Userinterface
{
    public static void startProgramLoop()
    {
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
                    //Verl�ngern
                    System.out.println("Verl�ngerung wurde erfasst!\n\n");

                case 5:
                    //Zur�ckgeben
                    System.out.println("R�ckgabe wurde erfasst!\n\n");

                case 0:
                    System.out.println("Vielen Dank f�r die Nutzung der Software, bis bald!\n\n");
                    break;
                default:
                    System.out.println("Option ist nicht bekannt!\n\n");
            }
        }
    }
}
