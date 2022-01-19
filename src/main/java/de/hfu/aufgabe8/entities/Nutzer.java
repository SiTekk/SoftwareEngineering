package de.hfu.aufgabe8.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public abstract class Nutzer {

    Collection<Ausleihe> ausleihen;
    private int id;
    private String vorname;
    private String nachname;
    private String eMail;

    public String getBenutzername() {
        return benutzername;
    }

    private String benutzername;
    private String passwort;
    private LocalDate geburtstag;
    private int alter;
    private Fakultaet fakultaet;

    public Nutzer() { }

    public Nutzer(String vorname, String nachname, String eMail, String benutzername, String passwort, LocalDate geburtstag, Fakultaet fakultaet) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.eMail = eMail;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.geburtstag = geburtstag;
        this.alter = getAlter(geburtstag);
        this.fakultaet = fakultaet;
    }

    private int getAlter(LocalDate geburtstag) {
        Period period = Period.between(geburtstag, LocalDate.now());
        return period.getYears();
    }
}