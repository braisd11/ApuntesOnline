/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1avaliable;

import java.util.Scanner;

/**
 *
 * @author a22braisdr
 */
public class Numericos {
    double numero;

    public Numericos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número que quieres partir:");
        this.numero=entrada.nextDouble();
        menu();
    }
    
    
    public int getParteEntera(double numero){
        Double cadena=numero;
        String palabra=cadena.toString();
        String num=palabra.subSequence(0, palabra.indexOf('.')).toString();
        return Integer.parseInt(num);
    }
    
    public int getParteDecimal(double numero){
        Double cadena=numero;
        String palabra=cadena.toString();
        String num=palabra.subSequence(palabra.indexOf('.')+1,palabra.length() ).toString();
        return Integer.parseInt(num);
    }

    private void menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce a opcion que queres: 1->Obter parte Enteira || 2->Obter a parte Decimal || 3->Sair");
        int opcion=entrada.nextInt();
        switch (opcion) {
        case 1:
            System.out.println(getParteEntera(numero));
            break;
        case 2:
            System.out.println(getParteDecimal(numero));
            break;
        case 3:
            System.exit(0);
            break;
        default:
            System.out.println("Esa opción non é correcta");
            menu();
            break;
        }
        
    }
}
