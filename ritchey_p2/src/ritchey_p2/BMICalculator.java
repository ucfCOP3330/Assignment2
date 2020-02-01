package ritchey_p2;
import javax.swing.JOptionPane;

public class BMICalculator {

	/*
	   public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1,input2,input3,input4,choice;
		int decision;
		double height,height2,weight2, weight;
		
		choice = JOptionPane.showInputDialog("Would you like to use kilograms or pounds for your calculation? \n Type 1 for kilograms or 2 for pounds");
		decision = Integer.parseInt(choice);
		if (decision == 2)
		{
		input1 = JOptionPane.showInputDialog("Enter height in inches");
		height = Integer.parseInt(input1);
		input2 = JOptionPane.showInputDialog("Enter weight in pounds");
		weight = Integer.parseInt(input2);  
		double BMI = (weight * 703 / height / height);
		        
		System.out.printf("BMI = %.1f\n",BMI);
		        
		        if (BMI < 18.5) 
		        {
		            System.out.println("You are underweight");
		        } 
		        else if (BMI < 25) 
		        {
		            System.out.println("You are normal");
		        } 
		        else if (BMI < 30) 
		        {
		            System.out.println("You are overweight");
		        } 
		        else 
		        {
		            System.out.println("You are obese");
		        }
		    }
		
		if (decision == 1)
		{
			input3 = JOptionPane.showInputDialog("Enter height in meters");
			height2 = Integer.parseInt(input3);
			input4 = JOptionPane.showInputDialog("Enter weight in kilograms");
			weight2 = Integer.parseInt(input4);			        
			double BMI = (weight2/( height2 * weight2));
			        
			System.out.printf("BMI = %.1f\n",BMI);
			        
			        if (BMI < 18.5) 
			        {
			            System.out.println("You are underweight");
			        } 
			        else if (BMI < 25) 
			        {
			            System.out.println("You are normal");
			        } 
			        else if (BMI < 30) 
			        {
			            System.out.println("You are overweight");
			        } 
			        else 
			        {
			            System.out.println("You are obese");
			        }
		}
		}
		
	}


