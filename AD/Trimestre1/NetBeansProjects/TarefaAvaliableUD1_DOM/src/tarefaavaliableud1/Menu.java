/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaavaliableud1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a22braisdr
 */
public class Menu implements Serializable{
    Scanner scan = new Scanner(System.in);
    
    private ArrayList <Empleado> listaEmpl=new ArrayList<>();
    private String ruta = "empleados.xml";
    private Parser pars;

    public Menu() {
        this.pars = new Parser(ruta);
        try {
            cargarEmpleados();
        }
        catch (IOException | ClassNotFoundException e){
        }
        menu();
    }
    
    
    
    
    
    private void consultar(){
        String dni=pedirDni();
        Empleado consulta=null;
        try{
            consulta=buscarEmpleado(dni);
            System.out.println("NIF: " + consulta.getNIF());
            System.out.println("Nombre: " + consulta.getNome());
            System.out.println("Apellidos: " + consulta.getApellido());
            System.out.println("Salario: " + consulta.getSalario());
        } catch (NullPointerException e){
            System.out.println("Non existe un traballador con ese dni");
        }
        menu();
    }
    
    private void insertar(){
        String dni=pedirDni();
        if (comprobarEmpleado(dni)){
            System.out.println("El empleado ya existe.");
        } else {
            System.out.println("Introduce el Nombre del empleado:");
            String nombre = scan.nextLine();
            System.out.println("Introduce los apellidos del empleado:");
            String apel = scan.nextLine();
            System.out.println("Introduce el salario del empleado:");
            double sal = scan.nextDouble();
            pars.anhadir(dni, nombre, apel, sal);
            try{
                pars.guardarDom();
                System.out.println("Empleado creado con éxito!");
            } catch (Exception e){
                System.out.println("Error al guardar");
            }
            
        }
        menu();
    }
    
    private boolean comprobarEmpleado(String dni) {
        boolean existe=false;
        for (Empleado e : listaEmpl){
            if (e.getNIF().equals(dni)){
                existe = true;
            }
        }
        return existe;
    }
    
    
    
    private void listar(){
        for (Empleado e : listaEmpl){
            if (e.getNIF()!="-1"){
                System.out.println("NIF: " + e.getNIF()+"\n"+"Nombre: " + e.getNome());
            }
        }
        menu();
    }
    
    
    private void borrado(){
        String dni = pedirDni();
        try {
            Empleado busqueda = buscarEmpleado(dni);
            busqueda.setNIF("-1");
            pars.guardarDom();
        } catch (Exception ex) {
            System.out.println("Problema al buscar el NIF del empleado.");
        }
        menu();
    }

    
    
    private void modificar (){
        double nuevoSal=0;
        String dni=pedirDni();
        Empleado modificacion = buscarEmpleado(dni);
        System.out.println("Introduce el nuevo salario:");
        try{
            nuevoSal = scan.nextDouble();
            scan.nextLine();
        }
        catch (Exception e){
            System.out.println("Error al introducir el salario");
            modificar();
        }
        
        modificacion.setSalario(nuevoSal);
        try{
            pars.guardarDom();
            System.out.println("Empleado modificado con éxito!");
        } catch (Exception e){
            System.out.println("Error al guardar");
        }
        menu();
    }
    
    private Empleado buscarEmpleado(String dni){
        Empleado encontrado = null;
        for (Empleado e : listaEmpl){
            if (e.getNIF().equals(dni)){
                encontrado = e;
                break;
            }
            else{
                encontrado = null;
            }
        }
        return encontrado;
    }
    
    
    private void menu(){
        System.out.println("Escolle unha opción: \n1->Consulta \n2->Inserción \n3->Modificación \n4->Borrado \n5->Listar");
        int opcion=scan.nextInt();
        scan.nextLine();
        switch (opcion) {
            case 1:
                consultar();
                break;
            case 2:
                insertar();
                break;
            case 3:
                modificar();
                break;
            case 4:
                borrado();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opción incorrecta");
                menu();
                break;
        }
        
    }

    private ArrayList cargarEmpleados() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Empleado> aux = pars.leer();
        listaEmpl = aux;
        System.out.println("Empleados cargados con éxito");
        return listaEmpl;
    }
    
    private String pedirDni() {
        boolean correcto=true;
        String dni=null;
        do {
            System.out.println("Introduce el nif:");
            dni = scan.nextLine();
            if (dni.length()!=9){
                System.out.println("El dni tiene que tener 9 caracteres");
            }
            else{
                correcto=false;
            }
        }
        while (correcto);
        return dni;
    }
   
}
