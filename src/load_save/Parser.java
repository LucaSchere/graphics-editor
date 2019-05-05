package load_save;

import figuren.Figur;
import figuren.Rechteck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Parser {


    public static void speichern(List<Figur> f){
        try {
            FileOutputStream fout = new FileOutputStream(new File("Zeichnung.txt"));
            ObjectOutputStream o = new ObjectOutputStream(fout);

            // Write objects to file
            o.writeObject(f);

            o.close();
            fout.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }
    }
    public static List<Figur> laden(){

        List<Figur> r = null;

        try {

            FileInputStream fi = new FileInputStream(new File("Zeichnung.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            // Read objects
            r = (List<Figur>) oi.readObject();



            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return r;
    }
}