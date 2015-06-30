
package Main;

import Splash.SplashPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

public class LaEscondida {

    public static void main(String[] args) {
        SplashPanel splash = new SplashPanel();
        splash.setColorBar(new Color(215,215,215));
        splash.setProgressBar(new Rectangle(0,0,600,15));
        splash.setImageURL("/Images/SplashScreen.png");
        splash.setTimer(300,10);
        splash.setProgressSpeed(2);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setSize(new Dimension(816,639));
        mainWindow.setTitle("La Escondida - Punto de Venta ver. 1.0");
        mainWindow.setLocationRelativeTo(null);
        splash.startSplash(mainWindow);
    }
    
}
