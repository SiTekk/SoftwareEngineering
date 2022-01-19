package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;
import java.util.*;

public class Nutzerverwaltung implements Nutzerinterface {

    private Collection<Nutzer> nutzerList;
    private List<Mahnung> MahnungList;

    protected Nutzerverwaltung() {
        nutzerList = new ArrayList<>();
    }

    @Override
    public void nutzerEntfernen(Nutzer nutzer) {
        nutzerList.remove(nutzer);
    }

    @Override
    public void nutzerAnpassen(Nutzer nutzer) {
        // TODO - implement Nutzerverwaltung.nutzerAnpassen
        throw new UnsupportedOperationException();
    }

    @Override
    public void nutzerHinzufuegen(String vorname, String nachname, String benutzername, String passwort)
    {
        nutzerList.add(new Kunde(vorname, nachname, benutzername, passwort,"test@holz.de", LocalDate.of(2000, 12, 27), Fakultaet.Informatik, "Musterstrasse", 1, "Nordpol", "00001", "08002222222"));
    }

    @Override
    public void nutzerdatenUeberpruefen(Nutzer nutzer) {
        // TODO - implement Nutzerverwaltung.nutzerdatenÜberprüfen
        throw new UnsupportedOperationException();
    }

    @Override
    public void mahnungSenden(Mahnung mahnung, Ausleihe ausleihe) {
        ausleihe.setMahnung(mahnung);
    }

    public void mahnungAendern(Mahnung mahnung) {
        // TODO - implement Nutzerverwaltung.mahnungÄndern
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean login(String benutzername, String passwort)
    {
       for(Nutzer n : nutzerList)
       {
           if(n.getBenutzername().equals(benutzername) && n.getPasswort().equals(passwort))
               return true;
       }

       return false;
    }

    @Override
    public void logout()
    {
        // TODO - implement Nutzerverwaltung.login
        throw new UnsupportedOperationException();
    }
}