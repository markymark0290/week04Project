package week04;

import java.util.Scanner;

public class FirstCodingProject {

	public static void main(String[] args) {
		
		
		//1.a I am subtracting the first element from the last element in the ages array.  I found the last element
		//by taking the length of ages and subtracting 1.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int subAges = ages[0] - ages[ages.length -1];
		
		System.out.println(subAges);
		
		//1.b I added a new element and used the same formula to produce a similar result as 1.a for ages2
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, -18};
		
		int subAges2 = ages2[0] - ages2[ages2.length -1];
		
		System.out.println(subAges2);
		
		//1.c I created a sum variable to add up the integers in use a for each loop and then created a new variable to calculate the average.
		
		double sumAge = 0.0;
		
		for (int age : ages2) {
			sumAge += age;
		}
		double avgAge = sumAge/(ages2.length);
		System.out.println(avgAge);
		
		//2.a Similar to 1.c, I created to variables, one to loop through and sum the lengths of each element in the array
		// and another to calculate the average using the length method.
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumLength = 0.0;
		
		for (String name : names) {
			sumLength += name.length();
		}
		
		double avgNameLength = sumLength/names.length;
		
		System.out.println(avgNameLength);
		
		//2.b I created a new StringBuilder variable since I was going to be adding many different strings together from an
				//array.  Again I used the for each loop and the append method to concatenate the elements from name with a space 
				//in the allNames StringBuilder variable.
		
		
		StringBuilder allNames = new StringBuilder();
		
		for (String name2 : names) {
			allNames.append(name2 + " ");			
		}
		System.out.println(allNames);		

		/*3. I have access to the last element in an array by using the length method minus 1.  Since the element numbers
		always start with 0, the last element number is always the length minus 1.
		
		4. You can access the first element by calling 0.  The elements in an array always start with 0.
				
		5. I instantiated the int array to have the same length as the names array.  This allows me to have enough elements
		in the int array to store the lengths in the names array.  I then loop through using the length method for each 
		element in the names array to be stored as an int in the nameLengths array using index variable i.*/
		
		int[] nameLengths = new int[names.length];
		
		
		for (int i = 0; i < names.length; i++) {
			nameLengths [i] = names[i].length();
		}
		
		//6. I created a new int variable for the loop to add each element to.  I then print to this new variable after
		//the loop. 
		
		int sumNameLengths = 0;
		
		for (int nameLength : nameLengths) {
			sumNameLengths += nameLength;
		}
		
		System.out.println(sumNameLengths);
		
		//7. Below I instantiate the values needed to populate and use them as the arguments when I call the method.
		
		
		String newWord = "pop";
		int nextInt = 9;
		
		System.out.println(manyWords(newWord,nextInt));
		
		//8. I create the first and last name and use them as my arguments in the method that I print out.
		
		String firstName = "John";
		
		String lastName = "Smith";
		
		System.out.println(makeFullName(firstName, lastName));
		
		//9. I have created an array to input as the argument to the method that I called. 
		
		int[] newIntArray = {5, 6, 2 , 12 , 46, 1, 0 , 56, 9};
		
		System.out.println(moreThan100(newIntArray));
		
		//10. I used the same array above to calc the average using the method below.
		
		System.out.println(calculateAverage(newIntArray));
		
		//11. I created the two arrays that I use as arguments in my comparison method.  B is great than A so it prints 
		//false.
		
		double[] doubleArrayA = {2.3, 33.02, 23.98, 9.34, 14.83};
		double[] doubleArrayB = {2.3, 56.02, 23.98, 9.34, 15.83};
		
		System.out.println(doubleComparison(doubleArrayA, doubleArrayB));
		
		//12. I created the variables and used the as arguments.
		
		boolean isItHot = true;
		double wallet = 10.58;
		
		System.out.println(willBuyDrink(isItHot, wallet));
	
		//13.  This solves the problem of calculating the accrued interest between coupon (interest) payments for a 
		//bond.  I did something similar today at work in excel to test our calculation for a client and wanted to get a 
		//better appreciation of what our system is doing.  
		
