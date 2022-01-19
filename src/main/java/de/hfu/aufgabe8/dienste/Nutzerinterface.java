package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Mahnung;
import de.hfu.aufgabe8.entities.Nutzer;

public interface Nutzerinterface
{
    public void nutzerEntfernen(Nutzer nutzer);
    public void nutzerAnpassen(Nutzer nutzer);
    public void nutzerHinzufuegen(String vorname, String nachname, String benutzername, String passwort);
    public void nutzerdatenUeberpruefen(Nutzer nutzer);
    public void mahnungSenden(Mahnung mahnung, Ausleihe ausleihe);
    public void mahnungAendern(Mahnung mahnung);
    public boolean login(String benutzername, String passwort);
    public void logout();
}
