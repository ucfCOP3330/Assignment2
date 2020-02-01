package ritchey_p1;

import javax.swing.JOptionPane;

public class Encrypter {

/*
 * pseudo code	 
*/
	
	public static void main(String[] args)
	{
		//declaration of variables to be used in calculations
		String fourDigitNum;
			int numOne, firstDigit, secondDigit, thirdDigit, fourthDigit, encryptNum;
		//i need to get input from the user
			do
			{			
				fourDigitNum = JOptionPane.showInputDialog("Enter a 4 digit number");
				numOne = Integer.parseInt(fourDigitNum);
			}
			
		//i need to decrypt the input from the user	
			while(numOne/10000 != 0 || fourDigitNum.length() != 4);
	 
				firstDigit = numOne/1000;
				secondDigit = numOne/100;
				thirdDigit = numOne/10;
				fourthDigit = numOne/1;
	 
				firstDigit = (firstDigit+7)%10;
				secondDigit = (secondDigit+7)%10;
				thirdDigit = (thirdDigit+7)%10;
				fourthDigit = (fourthDigit+7)%10;
	 
				encryptNum = firstDigit;
				firstDigit = thirdDigit;
				thirdDigit = encryptNum;
	 
				encryptNum = secondDigit;
				secondDigit = fourthDigit;
				fourthDigit = encryptNum;
	 
	 //i need to display the encryption in the console
				System.out.println( "Your number encrypted is " + firstDigit + secondDigit + thirdDigit + fourthDigit);
				 
				//int encryptedNum = (firstDigit + secondDigit + thirdDigit + fourthDigit);
				//return encryptedNum;
	 
	 
		}
	}