package main;

import modell.EmberModell;
import nezet.KonzolNezet;
import nezet.Nezet;

/**
 *
 * @author szilard.kovacs
 */
public class MvcEmber {
    
    private static EmberModell modell = new EmberModell("Teszt Elek", 2001, 168);
    
    public static void main(String[] args) {
        System.out.println(modell.toString());
        System.out.println(modell.bemutatkozas());
        
        Nezet nezet = new KonzolNezet();
        nezet.megjelenito("Konzolteszt nev: " + nezet.getNev() + ", kor: " + nezet.getKor(nezet.getSzulev()) + ", magassag: " + nezet.getMagassag());
    }
    
}
