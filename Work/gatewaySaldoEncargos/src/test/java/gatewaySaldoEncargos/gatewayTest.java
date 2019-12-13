package gatewaySaldoEncargos;

import java.io.File;
import java.util.Properties;
import javax.naming.Context;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;


public class gatewayTest extends CamelSpringTestSupport {

    private static final String PROPERTIES_FILE_DIR = "src/test/resources/";
    private static Properties testProperties = new Properties();


    @Test
    	public void testGatewayEncargos() throws Exception {
    		    
	    
	    File file = new File((PROPERTIES_FILE_DIR + "/request/pruebaconinfo.txt"));
	    file = file.getAbsoluteFile();

    	
//		byte[] bytes = Files.readAllBytes(Paths.get(PROPERTIES_FILE_DIR + "/request/prueba.txt"));
		
		
		RouteDefinition routeDefinition = context.getRouteDefinition("GATEWAY-SALDOENCARGOS-ROUTE-MAIN");
		routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {

			@Override
			public void configure() throws Exception {
				replaceFromWith("direct:inputEndpoint");
				interceptSendToEndpoint("direct:inputEndpoint")
				.setHeader("operationName",simple("prcFdValidarSaldo"));

				
			}
		});

		context.start();
		getMockEndpoint("mock://endRoute").expectedMinimumMessageCount(1);
		template.sendBody("direct:inputEndpoint", file);

		
	}

    @Test
    	public void testGatewayMovimientos() throws Exception {
    		    
	    
	    File file = new File((PROPERTIES_FILE_DIR + "/request/pruebaconinfoMovimiento.txt"));
	    file = file.getAbsoluteFile();

    	
		RouteDefinition routeDefinition = context.getRouteDefinition("GATEWAY-SALDOENCARGOS-ROUTE-MAIN");
		routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {

			@Override
			public void configure() throws Exception {
				replaceFromWith("direct:inputEndpoint");
				interceptSendToEndpoint("direct:inputEndpoint")
				.setHeader("operationName",simple("prcInsertaFdTmovimiento"));

				
			}
		});

		context.start();
		getMockEndpoint("mock://endRoute").expectedMinimumMessageCount(1);
		template.sendBody("direct:inputEndpoint", file);

		
	}

    @Test
    	public void testGatewayInterfaz() throws Exception {
    		    
	    
	    File file = new File((PROPERTIES_FILE_DIR + "/request/pruebaconinfoInterfaz.txt"));
	    file = file.getAbsoluteFile();

    	
		RouteDefinition routeDefinition = context.getRouteDefinition("GATEWAY-SALDOENCARGOS-ROUTE-MAIN");
		routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {

			@Override
			public void configure() throws Exception {
				replaceFromWith("direct:inputEndpoint");
				interceptSendToEndpoint("direct:inputEndpoint")
				.setHeader("operationName",simple("prcFdInterfaz"));

				
			}
		});

		context.start();
		getMockEndpoint("mock://endRoute").expectedMinimumMessageCount(1);
		template.sendBody("direct:inputEndpoint", file);

		
	}

    @Override
	public boolean isUseAdviceWith() {
		return true;
	}

	/**
	 * Carga del archivo de propiedades para los Test Unitarios
	 * 
	 * @throws Exception
	 */
	@BeforeClass
	public static void init() throws Exception {
		testProperties.load(gatewayTest.class.getResourceAsStream("/application.properties"));
	}


	
	@BeforeClass
	public static void setup1() throws NumberFormatException {
		try {
			System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.ActiveMQConnectionFactory");
			System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.camel.component.jms.JmsComponent");
			SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
			// Construct Broker
			ActiveMQConnectionFactory jms = new ActiveMQConnectionFactory();
			jms.setBrokerURL("tcp://localhost:61616");
			jms.setCloseTimeout(3000);
//			OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
//			ds.setURL("jdbc:oracle:thin:@172.16.0.230:1521:fidudesa");
//			ds.setUser("INT_WS");
//			ds.setPassword("sistemas");

			builder.bind("jms", jms);
			builder.activate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

//	@BeforeClass
//	public static void setUpProperties() throws Exception {
//		System.setProperty("karaf.home", PROPERTIES_FILE_DIR);
//		System.setProperty("project.artifactId", "Test-Maven-Artifact");
//	}

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}
}