
public class CalculatorModel {
	private long calculationValue;
	
	public void addTwoNumbers(int firstNum, int secondNum){
		
		calculationValue = (long)firstNum + (long)secondNum;
	}
	
	public void subtractTwoNumbers(int firstNum, int secondNum){
		
		calculationValue = (long)firstNum - (long)secondNum;
	}
	
	public void multiplyTwoNumbers(int firstNum, int secondNum){
		
		calculationValue = (long)firstNum * (long)secondNum;
	}
	
	public void divideTwoNumbers(int firstNum, int secondNum){
		
		calculationValue = (long)firstNum / (long)secondNum;
	}
	
	
	public long getCalculationValue(){
		return calculationValue;
	}
}
