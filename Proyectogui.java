
package com.mycompany.proyectogui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Proyectogui {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
        JLabel label = new JLabel("Velazquez Cortes Cristina del Carmen\n320005864\nNezahualcoyotl, Col. Pavon, calle Mario CP 08500");
    
        
        label.setBounds(50, 50, 300, 100);  
        frame.add(label);
        
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}