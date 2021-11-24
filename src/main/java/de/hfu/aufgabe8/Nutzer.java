package de.hfu.aufgabe8;

import java.util.*;

public abstract class Nutzer {
    private static List<Nutzer> NutzerList;

    Collection<Ausleihe> ausleihen;
    private int id;
    private String vorname;
    private String nachname;
    private String eMail;
    private String benutzername;
    private String passwort;
    private Date geburtstag;
    private int alter;
    private Fakultaet fakultaet;
}