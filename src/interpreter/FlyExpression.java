package interpreter;

public class FlyExpression implements Expression {
	
	private DuckExpression duck;
	
	public FlyExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		duck.fly();
	}
}
