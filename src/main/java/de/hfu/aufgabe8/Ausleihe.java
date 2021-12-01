package de.hfu.aufgabe8;

import java.time.LocalDate;

public class Ausleihe {

    private Mahnung mahnung;
    private Nutzer ausleiher;
    private Medium gebuchtesMedium;
    private int id;
    private LocalDate ausleihdatum;
    private LocalDate rueckgabedatum;
    private int anzahlVerlaengert;
    private AusleiheStati status;

    Ausleihe(Medium gebuchtesMedium, Nutzer ausleiher, LocalDate ausleihdatum, LocalDate rueckgabedatum, Mahnung mahnung)
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