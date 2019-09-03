package com.example.swing.demo1;

import javax.swing.*;
import java.awt.*;

public class Demo1 extends JApplet {
    public void init() {
        Container contentPane = getContentPane();

        Icon icon = new ImageIcon(getClass().getResource("/swing.gif"),
                "An animated GIF of Duke on a swing");

        JLabel label = new JLabel("Swing!", icon,
                SwingConstants.CENTER);

        contentPane.add(label, BorderLayout.CENTER);
    }
}
