/**
 * 
 */
package com.avengercode.avenger.controle.retritivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author abraao pinto 
 *
 */
@SpringBootApplication
public class AvengerControleRestritivoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SpringApplication.run(AvengerControleRestritivoApplication.class, args);
	}
	
	public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/").allowedOrigins("*");
            }
        };
    }

}