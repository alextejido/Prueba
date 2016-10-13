
package triangulo1;

import javax.swing.JOptionPane;


public class Triangulo1 {

   
    public static void main(String[] args) {
        float base;
        float altura , area;
        base = Float.parseFloat(JOptionPane.showInputDialog("base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("altura "));
        area= base*altura;
        JOptionPane.showMessageDialog(null,"area =" +base);
        
    }
}
