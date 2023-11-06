/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1avaliable;

import java.time.LocalTime;
/**
 *
 * @author brais
 */
public class Hora {
    private int hora;
    private int minuto;
    private LocalTime reloj;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        System.out.println(transformarHora(this.hora, this.minuto));
        inc();
        System.out.println(transformarHora(this.hora, this.minuto));
    }
    
    public LocalTime transformarHora(int hora,int minuto){
        reloj=LocalTime.of(this.hora, this.minuto);
        return reloj;
    }
    
    public void inc(){
        setMinutos(1);
        transformarHora(hora, minuto);
    }
    
    public boolean setMinutos(int valor){
        boolean posible=true;
        if (minuto+valor>=60){
            return !posible;
        }
        else {
            this.minuto+=valor;
            System.out.println(transformarHora(hora, minuto));
            return posible;
        }
    }
    
    public boolean setHoras(int valor){
        boolean posible=true;
        if (hora+valor>=24){
            return !posible;
        }
        else {
            this.hora+=valor;
            System.out.println(transformarHora(hora, minuto));
            return posible;
        }
    }
    
    public String toString(){
        return reloj.toString();
    }
}
