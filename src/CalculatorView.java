import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	Font font1 = new Font("SansSerif", Font.PLAIN, 50);
	
	private JTextField firstNum = new JTextField(10);
	private JTextField additionLabel = new JTextField(10);
	private JTextField secondNum = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	
	
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(2400,200);
		
		

		calcPanel.add(firstNum);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNum);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		firstNum.setFont(font1);
		secondNum.setFont(font1);
		calcSolution.setFont(font1);
		additionLabel.setFont(font1);
		calculateButton.setFont(font1);
				
		
		this.add(calcPanel);
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNum.getText());
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNum.getText());
	}
	
	public String getSymbol(){
		
		return additionLabel.getText();
	}
	
	public long getCalcSolution(){
		
		return Long.parseLong(calcSolution.getText());
	}
	
	public void setCalcSolution(long solution){
		
		calcSolution.setText(Long.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
