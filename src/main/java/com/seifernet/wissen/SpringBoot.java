package com.seifernet.wissen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Seifer( Cuauhtemoc Herrera )
 * @version 0.0.1
 * @since 0.0.1
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan( )
public class SpringBoot {

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main( String[] args ) throws Exception {
		SpringApplication.run( SpringBoot.class );
	}

}
