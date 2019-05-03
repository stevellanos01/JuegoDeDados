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
public class Dado {
    private int caraVisible;
    private int cantCaras;
    
    public Dado(){
        this.cantCaras = 6;
    }
    
    public void lanzarDado(){
        Random numAleatorio = new Random();
        caraVisible = (int)numAleatorio.nextInt(cantCaras)+1;
    }
    
    public int getCaraVisible(){
        return caraVisible;
    }
}
