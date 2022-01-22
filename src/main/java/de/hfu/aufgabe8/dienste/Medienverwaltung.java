package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medienverwaltung implements Medieninterface
{
    private List<Medium> mediumList;
    private List<Ausleihe> ausleiheList;
    private List<Standort> standortList;

    protected Medienverwaltung() {
        mediumList = new ArrayList<>();
        ausleiheList = new ArrayList<>();
        standortList = new ArrayList<>();
    }

    public void mediumAusleihen(Medium medium, Nutzer nutzer) {
        LocalDate aktuellesDatum = LocalDate.now();
        LocalDate rueckgabeDatum = LocalDate.now().plusMonths(1);
        ausleiheList.add(new Ausleihe(medium, nutzer, aktuellesDatum, rueckgabeDatum, null));
        System.out.println("Medium: " + medium.getTitel() + " von: " + nutzer.getBenutzername() + " ausgeliehen.");
    }

    public void mediumAnfordern(Medium medium, Nutzer nutzer) {
        // TODO - implement Medienverwaltung.mediumAnfordern
        throw new UnsupportedOperationException();
    }

    public void mediumZurueckgeben(Ausleihe ausleihe) {
        // TODO - implement Medienverwaltung.mediumZur�ckgeben
        throw new UnsupportedOperationException();
    }

    public void mediumErfassen(String titel, String autor, int typ)
    {
        int id = 0;
        if(mediumList.size() > 0)
            id = mediumList.get(mediumList.size() - 1).getId() + 1;

        Medium medium;

        switch (typ)
        {
            case 2:
                medium = new Tontraeger(id, titel, autor, "0000007", "SELECT * FROM KÖNNEN", Genre.Thriller, LocalDate.of(1945, 5, 8), "HFU Boss", "Deutsch", 120, "Lothar Piepmeyer");
                break;
            default:
                medium = new Buch(id, titel, autor, "0000001", "Programmierung 1", Genre.Informatik, LocalDate.of(2000, 1, 1), "HFU Boss", "Deutsch", 200, "Taschenbuch");
                break;
        }
        mediumList.add(medium);
    }

    public void mediumLoeschen(Medium medium) {
        // TODO - implement Medienverwaltung.mediumL�schen
        throw new UnsupportedOperationException();
    }

    public void mediumVerlaengern(Medium medium) {
        // TODO - implement Medienverwaltung.mediumVerlaengern
        throw new UnsupportedOperationException();
    }

    @Override
    public Medium getMediumById(int id)
    {
        Medium medium = null;

        for(Medium m : mediumList)
        {
            if(m.getId() == id)
            {
                medium = m;
                break;
            }
        }

        return medium;
    }

    public Iterator<Medium> getMedienListeIterator() {
        return mediumList.listIterator();
    }
}