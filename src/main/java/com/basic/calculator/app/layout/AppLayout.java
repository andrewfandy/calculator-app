package com.basic.calculator.app.layout;

import javax.swing.*;
import java.awt.*;

public class AppLayout extends JFrame {
    public AppLayout(){
        super("Basic Calculator Application");
        setLayout(new BorderLayout);
        setPreferredSize(new Dimension(300, 500));
        
        pack();

    }
}
