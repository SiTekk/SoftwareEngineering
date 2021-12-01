package de.hfu.aufgabe8;

import java.time.LocalDate;

public abstract class Medium {
    private Standort standort;
    private int id;
    private String titel;
    private String autor;
    private String isbn;
    private String beschreibung;
    private Genre genre;
    private LocalDate erscheinungsdatum;
    private String verlag;
    private String sprache;
    private int verlaengerungsdauer;
    private boolean isVorbestellt;

    Medium(String titel, String autor, String isbn, String beschreibung, Genre genre, LocalDate erscheinungsdatum, String verlag, String sprache) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.beschreibung = beschreibung;
        this.genre = genre;
        this.erscheinungsdatum = erscheinungsdatum;
        this.verlag = verlag;
        this.sprache = sprache;
    }

    public Standort getStandort() {
        return standort;
    }

    public void setStandort(Standort standort) {
        this.standort = standort;
    }

    public String getTitel() {
        return titel;
    }

}