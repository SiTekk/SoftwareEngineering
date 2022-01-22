package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Medium;
import de.hfu.aufgabe8.entities.Nutzer;
import de.hfu.aufgabe8.entities.Standort;

public interface Medieninterface
{
    public void mediumAusleihen(Medium medium, Nutzer nutzer);
    public void mediumAnfordern(Medium medium, Nutzer nutzer);
    public void mediumZurueckgeben(Ausleihe ausleihe);
    public void mediumErfassen(Medium medium, Standort standort);
    public void mediumLoeschen(Medium medium);
    public void mediumVerlaengern(Medium medium);
    public Medium[] medienListeErzeugen(String suchString);
}
