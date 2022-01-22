package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;
import java.util.*;

public class Nutzerverwaltung implements Nutzerinterface {

    private List<Nutzer> nutzerList;
    private List<Mahnung> MahnungList;

    protected Nutzerverwaltung() {
        nutzerList = new ArrayList<>();
    }

    @Override
    public void nutzerEntfernen(int id)
    {
        Nutzer nutzer = getNutzerById(id);

        if(nutzer != null)
            nutzerList.remove(nutzer);
    }

    @Override
    public Nutzer getNutzerById(int id)
    {
        Nutzer nutzer = null;

        for(Nutzer n : nutzerList)
        {
            if(n.getId() == id)
            {
                nutzer = n;
                break;
            }
        }

        return nutzer;
    }

    @Override
    public Iterator<Nutzer> getNutzerIterator()
    {
        return nutzerList.listIterator();
    }

    @Override
    public void nutzerHinzufuegen(String vorname, String nachname, String benutzername, String passwort)
    {
        int id = 0;
        if(nutzerList.size() > 0)
             id = nutzerList.get(nutzerList.size() - 1).getId() + 1;

        nutzerList.add(new Kunde(id, vorname, nachname, benutzername, passwort,"test@holz.de", LocalDate.of(2000, 12, 27), Fakultaet.Informatik, "Musterstrasse", 1, "Nordpol", "00001", "08002222222"));
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