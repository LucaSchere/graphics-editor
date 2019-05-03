package load_save;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.*;


public class JSONParser {


    public static HashMap<String, Object> getFelderUndWerte(Object o) throws IllegalAccessException{
        HashMap<String, Object> felder = new HashMap<String, Object>();
        for (Class<?> c = o.getClass(); c != null; c = c.getSuperclass()) {
            for(Field f : c.getDeclaredFields()){
                f.setAccessible(true);
                felder.put(f.getName(), f.get(o));

            }

        }
        for (String i : felder.keySet()) {
            System.out.println(i + " : " + felder.get(i));
        }
        return felder;
    }


}
