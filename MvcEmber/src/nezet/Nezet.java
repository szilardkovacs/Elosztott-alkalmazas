package nezet;

/**
 *
 * @author szilard.kovacs
 */
public interface Nezet {
    public abstract String getNev();
    public abstract int getSzulev();
    public abstract int getKor(int szulev);
    public abstract int getMagassag();
    public abstract void megjelenito(String info);
}
