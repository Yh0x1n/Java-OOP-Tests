package Proyectos_POO;

import javax.swing.*;

public class MainPOO {
    public static void main(String[] args) {
        TestClass A = new TestClass(); //Object created from TestClass class.
        int [] array = new int [5]; //Array
        for (int i = 0; i <= 4; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insert " + (i+1) + " numbers, please."));
        }
        A.arregloInverso(array); //Calling the class on TestClass.
    }
}
