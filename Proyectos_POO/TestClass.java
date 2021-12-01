package Proyectos_POO;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.*;

public class TestClass {
    public void arregloInverso(int [] array2) {
        JOptionPane.showMessageDialog(null, "Array has been reverted."); 
        Collections.reverse(Arrays.asList(array2));//Reverting the array with Collections.
        for (int i = 0; i <= 5; i++) {

            JOptionPane.showMessageDialog(null, array2[i]);//Shows reverted array.
        }

    }
}
