/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricevimentoxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author ballabio_davide
 */
public class Parser {
    private List tabella;

    public Parser() {
        tabella = new ArrayList();
    }

    public List<NodeList> parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        Prof p;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
       
        nodelist = root.getElementsByTagName("tr");
        int count=0;
        if(nodelist!=null && nodelist.getLength()>0){
            boolean trovato=false;
            while(!trovato){
                if(nodelist.item(count).getFirstChild().getTextContent().contains("DOCENTE"))
                    trovato=true;
                count++;
            }
            
            for(int i=count;i<nodelist.getLength();i++){
                element=(Element) nodelist.item(i);
                p=getProf(element);
                if(p!=null)
                    tabella.add(p);
            }
            
            }
        return tabella;
      
    }
   
    private Prof getProf(Element el){
        Prof p=null;
        
        String IDstr=el.getChildNodes().item(0).getTextContent();
        String nome=el.getChildNodes().item(1).getTextContent();
        String giorno=el.getChildNodes().item(2).getTextContent();
        String ora=el.getChildNodes().item(3).getTextContent();
        String commento=el.getChildNodes().item(4).getTextContent();
        
       
        int ID=Integer.parseInt(IDstr);
        
        p=new Prof(ID,nome,giorno,commento,ora);
        return p;
    }
    
    
}

