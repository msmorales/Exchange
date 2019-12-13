package co.com.entelgy.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DescripcionResonseProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String descripcion="";
		String error = exchange.getProperty("error").toString();	
		
		String[] errores= error.split("ORA-"); 		
		for (int i = 1; i < errores.length; i++) {
			if(i<=3)
				descripcion+="ORA-"+errores[i].trim();
			
		}
		exchange.setProperty("descripcion", descripcion);
		System.out.println(descripcion);
	}
	
	

}