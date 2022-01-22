package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Mahnung;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.Iterator;

public interface Nutzerinterface
{
    public void nutzerEntfernen(int id);
    public Nutzer getNutzerById(int id);
    public Iterator<Nutzer> getNutzerIterator();
    public void nutzerHinzufuegen(String vorname, String nachname, String benutzername, String passwort);
    public void mahnungSenden(Mahnung mahnung, Ausleihe ausleihe);
    public void mahnungAendern(Mahnung mahnung);
    public boolean login(String benutzername, String passwort);
    public void logout();
    public Nutzer getLoggedInUser();
}
