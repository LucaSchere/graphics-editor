package display;

import control.EditorControl;
import control.FigurKeyAdapter;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EditorFrame extends JFrame {
  private EditorControl editorControl = new EditorControl(this);



  public EditorFrame(int breite, int hoehe, int pickerBreite, int pickerHoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    addKeyListener(new FigurKeyAdapter(editorControl));
    new ColorPickerFrame(editorControl, breite, hoehe, pickerBreite, pickerHoehe);
  }

  private void erzeugeUndSetzeEditorPanel() {
    JPanel panel = new EditorPanel(editorControl);
    setContentPane(panel);
  }

  private void fensterEinmitten(int breite, int hoehe) {
    Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle fensterAusschnitt = new Rectangle();
    fensterAusschnitt.width = breite;
    fensterAusschnitt.height = hoehe;
    fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
    fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
    setBounds(fensterAusschnitt);
  }
}
