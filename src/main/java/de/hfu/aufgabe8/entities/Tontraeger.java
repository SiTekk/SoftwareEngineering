package de.hfu.aufgabe8.entities;

import java.time.LocalDate;

public class Tontraeger extends Medium
{
    private int dauer;
    private String sprecher;

    public Tontraeger(String titel, String autor, String isbn, String beschreibung, Genre genre, LocalDate erscheinungsdatum, String verlag, String sprache, int dauer, String sprecher)
    {
        super(titel, autor, isbn, beschreibung, genre, erscheinungsdatum, verlag, sprache);
        this.dauer = dauer;
        this.sprecher = sprecher;
    }
}