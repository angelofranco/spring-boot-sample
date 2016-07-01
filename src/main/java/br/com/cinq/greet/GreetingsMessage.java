package br.com.cinq.greet;

public class GreetingsMessage {
	private static GreetingsMessage instance;
	private String text = "Hello World";
	
	private GreetingsMessage() {
		
	}
	
	public static GreetingsMessage getInstance() {
		if (instance == null) {
			instance = new GreetingsMessage();
		}
		
		return instance;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String value) {
		text = value;
	}
}
