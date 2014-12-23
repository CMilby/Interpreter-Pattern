package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class InterpreterDrive {
	
	private static HashMap<String, DuckExpression> variableMap = new HashMap<String, DuckExpression>();

	public static void main(String[] args) {
		String[] tokens = loadFile("source.txt");
		
		for (String s : tokens) {
			s = s.trim();
			if (s.isEmpty() || s.length() == 0 || s.startsWith("//"))
				continue;
			else if (s.startsWith("for ")) 
				new ForExpression(getExpressionInstance(s.substring(6, s.indexOf('.')), s.substring(s.indexOf('.') + 1)), Integer.valueOf(s.substring(4, 5))).interpret();
			else if (s.startsWith("Duck ")) 
				variableMap.put(s.substring(5, s.indexOf('(')), new DuckExpression(s.substring(s.indexOf('(') + 1, s.indexOf(')'))));
			else if (variableMap.containsKey(s.substring(0, s.indexOf('.'))))
				getExpressionInstance(s.substring(0, s.indexOf('.')), s.substring(s.indexOf('.') + 1)).interpret();
			else
				throw new NotAnExpressionException();
		}
	}
	
	private static Expression getExpressionInstance(String variable, String method) {
		switch (method) {
			case "quack":
				return new QuackExpression(variableMap.get(variable));
			case "fly":
				return new FlyExpression(variableMap.get(variable));
			case "swim":
				return new SwimExpression(variableMap.get(variable));
			case "name":
				return new NameExpression(variableMap.get(variable));
			case "left":
				return new LeftExpression(variableMap.get(variable));
			case "right":
				return new RightExpression(variableMap.get(variable));
			default:
				throw new NotAnExpressionException();
		}
	}
	
	private static String[] loadFile(String path) {
		String src = "";
		
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(new File(path));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		while (fileIn.hasNext()) 
			src += fileIn.nextLine() + "\n";
		fileIn.close();
		return src.split("\n");
	
	}
}
