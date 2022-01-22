package de.hfu.aufgabe8.entities;

import java.time.LocalDate;

public class Mitarbeiter extends Nutzer {

    /**
     * Admin, Dulli, Verwalter
     */
    private String status;

    public Mitarbeiter(int id, String vorname, String nachname, String eMail, String benutzername, String passwort, LocalDate geburtstag, Fakultaet fakultaet)
    {
        super(id, vorname, nachname, eMail, benutzername, passwort, geburtstag, fakultaet);
    }
}