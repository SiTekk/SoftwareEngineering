package de.hfu.aufgabe8;

import java.util.*;

public abstract class Nutzer {

    Collection<Ausleihe> ausleihen;
    private int id;
    private String vorname;
    private String nachname;
    private String eMail;
    private String benutzername;
    private String passwort;
    private Date geburtstag;
    private int alter;
    private Fakultaet fakultaet;

    Nutzer() {
    }

    Nutzer(String vorname, String nachname, String eMail, String benutzername, String passwort, Date geburtstag, Fakultaet fakultaet) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.eMail = eMail;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.geburtstag = geburtstag;
        this.alter = getAlter(geburtstag);
        this.fakultaet = fakultaet;
    }

    private int getAlter(Date geburtstag) {
        Calendar now = Calendar.getInstance();
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int possibleAge = now.get(Calendar.YEAR) - geburtstag.getYear();
        return currentMonth < geburtstag.getMonth() || (currentMonth == geburtstag.getMonth() && now.get(Calendar.DATE) < geburtstag.getDay())
                ? possibleAge - 1
                : possibleAge;
    }
}