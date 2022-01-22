package de.hfu.aufgabe8.entities;

import java.time.LocalDate;

public class Kunde extends Nutzer {

    private String strasse;
    private int hausnummer;
    private String ort;
    private String plz;
    private String telefonnummer;

    public Kunde() {
        super();
    }

    public Kunde(int id, String vorname, String nachname, String benutzername,
          String passwort, String eMail, LocalDate geburtstag, Fakultaet fakultaet,
          String strasse, int hausnummer, String ort, String plz, String telefonnummer) {
        super(id, vorname, nachname, eMail, benutzername, passwort, geburtstag, fakultaet);
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.telefonnummer = telefonnummer;
    }

}