package de.hfu.aufgabe8.entities;

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

    public Medium(int id, String titel, String autor, String isbn, String beschreibung, Genre genre, LocalDate erscheinungsdatum, String verlag, String sprache) {
        this.id = id;
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

    @Override
    public String toString()
    {
        return id + ": " + titel;
    }

    public int getId()
    {
        return id;
    }

    public String getAutor()
    {
        return autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getBeschreibung()
    {
        return beschreibung;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public LocalDate getErscheinungsdatum()
    {
        return erscheinungsdatum;
    }

    public String getVerlag()
    {
        return verlag;
    }

    public String getSprache()
    {
        return sprache;
    }

    public int getVerlaengerungsdauer()
    {
        return verlaengerungsdauer;
    }

    public boolean isVorbestellt()
    {
        return isVorbestellt;
    }
}