package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medienverwaltung implements Medieninterface
{
    private static final int maxAusleihen = 5;
    private List<Medium> mediumList;
    private List<Ausleihe> ausleiheList;
    private List<Standort> standortList;

    protected Medienverwaltung() {
        mediumList = new ArrayList<>();
        ausleiheList = new ArrayList<>();
        standortList = new ArrayList<>();
    }

    public boolean mediumAusleihen(Medium medium, Nutzer nutzer)
    {
        LocalDate aktuellesDatum = LocalDate.now();
        LocalDate rueckgabeDatum = LocalDate.now().plusMonths(1);

        boolean zulaessig = ausleiheList.contains(medium) || nutzer.getAusleihen().size() >= maxAusleihen;

        if(!zulaessig)
        {
            Ausleihe ausleihe = new Ausleihe(medium, nutzer, aktuellesDatum, rueckgabeDatum, null);
            ausleiheList.add(ausleihe);
            nutzer.getAusleihen().add(ausleihe);
        }

        return !zulaessig;
    }

    public void mediumAnfordern(Medium medium, Nutzer nutzer) {
        // TODO - implement Medienverwaltung.mediumAnfordern
        throw new UnsupportedOperationException();
    }

    public void mediumZurueckgeben(Ausleihe ausleihe)
    {
        ausleihe.getAusleiher().getAusleihen().remove(ausleihe);
        ausleiheList.remove(ausleihe);
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

    public void mediumVerlaengern(Medium medium)
    {
        for(Ausleihe a : ausleiheList)
        {
            if(a.getGebuchtesMedium().getId() == medium.getId())
            {
                a.setRueckgabedatum(a.getRueckgabedatum().plusMonths(1));
                a.setAnzahlVerlaengert(a.getAnzahlVerlaengert() + 1);
            }
        }
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