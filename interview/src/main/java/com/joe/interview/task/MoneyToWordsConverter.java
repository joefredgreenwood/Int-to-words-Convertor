package com.joe.interview.task;

import java.util.Set;

public class MoneyToWordsConverter {
	
	
	
	 public static String Convert(int moneyInPence) { // This is a method to convert a price given in pence in to its word form
		 
		 String money = String.valueOf(moneyInPence);
		 char[] digits = new char[6];
		 digits = money.toCharArray();
		 int length = money.length();
		 
		 if (length==1) {
			String penceOne = String.valueOf(digits[0]);
			return singleDigitCalc(penceOne)+" Pence";			 
			 }
		
		 else if (length > 1) {
			String penceTotal = tenCalculator(String.valueOf(digits[-1]), String.valueOf(digits[-2]))+" pence";
			
			if(length==2) { //To check whether it will be pence
				 return penceTotal;				 
			 }
			 else if(length==3) { // This will be £x.xx
				 String poundOne = String.valueOf(digits[0]);	
				 return singleDigitCalc(poundOne)+" pounds and "+penceTotal;				 
			 }
			if (length > 3) {
				String tenPounds = tenCalculator(String.valueOf(digits[-3]), String.valueOf(digits[-4]))+" pounds and "+penceTotal;
			
				  if(length==4) {					
					 return tenPounds;					 
				 }
				 else if(length==5) {
					 String poundThree = String.valueOf(digits[0]);
					 return singleDigitCalc(poundThree)+" Hundred and"+tenPounds;			 
					 
				 }
				 else if(length==6) {
					 String poundThree = String.valueOf(digits[1]);
					 String poundFour = String.valueOf(digits[0]);
					 return singleDigitCalc(poundFour)+" thousand "+singleDigitCalc(poundThree)+" Hundred and"+tenPounds;
				 }
			}
		}		 
		 return null;
	}
	 
	
	 
	 public static String singleDigitCalc(String oneS) {
		
		int one = Integer.parseInt(oneS);
		
		if (one == 0) {
			return "zero";
		}
		else if (one == 1) {
			return "one";
		}
		else if (one ==2) {
			return "two";
		}
		else if (one ==3) {
			return "three";
		}
		else if (one ==4) {
			return "four";
		}
		else if (one == 5) {
			return "five";
		}
		else if (one == 6) {
			return "six";
		}
		else if (one == 7) {
			return "seven";			
		}
		else if (one == 8) {
			return "eight";
		}
		else if (one == 9) {
			return "nine";
		}
		else {return null;}
		
	}
	
	
	public static String tenCalculator(String oneS, String tenS) {
		
		int ten = Integer.parseInt(tenS);
		int one = Integer.parseInt(oneS);
		if(ten==0) {
			return singleDigitCalc(oneS);
		}
		if (ten==1) {
			
			if(one==0) {
				return "ten";
			}
			else if(one==1) {
				return "eleven";
			}
			else if(one==2) {
				return "twelve";
			}
			else if(one==3) {
				return "thirteen";
			}
			else if (one ==5) {
				return "fifteen";
			}
			else if (one ==8 ) {
				return "eighteen";
			}
			else {
				return singleDigitCalc(oneS)+"teen";
			}
		}
		else if (ten == 2) {
			if(one == 0) {
				return "twenty";
			}
			else {
				return "twenty "+singleDigitCalc(oneS);
			}
		}
		else if (ten == 3) {
			if (one== 0) {
				return "thirty";
			}
			else {
				return "thirty "+singleDigitCalc(oneS);
			}
		}
		else if (ten == 5) {
			if(one == 0) {
				return "fifty";
			}
			else {
				return "fifty "+singleDigitCalc(oneS);
			}
		}
		else if (ten == 8) {
			if (one == 0) {
				return "eighty";
			}
			else {
				return "eighty "+singleDigitCalc(oneS);
			}
		}
		else {
			if (one == 0) {
				return singleDigitCalc(tenS)+"ty";
			}
			else {
				return singleDigitCalc(tenS)+"ty "+singleDigitCalc(oneS);
			}
		}
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
