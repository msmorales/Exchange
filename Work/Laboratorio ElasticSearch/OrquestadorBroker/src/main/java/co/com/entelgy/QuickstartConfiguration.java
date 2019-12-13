package co.com.entelgy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "quickstart")
public class QuickstartConfiguration {

   
    
	private String endpoint_Path;
	private String urlBroker;
	private String TimeOutBroker;	
	private String urlElasticSearch;
	
	public String getEndpoint_Path() {
		return endpoint_Path;
	}
	public void setEndpoint_Path(String endpoint_Path) {
		this.endpoint_Path = endpoint_Path;
	}
	public String getUrlBroker() {
		return urlBroker;
	}
	public void setUrlBroker(String urlBroker) {
		this.urlBroker = urlBroker;
	}
	public String getTimeOutBroker() {
		return TimeOutBroker;
	}
	public void setTimeOutBroker(String timeOutBroker) {
		TimeOutBroker = timeOutBroker;
	}
	public String getUrlElasticSearch() {
		return urlElasticSearch;
	}
	public void setUrlElasticSearch(String urlElasticSearch) {
		this.urlElasticSearch = urlElasticSearch;
	}	

}
