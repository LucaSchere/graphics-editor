package display;

import control.EditorControl;

import javax.swing.*;
import java.awt.*;

public class ColorPickerFrame extends JFrame {

    public ColorPickerFrame(EditorControl ec, int breiteEditorFrame, int hoeheEditorFrame, int breitePicker, int hoehePicker){
        fensterPositionieren(breiteEditorFrame, hoeheEditorFrame, hoehePicker, breitePicker);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setContentPane(new ColorPickerPanel(ec, breitePicker, hoehePicker));
    }
    private void fensterPositionieren(int breiteEditorFrame, int hoeheEditorFrame, int hoehePicker, int breitePicker){
        Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle fensterAusschnitt = new Rectangle();
        fensterAusschnitt.width = breitePicker;
        fensterAusschnitt.height = hoehePicker;
        fensterAusschnitt.x = (bildschirmGroesse.width - breiteEditorFrame) / 2 - fensterAusschnitt.width;
        fensterAusschnitt.y = (bildschirmGroesse.height - hoeheEditorFrame) / 2;
        setBounds(fensterAusschnitt);
    }
}