		double rate = 0.03;
		
		String dayCount = "Act/360";
		
		double parValue = 10000;
		
		int daysAccrued = 45;
		
		System.out.println(accruedInterest(rate,dayCount,parValue,daysAccrued));
	}
	
//******Methods******
	
	//7.  The method is set up using a string (word) and an int (n) parameter.  It loops through n number of times to concatenate 
	//the word variable to a new String called words, then returns words as String.  
	
	public static String manyWords (String word, int n) {
		String words = "";
		for (int i = 0; i < n; i++) {
			words = words + word;
		}
		return words;
	}
	//8. I set up a method with a return type of string that takes in string parameters firstName and lastName then returns
	// a string of fullName.  The fullName variable concatenates first and last names with a space.
	public static String makeFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	//9. I created a method with boolean return type to get a true/false statement.  After pulling in the array value,
	//it sums all the elements in a loop in a new variable, then tests to see if that sum variable is greater than 100
	//in a conditional statement.  Lastly it sets a boolean to true or false based on the criteria and returns the boolean
	//variable.
	
	public static boolean moreThan100 (int[] lotsOfNumbers) {
		int sumArrayValues = 0;
		boolean isMoreThan100 = true;
		for (int i = 0; i < lotsOfNumbers.length; i++) {
			
			sumArrayValues += lotsOfNumbers[i];
		}
		if (sumArrayValues > 100) {
			isMoreThan100 = true;
		}else {
			isMoreThan100 = false;
		}
		return isMoreThan100;
		
	}
	//10. I created a method with a type of double and reused the for loop from above to create a sumArrayValues double.
	//I then took the sumArrayValues divided by the length of the array to get my average.
	
	public static double calculateAverage(int[] lotsOfNumbers) {
		double sumArrayValues = 0.0;
		double averageCalc = 0.0;
		for (int i = 0; i < lotsOfNumbers.length; i++) {
			
			sumArrayValues += lotsOfNumbers[i];
		}
		
		averageCalc = sumArrayValues/lotsOfNumbers.length;
		return averageCalc;
	}
	
	//11. I created a method with a return type of boolean taking in two doubles.  I sum and calculate the average of both 
	//arrays, then test to see which is greater.  Then I update the boolean variable compare to false if A < B.  Since
	//the boolean variable is instantiated with a value of true, I just included one test to see if it should change to
	//false.
	
	public static boolean doubleComparison (double[] doubleA, double[] doubleB) {
		double sumA = 0;
		double sumB = 0;
		boolean compare = true;
		
		for (double aa : doubleA) {
			sumA += aa;
		}
		double avgA = sumA / doubleA.length;
		
		for (double bb : doubleB) {
			sumB += bb;
		}
		
		double avgB = sumB / doubleB.length;
		if (avgA < avgB) {
			compare = false;
		}
		
			return compare;
	
	}
	
	//12. I created the boolean method w/ a boolean and double parameter.  I create a boolean value and set it to false.
	//I then test to see if the conditions are right to buy a drink using an if statement and return the boolean variable.
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		boolean willBuy = false;
		if (isHotOutside && moneyInPocket > 10.50) {
			willBuy = true;
		}
		return willBuy;
	}
	
	//13.  I work for a software company that specializes in investments.  I wanted to see if I could replicate in a small
	//degree how we might calculate accrued on a bond.  There are large number of different ways we calculate this based
	//on a bonds security master data.  I put in a few of those parameters to test how we might calculate this differently
	//based on differences in the day count for the bond.  Below I use an if statement and use different calculations
	//depending on the string input for the day count.  
	
	public static double accruedInterest (double rate, String dayCount, double units, int daysAccrued) {
		double accrued = 0;
		if (dayCount.equals("Act/360")) {
			accrued = units * rate/360 * daysAccrued;
		}else if (dayCount.equals("Act/365")) {
			accrued = units * rate/365 * daysAccrued;
		}else {
			accrued = 0;
		}
		
		return accrued;
		
	}
	
	
}
