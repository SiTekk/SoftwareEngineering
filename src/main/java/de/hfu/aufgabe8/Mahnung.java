package de.hfu.aufgabe8;

import java.util.Date;
import java.util.List;

public class Mahnung {
    private static List<Mahnung> MahnungList;

    private Ausleihe ausleihe;
    private int id;
    private String grund;
    private Date frist;
    /**
     * Abgeschlossen, Ueberfaellig, Laufend ...
     */
    private MahnungStati status;

}