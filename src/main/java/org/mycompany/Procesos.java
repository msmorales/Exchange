package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Procesos{
	
	public String sayHello(Exchange exchange) {
		String body = (String)exchange.getIn().getHeader("<to>");
		System.out.print(body);
		return body;
	}

}
