/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaavaliableud1;


import java.io.Serializable;

/**
 *
 * @author a22braisdr
 */
public class Empleado implements Serializable{
    private String NIF;
    private String nome;
    private String apellido;
    private double salario;

    public Empleado(String NIF, String nome, String apellido, double salario) {
        this.NIF = NIF;
        this.nome = nome;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    public String getNIF() {
        return NIF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
