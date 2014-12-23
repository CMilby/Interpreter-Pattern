package interpreter;

public class DuckExpression extends Duck implements Expression {

	private Duck duck;
	
	public DuckExpression(String name) {
		super(name);
	}
	
	@Override
	public void interpret() {
		System.out.println(duck + ": Duck expression");
	}
}
