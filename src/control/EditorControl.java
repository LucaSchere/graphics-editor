package control;

import figuren.*;

import java.awt.*;

public class EditorControl {
  private Zeichnung zeichnung = new Zeichnung();
  private char figurTyp = 'l';
  private Color farbeRahmen = new Color(0,0,0,255);
  private Color farbeFuellung = new Color(0,0,0,255);
  private int staerke = 2;

  private Point ersterPunkt;


  public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
      switch (figurTyp){
          case 'r':
              zeichnung.hinzufuegen(new Rechteck((int)ersterPunkt.getX(),(int) ersterPunkt.getY(), farbeRahmen, staerke, farbeFuellung,(int) Math.abs(ersterPunkt.getX()-zweiterPunkt.getX()),(int) Math.abs(ersterPunkt.getY()-zweiterPunkt.getY())));
              break;
          case 'd':
              zeichnung.hinzufuegen(new Dreieck((int)ersterPunkt.getX(),(int) ersterPunkt.getY(), (int)ersterPunkt.getX(), (int)zweiterPunkt.getY(), (int)zweiterPunkt.getX(),(int) zweiterPunkt.getY(), farbeRahmen, staerke, farbeFuellung));
              break;
          case 'o':
              int x1, y1;
              if(ersterPunkt.getX() > zweiterPunkt.getX()){
                  x1 = (int)zweiterPunkt.getX();
                  y1 = (int)zweiterPunkt.getY();
                  if(ersterPunkt.getY() < zweiterPunkt.getY()){
                      x1 = (int)zweiterPunkt.getX();
                      y1 = (int)ersterPunkt.getY();
                  }
              }else{
                  x1 = (int)ersterPunkt.getX();
                  y1 = (int)ersterPunkt.getY();
                  if(zweiterPunkt.getY() < ersterPunkt.getY()){
                      x1 = (int)ersterPunkt.getX();
                      y1 = (int)zweiterPunkt.getY();
                  }
              }
              zeichnung.hinzufuegen(new Oval(x1, y1, farbeRahmen, staerke, farbeFuellung, Math.abs((int)(ersterPunkt.getY()-zweiterPunkt.getY())/2), Math.abs((int)(ersterPunkt.getX()-zweiterPunkt.getX())/2)));
              break;
          case 'l':
              zeichnung.hinzufuegen(new Linie((int) ersterPunkt.getX(), (int)ersterPunkt.getY(), farbeRahmen, staerke, (int)zweiterPunkt.getX(), (int)zweiterPunkt.getY()));
              break;
          case 't':
              zeichnung.hinzufuegen(new Text((int) ersterPunkt.getX(), (int)ersterPunkt.getY(), "Text"));
              break;
      }
  }
}
