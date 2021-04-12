import javax.swing.*;

public class Joption_sueldo {
    public static void Suldo_Op() {
        int cantidadSueldos=0;
        int sueldo = 0, sueldoMaximo=0;
        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("Cauto es: "));
        for (int i = 0; i <= cantidadSueldos ; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Que o q"));
            if (sueldo>sueldoMaximo)sueldoMaximo=sueldo;
        }
        JOptionPane.showMessageDialog(null,"El suledo max: " + sueldoMaximo);
    }
}
