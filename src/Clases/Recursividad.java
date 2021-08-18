/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author anita
 */
public class Recursividad {
    public void imprimir (int z){
        if (z<=10){
            System.out.print(z+",");
            imprimir (z+1);
        }
    }
    
}