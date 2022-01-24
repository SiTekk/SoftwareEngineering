package de.hfu.aufgabe8.entities;

import java.util.*;

public class Standort {

    private Collection<Medium> medien;
    private int id;
    private String name;
    private String strasse;
    private int hausnummer;
    private String ort;
    private String plz;
    private String telefonnummer;
    private String eMail;

    public Standort(int id, String name, String strasse, int hausnummer, String ort, String plz, String telefonnummer,
            String eMail) {
        this.id = id;
        this.name = name;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.telefonnummer = telefonnummer;
        this.eMail = eMail;
    }
}