package de.hfu.aufgabe8.entities;

import java.util.ArrayList;
import java.util.List;

public class Datenbank 
{
    private static List<Medium> mediumList;
    private static List<Ausleihe> ausleiheList;
    private static List<Standort> standortList;
    private static List<Nutzer> nutzerList;
    private static List<Mahnung> mahnungList;

    private static boolean initialized = false;

    public static void initialize()
    {
        if(!initialized)
        {
            mediumList = new ArrayList<>();
            ausleiheList = new ArrayList<>();
            standortList = new ArrayList<>();
            nutzerList = new ArrayList<>();
            mahnungList = new ArrayList<>();

            initialized = true;
        }
    }

    public static List<Medium> getMediumList() 
    {
        if(initialized)
            return mediumList;
        else
            throw new NullPointerException("Datenbank wurde noch nicht initialisiert!");
    }

    public static List<Ausleihe> getAusleiheList() 
    {
        if(initialized)
            return ausleiheList;
        else
            throw new NullPointerException("Datenbank wurde noch nicht initialisiert!");
    }

    public static List<Standort> getStandortList() 
    {
        if(initialized)
            return standortList;
        else
            throw new NullPointerException("Datenbank wurde noch nicht initialisiert!");
    }

    public static List<Nutzer> getNutzerList() 
    {
        if(initialized)
            return nutzerList;
        else
            throw new NullPointerException("Datenbank wurde noch nicht initialisiert!");
    }

    public static List<Mahnung> getMahnungList() 
    {
        if(initialized)
            return mahnungList;
        else
            throw new NullPointerException("Datenbank wurde noch nicht initialisiert!");
    }   
}
