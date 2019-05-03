package figuren;

import display.Display;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static final Display display = new Display();


    public static void main(String[] args){

        Color green = new Color(0,255,0,255);
        Color red = new Color(255,0,0,255);

        Rechteck r = new Rechteck(50, 50 ,green, 5, red,40,40);
        Dreieck d = new Dreieck(50, 50, 20, 70,170,170 ,green, 1, red);

        ArrayList<Figur> list = new ArrayList<Figur>();
        list.add(d);
        Zeichnung zeichnung = new Zeichnung(list);
        display.setZeichnung(zeichnung);

    }
}
