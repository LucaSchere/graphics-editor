package control;

import figuren.*;

import java.awt.*;

public class EditorControl {
  private Zeichnung zeichnung = new Zeichnung();
  private char figurTyp = 'l';
  private Color farbeRahmen = new Color(0,0,0,255);

  public Color getFarbeRahmen() {
    return farbeRahmen;
  }

  public void setFarbeRahmen(Color farbeRahmen) {
    this.farbeRahmen = farbeRahmen;
  }

  public Color getFarbeFuellung() {
    return farbeFuellung;
  }

  public void setFarbeFuellung(Color farbeFuellung) {
    this.farbeFuellung = farbeFuellung;
  }

  public int getStaerke() {
    return staerke;
  }

  public void setStaerke(int staerke) {
    this.staerke = staerke;
  }

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
      zeichnung.hinzufuegen(FigurFactory.baue(figurTyp, (int)ersterPunkt.getX(), (int)ersterPunkt.getY(), (int) zweiterPunkt.getX(), (int)zweiterPunkt.getY(), farbeFuellung, farbeRahmen, staerke ));
  }
}
