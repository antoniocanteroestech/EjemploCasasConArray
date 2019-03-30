package es.estech.acantero;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Casa[] listadoCasas = new Casa[6];
        Casa casa1 = new Casa("dir 1", 11111, 1, 40);
        Casa casa2 = new Casa("dir 2", 22222, 2, 50);
        Casa casa3 = new Casa("dir 3", 33333, 3, 60);
        Casa casa4 = new Casa("dir 4", 44444, 4, 80);
        listadoCasas[0] = casa1;
        listadoCasas[1] = casa2;
        listadoCasas[2] = casa3;
        listadoCasas[3] = casa4;
        listadoCasas[4] = new Casa("dir 5", 55555, 5, 90);
        listadoCasas[5] = new Casa("dir 6", 66666, 6, 100);


        System.out.println("........................");
        System.out.println("Listado de códigos postales");
        for (int i = 0; i < listadoCasas.length; i++){
            System.out.println("Casa "+ i+1 +": código postal: "+listadoCasas[i].getCodigoPostal());
        }
        System.out.println("........................");

        System.out.println("........................");
        System.out.println("Listado de habitaciones");
        for (int i = 0; i < listadoCasas.length; i++){
            System.out.println("Casa "+ i+1 +": número de habitaciones: "+listadoCasas[i].getHabitaciones());
        }
        System.out.println("........................");

        System.out.println("........................");
        System.out.println("Listado de superficies");
        for (int i = 0; i < listadoCasas.length; i++){
            System.out.println("Casa "+ i+1 +": superfice: "+listadoCasas[i].getSuperficie()+"m2");
        }
        System.out.println("........................");



    }
}
