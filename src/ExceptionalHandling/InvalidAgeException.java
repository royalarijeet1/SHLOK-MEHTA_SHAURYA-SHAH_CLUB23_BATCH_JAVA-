package ExceptionalHandling;

import java.io.IOException;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidAgeException(String message) {
		super(message);
		System.out.println("---InvalidAgeException(String message)----");
		
		// TODO Auto-generated constructor stub
	}

	public InvalidAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
