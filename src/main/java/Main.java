
/**
 * Main class. 
 **/

public class Main {
	public static void main(String[] args){
		Calculator calc = new Calculator();
		
		System.out.println(calc.divide(0, 1));
		System.out.println(calc.divide(1, 0));
	}

}
