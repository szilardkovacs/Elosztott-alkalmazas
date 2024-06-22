package main;

import modell.EmberModell;
import nezet.GuiNezet;
import nezet.KonzolNezet;
import nezet.Nezet;
import vezerlo.Vezerlo;

/**
 *
 * @author szilard.kovacs
 */
public class MvcEmber {
    
    private static EmberModell modell;
    
    public static void main(String[] args) {
        new MvcEmber().Kozosbemutato();
    }    
    public MvcEmber() {
        modell = new EmberModell("Teszt Elek", 2001, 168);
    }
    
    public void Kozosbemutato() {
        
        //Nezet nezet = new KonzolNezet();
        
        GuiNezet nezet = new GuiNezet();
        nezet.setVisible(true);
 
        Vezerlo vezerlo = new Vezerlo(nezet, modell);

    }
    
}
