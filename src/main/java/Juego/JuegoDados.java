/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Juego;

import java.util.*;

/**
 *
 * @author Esteban
 */
public class JuegoDados {

    public JuegoDados() {
        eleccion("¿Quiere realizar lanzamiento?");
    }

    public boolean iniciarRonda(Dado dado1, Dado dado2) {
        dado1.lanzarDado();
        dado2.lanzarDado();
        int resultado = resultadoLanzamiento(dado1, dado2);
        if(resultado == 7) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarResultado(boolean resultado) {
        if (resultado) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }
    }

    public int resultadoLanzamiento(Dado dado1, Dado dado2) {
        System.out.println("Dado1: " + dado1.getCaraVisible());
        System.out.println("Dado2: " + dado2.getCaraVisible());
        int suma = dado1.getCaraVisible() + dado2.getCaraVisible();
        System.out.println("Has obtenido un total de " + suma + " puntos");
        return suma;
    }

    public void eleccion(String mensaje) {
        System.out.println("");
        System.out.println(mensaje);
        System.out.println("1.- Si");
        System.out.println("2.- No");
        System.out.println("");
        int opcion = 0;
        while (opcion < 1 || opcion > 2) {
            opcion = validarEleccion();
            if (opcion >= 1 && opcion <= 2) {
                seleccion(opcion);
            }
        }
        System.out.println("");
    }
    
    public void seleccion(int op) {

        switch (op) {
            case 1:
                Dado dado1 = new Dado();
                Dado dado2 = new Dado();               
                boolean resultado = iniciarRonda(dado1, dado2);
                mostrarResultado(resultado);
                eleccion("¿Quiere realizar un nuevo lanzamiento?");
                break;
            case 2:
                System.out.println("Gracias por jugar");
                System.exit(0);
                break;
        }
    }
    
    public int validarEleccion() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        try {
            opcion = teclado.nextInt();
            return opcion;
        } catch (Exception e) {
            System.out.println("ERROR!!");
            return -1;
        }
    }

    

}
