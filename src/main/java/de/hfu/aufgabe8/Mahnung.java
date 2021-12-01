package de.hfu.aufgabe8;

import java.time.LocalDate;

public class Mahnung {
    private Ausleihe ausleihe;
    private int id;
    private String grund;
    private LocalDate frist;
    private MahnungStati status;

    Mahnung(Ausleihe ausleihe, String grund, LocalDate frist, MahnungStati status)
    {
        this.ausleihe = ausleihe;
        this.grund = grund;
        this.frist = frist;
        this.status = status;
    }
}