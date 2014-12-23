package interpreter;

public class ForExpression implements Expression {

	private Expression expression;
	private int iterations;
	
	public ForExpression(Expression expression, int iterations) {
		this.expression = expression;
		this.iterations = iterations;
	}
	
	@Override
	public void interpret() {
		for (int i = 0; i < iterations; i++) 
			expression.interpret();
	}
}
