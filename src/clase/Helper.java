/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase;

import interfaz.principal;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author walbonis1
 */
public class Helper {

    public static void mensaje(Component ventana ,String mensaje,int tipo){
        switch(tipo){
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje,"informacion" ,JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje,"advertencia",JOptionPane.ERROR_MESSAGE);
               break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje,"ERROR",JOptionPane.ERROR_MESSAGE);
      
        }
    }
   
    public static void setbotones(Component[] botones ,boolean[] estado ){
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(estado[i]);
        }
    }
}
