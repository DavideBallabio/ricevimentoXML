/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricevimentoxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author ballabio_davide
 */
public class RicevimentoXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Parser dom = new Parser();
        System.out.println("dimmi il giorno:    ");
        Scanner tastiera = new Scanner(System.in);
        String giorno = tastiera.nextLine();
        
        List ta=dom.parseDocument("ricevimento.xml");
        for (int i = 0; i < ta.size(); i++) {
            System.out.println(ta.get(i));
            
        }
    }
    
}
