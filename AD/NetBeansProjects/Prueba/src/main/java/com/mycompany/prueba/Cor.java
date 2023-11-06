/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author a22braisdr
 */
public class Cor {
    private double r;
    private double g;
    private double b;
    
    public Cor(double r,double g, double b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        comprobarR(r);
        
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        comprobarG(g);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        comprobarB(b);
    }
    
    
    
    
    private void comprobarR(double r){
        if (r<0){
            this.r=0;
        }
        else if (r>1){
            this.r=1;
        }
        else {
            this.r=r;
        }
    }
    
    private void comprobarG(double g){
        if (g<0){
            this.g=0;
        }
        else if (g>1){
            this.g=1;
        }
        else {
            this.g=g;
        }
    }
    
    private void comprobarB(double b){
        if (b<0){
            this.b=0;
        }
        else if (b>1){
            this.b=1;
        }
        else {
            this.b=b;
        }
    }
    
    
    public void gris(){
        double media=(r+g+b)/3;
        r=media;
        g=media;
        b=media;
    }
    
    public void amosarInformacion(){
        System.out.println("Cor vermello: " + r);
        System.out.println("Cor verde: " + g);
        System.out.println("Cor azul: " + b);
    }
    
    public boolean filtro(double filtror,double filtrog,double filtrob){
        if (filtror>1 || filtrog>1 || filtrob>1){
            return false;
        }
        else if (filtror<0 || filtrog<0 || filtrob<0){
            return  false;
        }
        else{
            setR(filtror*r);
            setG(filtrog*g);
            setB(filtrob*b);
            return true;
        }
        
        
    }
}
