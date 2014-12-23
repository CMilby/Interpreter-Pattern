package interpreter;

// Duck class
public class Duck {

	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	/*
	 * Ducks can swim, fly, quack, say their name, turn left, and turn right. 
	 */
	
	public void swim() {
		System.out.println(this + ": Swim");
	}
	
	public void fly() {
		System.out.println(this + ": Fly");
	}
	
	public void quack() {
		System.out.println(this + ": Quack");
	}
	
	public void turnLeft() {
		System.out.println(this + ": Turn Left");
	}
	
	public void turnRight() {
		System.out.println(this + ": Turn Right");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
