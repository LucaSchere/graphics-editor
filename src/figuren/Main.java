package figuren;

import display.Display;
import load_save.Parser;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static final Display display = new Display();


    public static void main(String[] args){

        Color green = new Color(0,255,0,255);
        Color red = new Color(255,0,0,255);

        Rechteck r = new Rechteck(0, 0 ,red, 5, green,40,40);
        Dreieck d = new Dreieck(50, 50, 20, 70,170,170 ,red, 1, green);

        Gruppe g = new Gruppe(300, 300);

        Parser.speichern(r);
        g.hinzufuegen(Parser.lade());

        ArrayList<Figur> list = new ArrayList<Figur>();

        list.add(g);

        Zeichnung zeichnung = new Zeichnung(list);

        display.setZeichnung(zeichnung);





    }
}
