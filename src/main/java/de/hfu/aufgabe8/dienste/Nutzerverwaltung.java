package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.Ausleihe;
import de.hfu.aufgabe8.entities.Mahnung;
import de.hfu.aufgabe8.entities.Nutzer;

import java.util.*;

public class Nutzerverwaltung {

    private Collection<Nutzer> nutzerList;
    private List<Mahnung> MahnungList;

    public Nutzerverwaltung() {
        nutzerList = new ArrayList<>();
    }

    /**
     * @param nutzer
     */
    public void nutzerEntfernen(Nutzer nutzer) {
        nutzerList.remove(nutzer);
    }

    /**
     * @param nutzer
     */
    public void nutzerAnpassen(Nutzer nutzer) {
        // TODO - implement Nutzerverwaltung.nutzerAnpassen
        throw new UnsupportedOperationException();
    }

    /**
     * @param nutzer
     */
    public void nutzerHinzufuegen(Nutzer nutzer) {
        if (nutzerList == null) {
            nutzerList = new ArrayList<>();
        }
        nutzerList.add(nutzer);
    }

    /**
     * @param nutzer
     */
    public void nutzerdatenUeberpruefen(Nutzer nutzer) {
        // TODO - implement Nutzerverwaltung.nutzerdatenÜberprüfen
        throw new UnsupportedOperationException();
    }

    /**
     * @param mahnung
     * @param ausleihe
     */
    public void mahnungSenden(Mahnung mahnung, Ausleihe ausleihe) {
        // TODO - implement Nutzerverwaltung.mahnungSenden
        throw new UnsupportedOperationException();
    }

    /**
     * @param mahnung
     */
    public void mahnungAendern(Mahnung mahnung) {
        // TODO - implement Nutzerverwaltung.mahnungÄndern
        throw new UnsupportedOperationException();
    }

    /**
     * @param benutzername
     * @param passwort
     */
    public void login(String benutzername, byte[] passwort) {
        // TODO - implement Nutzerverwaltung.login
        throw new UnsupportedOperationException();
    }

    public void logout() {
        // TODO - implement Nutzerverwaltung.logout
        throw new UnsupportedOperationException();
    }

}