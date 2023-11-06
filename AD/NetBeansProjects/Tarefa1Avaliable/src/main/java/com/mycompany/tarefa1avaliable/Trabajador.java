/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1avaliable;

/**
 *
 * @author a22braisdr
 */
public class Trabajador {
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;
    public static final int CAT_EMPLEADO=0;
    public static final int CAT_ENCARGADO=1;
    public static final int CAT_DIRECTIVO=2;
    public static final int ANT_NOVATO=0;
    public static final int ANT_MADURO=1;
    public static final int ANT_EXPERTO=2;

    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        try{
            comprobarCategoria(categoria);
            comprobarAntiguedad(antiguedad);
            System.out.println("El sueldo de este empelado es: " + calcularSueldo()+"€");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        comprobarCategoria(categoria);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        comprobarAntiguedad(antiguedad);
    }

    
    
    private void comprobarCategoria (int categoria)throws IllegalArgumentException{
        switch (categoria) {
            case 0:
                this.categoria=CAT_EMPLEADO;
                break;
            case 1:
                this.categoria=CAT_ENCARGADO;
                break;
            case 2:
                this.categoria=CAT_DIRECTIVO;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void comprobarAntiguedad(int antiguedad) {
        switch (antiguedad) {
            case 0:
                this.antiguedad=ANT_NOVATO;
                break;
            case 1:
                this.antiguedad=ANT_MADURO;
                break;
            case 2:
                this.antiguedad=ANT_EXPERTO;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public double calcularSueldo(){
        double sueldoBase=607;
        
        switch (this.categoria) {
            case CAT_EMPLEADO:
                sueldoBase=(sueldoBase*15)/100+sueldoBase;
                break;
            case CAT_ENCARGADO:
                sueldoBase=(sueldoBase*35)/100+sueldoBase;
                break;
            case CAT_DIRECTIVO:
                sueldoBase=(sueldoBase*60)/100+sueldoBase;
                break;
            default:
                break;
        }
        
        switch (this.antiguedad) {
            case ANT_NOVATO:
                sueldoBase+=150;
                break;
            case ANT_MADURO:
                sueldoBase+=300;
                break;
            case ANT_EXPERTO:
                sueldoBase+=600;
                break;
            default:
                break;
        }
        return sueldoBase;
    }
}
