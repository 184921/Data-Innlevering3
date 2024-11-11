package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg 
{
    public static boolean skriv(Blogg samling, String mappe, String filnavn) 
    {
        try 
        {
            File file = new File(mappe, filnavn);
            PrintWriter writer = new PrintWriter(file);
            writer.print(samling.toString());
            writer.close();
            return true;
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Feil: Filen kunne ikke skrives.");
            return false;
        }
    }
}