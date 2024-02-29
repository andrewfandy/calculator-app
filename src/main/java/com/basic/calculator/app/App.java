package com.basic.calculator.app;

import com.basic.calculator.app.layout.AppLayout;

import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppLayout().setVisible(true);
            }
        });
    }
}
