package interpreter;

public class NameExpression implements Expression {

	private DuckExpression duck;
	
	public NameExpression(DuckExpression duck) {
		this.duck = duck;
	}
	
	@Override
	public void interpret() {
		System.out.println("My name is " + duck);
	}
}
