package interpreter;

public class LeftExpression implements Expression {

	private DuckExpression duck;
	
	public LeftExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		duck.turnLeft();
	}
}
