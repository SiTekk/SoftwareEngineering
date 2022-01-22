package de.hfu.aufgabe8.userinterface;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.Iterator;
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

    public static Nutzer KundeAuswaehlen()
    {
        Iterator<Nutzer> iterator = BibliotheksDienst.getNutzerinterface().getNutzerIterator();

        while (iterator.hasNext())
        {
            Nutzer n = iterator.next();
            System.out.println(n.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ID des Nutzers ein:");
        int id = sc.nextInt();

        return BibliotheksDienst.getNutzerinterface().getNutzerById(id);
    }
}
