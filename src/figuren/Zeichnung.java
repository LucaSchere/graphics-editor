package figuren;

import load_save.Parser;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren;

    public Zeichnung(List<Figur> figuren){
        this.figuren = figuren;
    }
    public Zeichnung(){
        this.figuren = new ArrayList<>();
        this.figuren = Parser.laden();
    }
    /**
     * Fügt eine weitere Figur hinzu und löst die Auffrischung des Fensterinhaltes aus.
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
        Parser.speichern(this.figuren);
    }
    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Figur f : figuren) {
            f.zeichne(g2);
        }
    }
    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();

    }
}
