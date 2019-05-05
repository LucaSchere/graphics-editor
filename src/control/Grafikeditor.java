package control;

import display.*;

public final class Grafikeditor {

  public static void main(String[] args) {
    new Grafikeditor();

/*
    Color green = new Color(0,255,0,255);
    Color red = new Color(255,0,0,255);

    Rechteck r = new Rechteck(0, 0 ,red, 15, green,40,40);
    Dreieck d = new Dreieck(50, 50, 20, 70,170,170 ,red, 1, green);

    Gruppe g = new Gruppe(300, 300);

    ArrayList<Figur> list = new ArrayList<Figur>();

    list.add(r);
    list.add(d);

    Parser.speichern(list);

    Zeichnung zeichnung = new Zeichnung(Parser.laden());

    display.setZeichnung(zeichnung);*/

  }

  private Grafikeditor() {
    @SuppressWarnings("unused")
    EditorFrame frame = new EditorFrame(800, 600);
  }
}
