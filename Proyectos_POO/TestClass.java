package Proyectos_POO;

import javax.swing.*;

public class TestClass {
    public void arregloInverso(int [] array2) {
        JOptionPane.showMessageDialog(null, "Array has been reverted.");
        for (int i = 4; i >= 0; i--) {

            JOptionPane.showMessageDialog(null, array2[i]);//Shows reverted array.
        }

    }
}
