/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaavaliableud1;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;

/**
 *
 * @author a22braisdr
 */
public class SAXPars {
    private SAXParser parser;
    private SAXParserFactory factory;
    
    public SAXPars() {
        super();
        try {
            factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
        } catch (SAXException | ParserConfigurationException ex) {
            ex.printStackTrace();
        }
    }

    public void cargarDatos(String path){
        try {
            File archivo = new File(path);
            
            Handler handler=new Handler();
            parser.parse(path, handler);
        } catch (SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
