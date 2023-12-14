/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author a22braisdr
 */
public class Prueba {

    public static void main(String[] args) {
        Cor cor=new Cor(1.1, -5, 0.5);
        cor.amosarInformacion();
        System.out.println();
        cor.filtro(0.2, 0.3, 0.6);
        cor.amosarInformacion();
        System.out.println();
        cor.filtro(1.2, 0.3, 0.6);
        cor.amosarInformacion();
        System.out.println();
        cor.filtro(-1, 0.3, 0.6);
        cor.amosarInformacion();
    }
}
