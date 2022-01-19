package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.entities.Fakultaet;

import java.util.Scanner;

public class Kundeninterface
{
    public static void KundeAnlegen()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie einen Vorname ein: ");
        String v_name = sc.nextLine();

        System.out.print("Geben Sie einen Nachname ein: ");
        String n_name = sc.nextLine();

        System.out.print("Geben Sie einen Benutzername ein: ");
        String benutzername = sc.nextLine();

        System.out.print("Geben Sie ein Passwort ein: ");
        String passwort = sc.nextLine();

        BibliotheksDienst.getNutzerinterface().nutzerHinzufuegen(v_name, n_name, benutzername, passwort);
    }
}
