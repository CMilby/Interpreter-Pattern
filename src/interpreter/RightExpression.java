package interpreter;

public class RightExpression implements Expression {

	private DuckExpression duck;
	
	public RightExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		duck.turnRight();
	}
}
