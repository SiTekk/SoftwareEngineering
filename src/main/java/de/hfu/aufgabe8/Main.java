package de.hfu.aufgabe8;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Nutzerverwaltung nutzerverwaltung = new Nutzerverwaltung();
        Medienverwaltung medienverwaltung = new Medienverwaltung();

        nutzerverwaltung.nutzerHinzufuegen(
                new Kunde("Max", "Mustermann",
                        "mm@test.de", "maxmuster",
                        "passwort", new Date(2000, Calendar.DECEMBER, 24),
                        Fakultaet.Informatik, "Musterstrasse", 1,
                        "Nordpol", "00001", "08002222222"));




    }
}
