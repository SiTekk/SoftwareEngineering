package de.hfu.aufgabe8.dienste;

import de.hfu.aufgabe8.entities.*;

import java.time.LocalDate;
import java.util.*;

public class Nutzerverwaltung implements Nutzerinterface 
{
    private Nutzer loggedInUser;

    protected Nutzerverwaltung() 
    {
        Datenbank.initialize();
    }

    @Override
    public void nutzerEntfernen(int id)
    {
        Nutzer nutzer = getNutzerById(id);

        if(nutzer != null)
            Datenbank.getNutzerList().remove(nutzer);
    }

    @Override
    public Nutzer getNutzerById(int id)
    {
        Nutzer nutzer = null;

        for(Nutzer n : Datenbank.getNutzerList())
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
        return Datenbank.getNutzerList().listIterator();
    }

    @Override
    public void nutzerHinzufuegen(String vorname, String nachname, String benutzername, String passwort)
    {
        int id = 0;
        if(Datenbank.getNutzerList().size() > 0)
             id = Datenbank.getNutzerList().get(Datenbank.getNutzerList().size() - 1).getId() + 1;

        Datenbank.getNutzerList().add(new Kunde(id, vorname, nachname, benutzername, passwort,"test@holz.de", LocalDate.of(2000, 12, 27), Fakultaet.Informatik, "Musterstrasse", 1, "Nordpol", "00001", "08002222222"));
    }

    @Override
    public void mahnungSenden(int mediumId, String grund) 
    {
        Ausleihe ausleihe = BibliotheksDienst.getMedieninterface().getAusleiheByMedium(BibliotheksDienst.getMedieninterface().getMediumById(mediumId));
        Mahnung mahnung = new Mahnung(ausleihe, grund, LocalDate.now().plusMonths(1), MahnungStati.Laufend);

        ausleihe.setMahnung(mahnung);
        Datenbank.getMahnungList().add(mahnung);
    }

    @Override
    public boolean login(String benutzername, String passwort)
    {
       for(Nutzer n : Datenbank.getNutzerList())
       {
           if(n.getBenutzername().equals(benutzername) && n.getPasswort().equals(passwort))
           {
               loggedInUser = n;
               return true;
           }
       }

       return false;
    }

    @Override
    public void logout()
    {
        loggedInUser = null;
    }

    @Override
    public Nutzer getLoggedInUser()
    {
        return loggedInUser;
    }
}