package net.kzn.shoppingbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import net.kzn.shoppingbackend.dto.Response;



/**
 * Hello world!
 *
 */

public class App
{
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(
                               "https://openexchangerates.org/api/latest.json?app_id=866e4d6909d041228172699c640933fe",
                                Response.class);
        log.info("==== RESTful API Response using Spring RESTTemplate START =======");
        log.info(response.toString());
        log.info("==== RESTful API Response using Spring RESTTemplate END =======");
      }
}
