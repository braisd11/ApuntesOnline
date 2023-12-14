/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1avaliable;

/**
 *
 * @author a22braisdr
 */
public class CifrarCesar {
 
    
    public String cifradoCesar(String cadenaACifrar){
        StringBuilder cifrado=new StringBuilder();
        cadenaACifrar=cadenaACifrar.toLowerCase();
        for (int cont=0; cont<cadenaACifrar.length(); cont++) {
            if(cadenaACifrar.charAt(cont)+3>'z'){
                cifrado.append((char)(cadenaACifrar.charAt(cont)+3-26));
            }
            else {
                cifrado.append((char)(cadenaACifrar.charAt(cont)+3));
            }
        }
        return cifrado.toString();
    }
}
