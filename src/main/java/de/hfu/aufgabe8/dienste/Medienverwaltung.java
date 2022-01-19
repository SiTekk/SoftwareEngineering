package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Medium;
import de.hfu.aufgabe8.entities.Nutzer;
import de.hfu.aufgabe8.entities.Standort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medienverwaltung {
    private List<Medium> mediumList;
    private List<Ausleihe> ausleiheList;
    private List<Standort> standortList;

    public Medienverwaltung() {
        mediumList = new ArrayList<>();
        ausleiheList = new ArrayList<>();
        standortList = new ArrayList<>();
    }

    /**
     * @param medium
     * @param nutzer
     */
    public void mediumAusleihen(Medium medium, Nutzer nutzer) {
        LocalDate aktuellesDatum = LocalDate.now();
        LocalDate rueckgabeDatum = LocalDate.now().plusMonths(1);
        ausleiheList.add(new Ausleihe(medium, nutzer, aktuellesDatum, rueckgabeDatum, null));
        System.out.println("Medium: " + medium.getTitel() + " von: " + nutzer.getBenutzername() + " ausgeliehen.");
    }

    /**
     * @param medium
     * @param nutzer
     */
    public void mediumAnfordern(Medium medium, Nutzer nutzer) {
        // TODO - implement Medienverwaltung.mediumAnfordern
        throw new UnsupportedOperationException();
    }

    /**
     * @param ausleihe
     */
    public void mediumZurueckgeben(Ausleihe ausleihe) {
        // TODO - implement Medienverwaltung.mediumZur�ckgeben
        throw new UnsupportedOperationException();
    }

    /**
     * @param medium
     * @param standort
     */
    public void mediumErfassen(Medium medium, Standort standort) {
        mediumList.add(medium);
        medium.setStandort(standort);
        System.out.println("Medium " + medium.getTitel() + " wurde erfasst.");

    }

    /**
     * @param medium
     */
    public void mediumLoeschen(Medium medium) {
        // TODO - implement Medienverwaltung.mediumL�schen
        throw new UnsupportedOperationException();
    }

    /**
     * @param medium
     */
    public void mediumVerlaengern(Medium medium) {
        // TODO - implement Medienverwaltung.mediumVerlaengern
        throw new UnsupportedOperationException();
    }

    /**
     * @param suchString
     */
    public Medium[] medienListeErzeugen(String suchString) {
        // TODO - implement Medienverwaltung.medienListeErzeugen
        throw new UnsupportedOperationException();
    }

    public void lagerbestandAktualisieren() {
        // TODO - implement Medienverwaltung.lagerbestandAktualisieren
        throw new UnsupportedOperationException();
    }

    public void lagerbestandPruefen() {
        // TODO - implement Medienverwaltung.lagerbestandPr�fen
        throw new UnsupportedOperationException();
    }

    public void ausleihstatistikAnsehen() {
        // TODO - implement Medienverwaltung.ausleihstatistikAnsehen
        throw new UnsupportedOperationException();
    }

}