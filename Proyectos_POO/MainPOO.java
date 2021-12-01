package Proyectos_POO;

import javax.swing.*;

public class MainPOO {
    public static void main(String[] args) {
        TestClass A = new TestClass(); //Object created from TestClass class.
        int [] array = new int [5]; //Array
        for (int i = 1; i <= 5; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insert " + i + " numbers, please."));  
            // I get an error here while running the program.
            
            //"Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
            //Index 5 out of bounds for length 5 at Proyectos_POO.MainPOO.main(MainPOO.java:10)"
        }
       
        A.arregloInverso(array);
    }
}
