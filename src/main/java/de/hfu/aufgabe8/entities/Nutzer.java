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
    private String benutzername;
    private String passwort;
    private LocalDate geburtstag;
    private int alter;
    private Fakultaet fakultaet;

    public Nutzer() { }

    public Nutzer(int id, String vorname, String nachname, String eMail, String benutzername, String passwort, LocalDate geburtstag, Fakultaet fakultaet) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.eMail = eMail;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.geburtstag = geburtstag;
        this.alter = getAlter(geburtstag);
        this.fakultaet = fakultaet;
    }

    public String getBenutzername() {
        return benutzername;
    }

    private int getAlter(LocalDate geburtstag) {
        Period period = Period.between(geburtstag, LocalDate.now());
        return period.getYears();
    }

    public Collection<Ausleihe> getAusleihen()
    {
        return ausleihen;
    }

    public int getId()
    {
        return id;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String geteMail()
    {
        return eMail;
    }

    public String getPasswort()
    {
        return passwort;
    }

    public LocalDate getGeburtstag()
    {
        return geburtstag;
    }

    public int getAlter()
    {
        return alter;
    }

    public Fakultaet getFakultaet()
    {
        return fakultaet;
    }
}