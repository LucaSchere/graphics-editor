package display;

import control.EditorControl;
import figuren.Linie;
import figuren.Rechteck;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorPickerPanel extends JPanel {

    private ColorSlider redR = new ColorSlider(0, 255);
    private ColorSlider greenR = new ColorSlider(0, 255);
    private ColorSlider blueR = new ColorSlider(0,255);
    private StaerkeSlider staerke = new StaerkeSlider();
    private ColorSlider redF = new ColorSlider(0, 255);
    private ColorSlider greenF = new ColorSlider(0, 255);
    private ColorSlider blueF = new ColorSlider(0,255);

    private int breite;
    private int hoehe;

    private Linie l;

    public ColorPickerPanel(EditorControl ec, int breite, int hoehe){

        this.breite = breite;
        this.hoehe = hoehe;

        redR.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeRahmen(new Color(redR.getValue(), greenR.getValue(), blueR.getValue(),255));
            }
        });
        greenR.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeRahmen(new Color(redR.getValue(), greenR.getValue(), blueR.getValue(),255));
            }
        });
        blueR.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeRahmen(new Color(redR.getValue(), greenR.getValue(), blueR.getValue(),255));
            }
        });
        redF.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeFuellung(new Color(redF.getValue(), greenF.getValue(), blueF.getValue(),255));
            }
        });
        greenF.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeFuellung(new Color(redF.getValue(), greenF.getValue(), blueF.getValue(),255));
            }
        });
        blueF.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setFarbeFuellung(new Color(redF.getValue(), greenF.getValue(), blueF.getValue(),255));
            }
        });
        staerke.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ec.setStaerke(staerke.getValue());
            }
        });


        add(redR);
        add(greenR);
        add(blueR);
        add(staerke);
        add(redF);
        add(greenF);
        add(blueF);
        repaint();

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
