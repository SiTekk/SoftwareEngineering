package de.hfu.aufgabe8;

import de.hfu.aufgabe8.dienste.BibliotheksDienst;
import de.hfu.aufgabe8.userinterface.Userinterface;

public class Main
{
    public static void main(String[] args)
    {
        BibliotheksDienst.initialize();
        Userinterface.startProgramLoop();
    }
}