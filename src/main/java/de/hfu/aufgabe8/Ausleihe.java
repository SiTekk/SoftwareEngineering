package de.hfu.aufgabe8;

import java.util.Date;

public class Ausleihe {

    private Mahnung mahnung;
    private Nutzer ausleiher;
    private Medium gebuchtesMedium;
    private int id;
    private Date ausleihdatum;
    private Date rueckgabedatum;
    private int anzahlVerlaengert;
    private AusleiheStati status;

    Ausleihe(Medium gebuchtesMedium, Nutzer ausleiher, Date ausleihdatum, Date rueckgabedatum, Mahnung mahnung)
    {
        this.gebuchtesMedium = gebuchtesMedium;
        this.ausleiher = ausleiher;
        this.ausleihdatum = ausleihdatum;
        this.rueckgabedatum = rueckgabedatum;
        this.mahnung = mahnung;
        anzahlVerlaengert = 0;
        status = AusleiheStati.Laufend;
    }
}