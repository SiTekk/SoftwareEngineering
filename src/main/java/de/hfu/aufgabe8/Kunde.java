package de.hfu.aufgabe8;

import java.time.LocalDate;

public class Kunde extends Nutzer {

    private String strasse;
    private int hausnummer;
    private String ort;
    private String plz;
    private String telefonnummer;

    Kunde() {
        super();
    }

    Kunde(String vorname, String nachname, String eMail, String benutzername,
          String passwort, LocalDate geburtstag, Fakultaet fakultaet,
          String strasse, int hausnummer, String ort, String plz, String telefonnummer) {
        super(vorname, nachname, eMail, benutzername, passwort, geburtstag, fakultaet);
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.telefonnummer = telefonnummer;
    }

}