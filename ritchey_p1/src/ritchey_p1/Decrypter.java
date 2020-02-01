package ritchey_p1;
//programming assignment two, problem one

import javax.swing.JOptionPane;

public class Decrypter {

/*
 * pseudo code	 
 */
	
	public static void main(String[] args)
		{
	 //declaration of variables to be used in calculations
			String fourDigitNum;
			int numOne, firstDigit, secondDigit, thirdDigit, fourthDigit, decryptNum;
	 //i need to get input from the user
			do
			{			
				fourDigitNum = JOptionPane.showInputDialog("Enter a 4 digit number");
				numOne = Integer.parseInt(fourDigitNum);
			}
			
	 //i need to decrypt the input from the user	
			while(numOne/10000 != 0 || fourDigitNum.length() != 4);
	
				firstDigit  = (numOne/1000);
				secondDigit = (numOne/100%10);
				thirdDigit  = (numOne/10%10);
				fourthDigit = (numOne%10);
	 
	      	if(firstDigit <= 6 && firstDigit >= 0) 
	      	{
	      		firstDigit = firstDigit + 10;
	      	}
	      	
	      	if(secondDigit <= 6 && secondDigit >= 0) 
	      	{	
	            secondDigit = secondDigit + 10;
	      	}
	      	
	      	if(thirdDigit <= 6 && thirdDigit >= 0)
	      	{   
	      		thirdDigit = thirdDigit + 10;
	      	}
	      	
	      	if(fourthDigit <= 6 && fourthDigit >= 0)
	      	{   
	      		fourthDigit  = (fourthDigit + 10);
	      		firstDigit   = (firstDigit - 7);
	        	secondDigit  = (secondDigit - 7);
	        	thirdDigit   = (thirdDigit - 7);
	        	fourthDigit  = (fourthDigit - 7);
	        	decryptNum   = firstDigit;
	        	firstDigit   = thirdDigit;
	        	thirdDigit   = decryptNum;
	 
			    decryptNum  = secondDigit;
			    secondDigit = fourthDigit;
			    fourthDigit = decryptNum;
	      	}
	 //i need to display the decryption in the console
				System.out.println("Your number decrypted is " + firstDigit + secondDigit + thirdDigit + fourthDigit);
				//int decryptedNum = (firstDigit + secondDigit + thirdDigit + fourthDigit);
				//return decryptedNum;
		}
	}
	

