package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.EmberModell;
import nezet.GuiNezet;
import nezet.KonzolNezet;
import nezet.Nezet;

/**
 *
 * @author szilard.kovacs
 */
public class Vezerlo {
    private Nezet nezet;
    private EmberModell modell;

    public Vezerlo(Nezet nezet, EmberModell modell) {
        this.nezet = nezet;
        this.modell = modell;
        
        if (nezet instanceof KonzolNezet) {
            nezet.megjelenito("Konzolteszt vezerlovel nev: " + nezet.getNev() + ", kor: " + nezet.getKor(nezet.getSzulev()) + ", magassag: " + nezet.getMagassag());
        
        }
        else {
            JButton btn = ((GuiNezet)nezet).getBtnMegjelenit();
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nev = nezet.getNev();
                    int szulev = nezet.getSzulev();
                    int magassag = nezet.getMagassag();
                    modell.setNev(nev);
                    modell.setSzulev(szulev);
                    modell.setMagassag(magassag);
                    String info = "Bemenet: " + modell.toString() + "\n" ;
                    info += "Guiadatok: " + modell.bemutatkozas();
                    nezet.megjelenito(info);
                }
            });
        }
    }
}
