/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1avaliable;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author a22braisdr
 */
public class ControlFechas {
    private String nombre1;
    private String nombre2;
    private int diaInt1;
    private int mesInt1;
    private int anhoInt1;
    private int diaInt2;
    private int mesInt2;
    private int anhoInt2;
    private String fechaTexto1;
    private String fechaTexto2;
    private Date fecha1;
    private Date fecha2;
    

    public ControlFechas() {
        pedirDatos();
        comprobarFechas();
        calcularEdad();
    }

    private void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce primer nombre:");
        nombre1=entrada.nextLine();
        System.out.println("Introduce primera fecha:");
        fechaTexto1=entrada.nextLine();
        transformarFecha1(fechaTexto1);
        System.out.println("Introduce segundo nombre:");
        nombre2=entrada.nextLine();
        System.out.println("Introduce segundo fecha:");
        fechaTexto2=entrada.nextLine();
        transformarFecha2(fechaTexto2);
    }
    
    private void transformarFecha1(String fecha){
        String dia=fecha.substring(0, 2);
        diaInt1=Integer.parseInt(dia);
        String mes=fecha.substring(3, 5);
        mesInt1=Integer.parseInt(mes);
        String anho=fecha.substring(6, 10);
        anhoInt1=Integer.parseInt(anho);
    }
    
    private void transformarFecha2(String fecha){
        String dia=fecha.substring(0, 2);
        diaInt2=Integer.parseInt(dia);
        String mes=fecha.substring(3, 5);
        mesInt2=Integer.parseInt(mes);
        String anho=fecha.substring(6, 10);
        anhoInt2=Integer.parseInt(anho);
    }
    
    private void comprobarFechas(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try{
            fecha1 = dateFormat.parse(this.fechaTexto1);
            fecha2 = dateFormat.parse(this.fechaTexto2);
            
            if (fecha1.compareTo(fecha2) < 0) {
                System.out.println(nombre1 + " es mayor que " + nombre2);
            } 
            else if (fecha1.compareTo(fecha2) > 0) {
                System.out.println(nombre2 + " es mayor que " + nombre1);
            }
            else {
                System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad.");
            }
        }
        catch (Exception e){
            System.out.println("Erro na transformacion da fecha");
        }
        
    }

    private void calcularEdad() {        
        Period edad1 = Period.between(LocalDate.of(anhoInt1, mesInt1,diaInt1), LocalDate.now());
        Period edad2 = Period.between(LocalDate.of(anhoInt2, mesInt2,diaInt2), LocalDate.now());
        System.out.println(nombre1+" tiene "+edad1.getYears()+" y "+nombre2+" tiene "+edad2.getYears());
    }
}
