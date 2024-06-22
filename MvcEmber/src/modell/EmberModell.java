package modell;

import java.time.Year;

/**
 *
 * @author szilard.kovacs
 */
public class EmberModell {
    private String nev;
    private int szulev;
    private int magassag;

    public EmberModell(String nev, int szulev, int magassag) {
        this.nev = nev;
        this.szulev = szulev;
        this.magassag = magassag;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzulev() {
        return szulev;
    }

    public void setSzulev(int szulev) {
        this.szulev = szulev;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "EmberModell{" + "nev=" + nev + ", szulev=" + szulev + ", magassag=" + magassag + '}';
    }
    
    private int getKor(int szulev) {
        return Year.now().getValue() - szulev;
    }
    
    public String bemutatkozas() {
        return "nev: " + nev + ", kor: " + getKor(szulev) + ", magassag: " + magassag;
    }
}
