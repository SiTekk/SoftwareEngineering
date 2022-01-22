package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Medium;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.Iterator;

public interface Medieninterface
{
    public boolean mediumAusleihen(Medium medium, Nutzer nutzer);
    public void mediumAnfordern(Medium medium, Nutzer nutzer);
    public void mediumZurueckgeben(Ausleihe ausleihe);
    public void mediumErfassen(String titel, String autor, int typ);
    public void mediumLoeschen(Medium medium);
    public void mediumVerlaengern(Medium medium);
    public Medium getMediumById(int id);
    public Iterator<Medium> getMedienListeIterator();
}
