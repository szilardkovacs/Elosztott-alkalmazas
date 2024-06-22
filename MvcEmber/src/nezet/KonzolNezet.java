package nezet;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author szilard.kovacs
 */
public class KonzolNezet implements Nezet{
    private static final Scanner sc = new Scanner(System.in);
    
    @Override 
    public String getNev() {
        System.out.println("Adja meg a nevet: ");
        return sc.nextLine();
    }
    
    @Override 
    public int getSzulev() {
        System.out.println("Adja meg a szuletesi evet: ");
        return Integer.parseInt(sc.nextLine());
    }
    
    @Override 
    public int getKor(int szulev) {
        return Year.now().getValue() - szulev;
    }
    
    @Override 
    public int getMagassag() {
        System.out.println("Adja meg a magassagat: ");
        return Integer.parseInt(sc.nextLine());
    }  
    
    @Override 
    public void megjelenito(String info) {
        System.out.println(info);
    }
}
