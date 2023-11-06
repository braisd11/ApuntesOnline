/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaavaliableud1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author a22braisdr
 */
public class Handler extends DefaultHandler {

    private StringBuilder value;

    public Handler() {
        this.value = new StringBuilder();
    }

    @Override
    public void startElement(String uri, String localName,
            String qName, Attributes attributes)
            throws SAXException {

        this.value.setLength(0);
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {

        this.value.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        switch (qName) {
            case "dni" ->
                System.out.println("    Dni: " + this.value.toString());
            case "nombre" ->
                System.out.println("    Nombre: " + this.value.toString());
        }

    }

}

