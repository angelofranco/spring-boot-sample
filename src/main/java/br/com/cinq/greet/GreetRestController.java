package br.com.cinq.greet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String getGreet() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GreetConfiguration.class);
		GreetingsMessage greetings = context.getBean(GreetingsMessage.class);
		context.close();
		return greetings.getText();
	}
	
	@RequestMapping(value = "/greet", method = RequestMethod.POST)
	public String postGreet(@RequestBody GreetRequest request) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GreetConfiguration.class);
		GreetingsMessage greetings = context.getBean(GreetingsMessage.class);
		greetings.setText(request.value);
		context.close();
		return greetings.getText();
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String getError() {
		return "Greetings!";
	}
}