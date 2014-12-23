package interpreter;

public class QuackExpression implements Expression {
	
	private DuckExpression duck;
	
	public QuackExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		duck.quack();
	}
}
