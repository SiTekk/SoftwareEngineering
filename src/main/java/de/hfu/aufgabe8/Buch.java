package de.hfu.aufgabe8;

import java.time.LocalDate;

public class Buch extends Medium {

    private int seitenzahl;
    /**
     * Gebunden, Taschenbuch, E-Book ...
     */
    private String art;

    Buch(String titel, String autor, String isbn, String beschreibung, Genre genre, LocalDate erscheinungsdatum, String verlag, String sprache, int seitenzahl, String art)
    {
        super(titel,autor,isbn,beschreibung,genre,erscheinungsdatum,verlag,sprache);
        this.seitenzahl = seitenzahl;
        this.art = art;
    }
}