/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calrestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CalCirClient;

/**
 *
 * @author 01111
 */
public class CalRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalCirClient client = new CalCirClient();
        String xml = client.getXml("32");
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Area = "+res.getArea()+ "\nCircum = "+res.getCircum());
    }
    
}
