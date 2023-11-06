/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefa1avaliable;


/**
 *
 * @author a22braisdr
 */
public class Tarefa1Avaliable {

    public static void main(String[] args) {
        //Ejercicio 1
        Trabajador trabajador=new Trabajador("Paco", 26, 1, 1);
        //Ejercicio 2
        CifrarCesar palabra=new CifrarCesar();
        System.out.println(palabra.cifradoCesar("Hola mundo"));
        //Ejercicio 3
        Numericos num=new Numericos();
        //Ejercicio 4
        ControlFechas fechas=new ControlFechas();
        //Ejercicio5
        Hora hora=new Hora(12, 30);
        hora.setHoras(2);
        hora.setMinutos(7);
        System.out.println(hora.toString());
    }
}
