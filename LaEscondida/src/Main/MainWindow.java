
package Main;

import Login.LoginPanel;
import Login.Space;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import static javax.swing.SwingConstants.CENTER;

public class MainWindow extends javax.swing.JFrame {
    
    public ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/IconApp/192x192.png"));

    public MainWindow() {
        initComponents();
        this.setIconImage(icon.getImage());
        this.setLoginWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void setLoginWindow() {
        LoginPanel login = new LoginPanel();
        
        //Fondo de panel
        try{
            login.setBackgroundColor(new Color(56, 181, 165));
            login.setImageLogo(new ImageIcon(getClass().getResource("/Images/Logo.png")));
            login.setImgLogoPosition(new Space(100,46,600,400));
        }catch(NullPointerException npe){
            System.out.println("Error en imagen");
        }
        
        //Propiedades de labels
        login.setFontProperties("labels", new Font("Franklin Gothic Demi Cond", 0, 18), new Color(0, 0, 0));
        
        //Propiedades de buttons
        login.setFontProperties("buttons", new Font("Franklin Gothic Demi Cond", 0, 18), new Color(255, 255, 255));
        login.setComponentProperties("buttons", new Color(0, 0, 0), null, 0);
        
        //Propiedades de textfields
        login.setFontProperties("fields", new Font("Franklin Gothic Demi Cond", 0, 14), new Color(0, 0, 0));
        login.setComponentProperties("fields", new Color(255, 255, 255), null, 0);
        
        
        //Posicionamos los componentes
        login.placeComponents(login.lblUser, new Space(110, 350, -1, -1));
        login.placeComponents(login.lblPassword, new Space(346, 350, -1, -1));
        login.placeComponents(login.txtUser, new Space(110, 375, 200, 40));
        login.placeComponents(login.pswPassword, new Space(346, 375, 200, 40));
        login.placeComponents(login.btnLogin, new Space(583, 375, 110, 40));
        
        //Agregamos el panel de logueo
        this.add(login, CENTER);
    }

}
