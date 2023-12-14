/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaavaliableud1;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author a22braisdr
 */
public class Parser {
    private Document registroEmpleados;
    private DocumentBuilder builder;
    private DocumentBuilderFactory dbf;
    private String ruta;
    private ArrayList <Empleado> list = new ArrayList<>();

    public Parser(String ruta) {
        this.ruta=ruta;
        dbf=DocumentBuilderFactory.newInstance();
        try {
            this.builder = dbf.newDocumentBuilder();
            this.registroEmpleados=builder.newDocument();
            this.registroEmpleados.setXmlVersion("1.0");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error con el DocumentBuilder");
        }   
    }
    
    public void anhadir(String dniEmpl,String nombreEmpl,String apellidoEmpl, double salarioEmpl){
        Empleado empl = new Empleado(dniEmpl, nombreEmpl, apellidoEmpl, salarioEmpl);
        list.add(empl);
    }
    
    public ArrayList leer(){
        try {
            Document empleados = builder.parse(new File(ruta));
            empleados.getDocumentElement().getNodeName();
            NodeList empleados_=empleados.getElementsByTagName("empleado");
            for (int cont=0; cont<empleados_.getLength(); cont++) {
                Node empl=empleados_.item(cont);
                if (empl.getNodeType()==Node.ELEMENT_NODE){
                    Element empleado=(Element)empl;
                    String dni = empleado.getElementsByTagName("dni").item(0).getTextContent();
                    
                    String nombre = empleado.getElementsByTagName("nombre").item(0).getTextContent();
                    
                    String apellido = empleado.getElementsByTagName("apellido").item(0).getTextContent();
                    
                    double salario = Double.parseDouble(empleado.getElementsByTagName("salario").item(0).getTextContent());
                    Empleado empleadoNovo = new Empleado(dni, nombre, apellido, salario);
                    list.add(empleadoNovo);
                }
            }
            
        } catch (Exception ex) {
            crearRaiz();
        } 
        return list;
    }
    
    public void guardarDom() throws ParserConfigurationException{
        this.builder = dbf.newDocumentBuilder();
        this.registroEmpleados=builder.newDocument();
        this.registroEmpleados.setXmlVersion("1.0");
        
        Element empleados = registroEmpleados.createElement("empleados");
        registroEmpleados.appendChild(empleados);
        
        for (Empleado e: list){
            Element empleado= registroEmpleados.createElement("empleado");
            registroEmpleados.getDocumentElement().appendChild(empleado);

            Element dni=registroEmpleados.createElement("dni");
            Text texto=registroEmpleados.createTextNode(e.getNIF());

            dni.appendChild(texto);
            empleado.appendChild(dni);

            Element nombre=registroEmpleados.createElement("nombre");
            texto=registroEmpleados.createTextNode(e.getNome());

            nombre.appendChild(texto);
            empleado.appendChild(nombre);

            Element apellidos =registroEmpleados.createElement("apellido");
            texto=registroEmpleados.createTextNode(e.getApellido());

            apellidos.appendChild(texto);
            empleado.appendChild(apellidos);

            Element salario=registroEmpleados.createElement("salario");
            texto=registroEmpleados.createTextNode(e.getSalario()+"");

            salario.appendChild(texto);
            empleado.appendChild(salario);
        }
        
        try {
            Source origen=new DOMSource(registroEmpleados);
            Result resultado=new StreamResult("empleados.xml");
            Transformer transformador=TransformerFactory.newInstance().newTransformer();
            transformador.setOutputProperty(OutputKeys.INDENT, "yes");
            transformador.transform(origen, resultado);
        } catch (TransformerException ex) {
            System.out.println("Error en el Transformer");
        }
    }
    
    public void crearRaiz() {
        Element empleados = registroEmpleados.createElement("empleados");
        registroEmpleados.appendChild(empleados);
        try {
            guardarDom();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    
