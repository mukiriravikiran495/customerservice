package com.customerservice.utils;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.customerservice.entity.CustomerTokens;

@Component
public class CustomerUtils {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
    private  RestTemplate restTemplate;
	
	@Value("${customer.service.url}")
    private String customerServiceUrl;
	
	@Value("${customerlogin.service.url}")
    private String customerLoginServiceUrl;

	
	public CustomerUtils() {
		
	}
	@Autowired
	public CustomerUtils(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public CustomerTokens validateAccessToken(String token) {
		String url = customerLoginServiceUrl+"/auth/token";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+token);
		System.out.println("token : "+token);
		System.out.println(" URL : "+url);
        

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        try {
        	ResponseEntity<CustomerTokens> response = restTemplate.exchange(
        		    url,
        		    HttpMethod.GET,
        		    entity,
        		    CustomerTokens.class
        	);
            logger.info("Response: " + response.getBody());
            logger.info("End : create customer utils : ");
            return response.getBody();
        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            logger.error("HTTP Error: " + ex.getStatusCode() + " - " + ex.getResponseBodyAsString());
            System.out.println(ex.getMessage());
            throw ex;
        } catch (Exception e) {
            logger.error("Request failed: ", e);
            throw e;
        }
		
	}

}
