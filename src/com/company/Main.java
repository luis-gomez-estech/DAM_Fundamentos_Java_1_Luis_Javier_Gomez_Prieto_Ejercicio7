package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int numero1 = escaner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = escaner.nextInt();


        //Si el  numero1 es mayor que el numero2, imprimirá este mensaje en pantalla
        if (numero1>numero2) {
            System.out.println("El número " + numero1 + " es mayor que el " + numero2);
        }

        //Si el  numero1 es igual que el numero2, imprimira este otro mensaje

        else if (numero1==numero2) {
            System.out.println("El número " + numero1 + " es igual que el " + numero2);
        }

        //Si el numero1 es menor que el numero2, imprimira este otro mensaje

        else {
            System.out.println("El número " + numero1 + " es menor que el " + numero2);
        }
    }


}

