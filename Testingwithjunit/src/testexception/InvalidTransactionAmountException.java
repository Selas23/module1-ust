package testexception;

public class InvalidTransactionAmountException extends RuntimeException {
	
	//private static final long serialVersionUID=
	
	public InvalidTransactionAmountException(String message){
		super(message);
	}

	
}
