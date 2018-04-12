/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hs_stat_tracker;
import javax.swing.JFrame;
/**
 *
 * @author William
 */
public class HS_Stat_Tracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hearthstone Stat Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        HS_Stat_ControlPanel panel = new HS_Stat_ControlPanel();
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
