package ritchey_p2;
import javax.swing.JOptionPane;

public class BMICalculator {
private String weight;
private String height;
private String bmi;
private String catagory;

//i have to read input from the user and determine their bmi
	/*
	   public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	*/
	
	//do they want to use kg or lbs
	@SuppressWarnings("unused")
	private void readUnitType()
	{
		int decision;
		String choice;
		choice = JOptionPane.showInputDialog("Would you like to use kilograms or pounds for your calculation? \n Type 1 for kilograms or 2 for pounds");
		decision = Integer.parseInt(choice);
	}
	//input measurements from the user
	@SuppressWarnings("unused")
	private void readMeasurementData ()
	{
		String input1,input2;
		double height, weight;
		
		input1 = JOptionPane.showInputDialog("Enter height in inches");
		height = Integer.parseInt(input1);
		input2 = JOptionPane.showInputDialog("Enter weight in pounds");
		weight = Integer.parseInt(input2);
	}
	
	@SuppressWarnings("unused")
	private int readMetricData ()
	{
		String input3,input4;
		double height, weight;
		
		input3 = JOptionPane.showInputDialog("Enter height in meters");
		height = Integer.parseInt(input3);
		input4 = JOptionPane.showInputDialog("Enter weight in kilograms");
		weight = Integer.parseInt(input4);	
		return (int) height + (int) weight;
	}
	
	@SuppressWarnings("unused")
	private int readImperialData ()
	{
		String input3,input4;
		double height2, weight2;
		
		input3 = JOptionPane.showInputDialog("Enter height in meters");
		height2 = Integer.parseInt(input3);
		input4 = JOptionPane.showInputDialog("Enter weight in kilograms");
		weight2 = Integer.parseInt(input4);	
		return (int) height2 + (int) weight2;
	}
	
	public double displayBmi ()
	{
		double BMI = 0;
		System.out.printf("BMI = %.1f\n",BMI);
		return BMI;
	}
	
	public String getWeight1 ()
	{
		String input2;
		input2 = JOptionPane.showInputDialog("Enter weight in pounds");
		return input2;
	}
	
	public String getWeight() 
	{ 
		return this.weight; 
	}
	public String getHeight() 
	{ 
		return height; 
	} 
	
	public String getBmi() 
	{ 
		return this.bmi; 
	}
	
	public String getBmiCatagory() 
	{ 
		return this.catagory; 
	}
	
	//i have to create a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1,input2,input3,input4,choice;
		int decision;
		double height,height2,weight2, weight;
		
		choice = JOptionPane.showInputDialog("Would you like to use kilograms or pounds for your calculation? \n Type 1 for kilograms or 2 for pounds");
		decision = Integer.parseInt(choice);
		
		//this option is for using lbs and the first formula
		if (decision == 2)
		{
		input1 = JOptionPane.showInputDialog("Enter height in inches");
		height = Integer.parseInt(input1);
		if (height <=0)
		{
			System.out.println("Invalid Entry");
			return;
		}
		
		input2 = JOptionPane.showInputDialog("Enter weight in pounds");
		weight = Integer.parseInt(input2);  
		
		if (weight <=0)
		{
			System.out.println("Invalid Entry");
			return;
		}
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
		// this option for using kg and the seconds formula
		if (decision == 1)
		{
			input3 = JOptionPane.showInputDialog("Enter height in meters");
			height2 = Integer.parseInt(input3);
			
			if (height2 <=0)
			{
				System.out.println("Invalid Entry");
				return;
			}
			
			input4 = JOptionPane.showInputDialog("Enter weight in kilograms");
			weight2 = Integer.parseInt(input4);	
			
			if (weight2 <=0)
			{
				System.out.println("Invalid Entry");
				return;
			}
			
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


