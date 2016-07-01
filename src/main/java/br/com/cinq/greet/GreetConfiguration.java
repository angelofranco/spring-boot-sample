package br.com.cinq.greet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfiguration {

	@Bean
	public GreetingsMessage greetings() {
		return GreetingsMessage.getInstance();
	}
}
