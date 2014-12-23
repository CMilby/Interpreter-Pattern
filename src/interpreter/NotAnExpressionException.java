package interpreter;

public class NotAnExpressionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotAnExpressionException() {
		super("Not An Expression");
	}
}
