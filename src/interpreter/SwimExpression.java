package interpreter;

public class SwimExpression implements Expression {
	
	private DuckExpression duck;
	
	public SwimExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		duck.swim();
	}
}
