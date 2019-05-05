package display;

import control.EditorControl;
import figuren.Zeichnung;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EditorFrame extends JFrame {
  private EditorControl editorControl = new EditorControl();



  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
            switch (e.getKeyChar()){
                case 'r':
                    editorControl.setFigurTyp('r');
                    break;
                case 'd':
                    editorControl.setFigurTyp('d');
                    break;
                case 'o':
                    editorControl.setFigurTyp('o');
                    break;
                case 'l':
                    editorControl.setFigurTyp('l');
                    break;
                case 't':
                    editorControl.setFigurTyp('t');
                    break;
            }
        }
    });
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
