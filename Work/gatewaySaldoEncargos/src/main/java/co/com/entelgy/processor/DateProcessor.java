package co.com.entelgy.processor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DateProcessor implements Processor {

    private static final SimpleDateFormat SOURCE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static final SimpleDateFormat TARGET_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void process(Exchange exchange) throws Exception {
    	String msj = exchange.getIn().getBody(String.class);
    	
    	String dateString = exchange.getProperty("fechaTransform").toString();

    	Date date = SOURCE_DATE_FORMAT.parse(dateString);
    	
        String bodyNew = msj.replace(dateString,TARGET_DATE_FORMAT.format(date));
        exchange.getIn().setBody(bodyNew);
    }

}