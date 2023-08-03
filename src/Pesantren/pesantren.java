package Pesantren;

import Design.FormLogin;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class pesantren {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            FormLogin form = new FormLogin();
            form.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
}
