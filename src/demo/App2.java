package demo;


import java.awt.Graphics;

import javax.swing.JApplet;

public class App2 extends JApplet {
    @Override
    public void paint (Graphics g) {
        g.drawString("Hello Java!", 50, 50);
    }
}