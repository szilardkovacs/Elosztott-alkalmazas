package main;

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
public class MvcEmber {
    
    private static EmberModell modell = new EmberModell("Teszt Elek", 2001, 168);
    
    public static void main(String[] args) {
        System.out.println(modell.toString());
        System.out.println(modell.bemutatkozas());
        
        //Nezet nezet = new KonzolNezet();
        //nezet.megjelenito("Konzolteszt nev: " + nezet.getNev() + ", kor: " + nezet.getKor(nezet.getSzulev()) + ", magassag: " + nezet.getMagassag());
        
        GuiNezet nezet = new GuiNezet();
        nezet.setVisible(true);
        
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
