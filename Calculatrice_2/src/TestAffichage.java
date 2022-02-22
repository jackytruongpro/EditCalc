import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author jacky
 */
public class TestAffichage {
    
    
    public static void main (String args[]){
        JFrame frame = new JFrame("Grid Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,4));
        Icon icon1 = new ImageIcon("spiderman.jpg");
        
        int ans=4;
        
        if(ans==4){
        JLabel label1 = new JLabel();
        label1.setIcon(icon1);
        JLabel label2 = new JLabel();
        label2.setIcon(icon1);
        JLabel label3 = new JLabel();
        label3.setIcon(icon1);
        JLabel label4 = new JLabel();
        label4.setIcon(icon1);
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        frame.add(panel);
    }
    
}
}

