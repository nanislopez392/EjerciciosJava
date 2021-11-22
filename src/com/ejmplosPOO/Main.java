package com.ejmplosPOO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Coche Renault = new Coche();//instanciar una clase
        //System.out.println(Renault.dime_largo());

        Coche miCoche = new Coche();
        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));


        System.out.println(miCoche.dime_color());

        miCoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(miCoche.dime_asientos());

        miCoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(miCoche.dime_climatizador());

        System.out.println(miCoche.dime_peso_coche());

        System.out.println("el precio final de mi coche es:"+miCoche.precio_coche());
    }
}
