package main;

import modell.EmberModell;

/**
 *
 * @author szilard.kovacs
 */
public class MvcEmber {
    
    private static EmberModell modell = new EmberModell("Teszt Elek", 2001, 168);
    
    public static void main(String[] args) {
        System.out.println(modell.toString());
        System.out.println(modell.bemutatkozas());
    }
    
}
