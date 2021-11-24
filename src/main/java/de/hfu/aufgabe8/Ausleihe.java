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
    /**
     * Abgeschlossen, Beschädigt, Verloren Verzug, ...
     */
    private AusleiheStati status;

}