/*
 * A simple calculator I made to see how GUIs work in Java
 * Credit goes to Derek Banas, whose youtube tutorial on MVC I followed to help make
 * this, I added more functionality to his example, which only added 2 numbers together
 * 
 * The user will be presented with three boxes, a "calculate" button, and then a fourth box.
 * 
 * In the first and third box, write an integer
 * In the second box, write a '+','-','*',or '/' sign
 * 
 * Hit calculate and the result will be shown in the last box
 * 
 * Note that this only does integer math, so 4/3 will output a 1
 * 
 */
public class Calculator {

	public static void main(String[] args){
		
		CalculatorView view = new CalculatorView();
		
		CalculatorModel model = new CalculatorModel();
		
		CalculatorController controller = new CalculatorController(view, model);
		
		view.setVisible(true);
		
		
	}
}
