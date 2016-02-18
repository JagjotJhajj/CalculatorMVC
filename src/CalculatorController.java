import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model){
		
		this.model = model;
		this.view = view;
		
		this.view.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;
			String symbol = " ";
			
			
			try{
				
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				symbol = view.getSymbol();
				
				if(symbol.equals("+")){
				model.addTwoNumbers(firstNumber, secondNumber);
				}
				
				else if(symbol.equals("-")){
					model.subtractTwoNumbers(firstNumber, secondNumber);
				}
				
				else if(symbol.equals("*")){
					model.multiplyTwoNumbers(firstNumber, secondNumber);
				}
				
				else if(symbol.equals("/")){
					model.divideTwoNumbers(firstNumber, secondNumber);
				}
				
				else{
					throw new NumberFormatException();
				}
				view.setCalcSolution(model.getCalculationValue());
			}
			
			catch(NumberFormatException ex){
				
				view.displayErrorMessage("Error: Invalid input");
			}
		}
		
	}
}
