package test.ihmcomposant.app;

import javax.swing.JFrame;
import test.ihmcomposant.persistance.DatabaseStub;
/**
 * @author Sébastien FRANCOIS
 */
public class Main {
    private static void createAndShowGUI() {
        DatabaseStub data = new DatabaseStub();
        // Create and set up the window.
        JFrame maFenetre = new JFrame("Fenetre test");
        maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create and set up the content pane.
        IHMDocFiles panel = new IHMDocFiles(data);
        panel.setOpaque(true); // content panes must be opaque
        maFenetre.add(panel);
        // Display the window.
        maFenetre.pack();
        maFenetre.setVisible(true);
    }
    public static void main(String [] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              createAndShowGUI();
            }
        });
    }
}
