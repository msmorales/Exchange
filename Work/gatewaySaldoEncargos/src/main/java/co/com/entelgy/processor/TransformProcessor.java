package co.com.entelgy.processor;

import org.apache.camel.Exchange;

/**
 * 
 * @author Miguel Pinzon
 *
 */
public class TransformProcessor {

   
    /**
     * 
     * @param exchange
     * @throws Exception
     */
    public void process(Exchange exchange) throws Exception {

        String RequestBody = exchange.getProperty("RequestBody").toString();
        String exceptionMessage = exchange.getProperty("exceptionMessage").toString();
        
        RequestBody=RequestBody.replace("\"", "\\\"");
        exceptionMessage=exceptionMessage.replace("\"", "\\\"");
        
        RequestBody=RequestBody.replace("\r", "");
        exceptionMessage=exceptionMessage.replace("\r", "");
        
        RequestBody=RequestBody.replace("\n", "");
        exceptionMessage=exceptionMessage.replace("\n", "");
        
        exchange.setProperty("RequestBody", RequestBody);
        exchange.setProperty("mensajeTransformado", exceptionMessage);

    }

}
