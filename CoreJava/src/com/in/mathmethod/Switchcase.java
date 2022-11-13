package com.Basic.mathmethod;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter program number- ");
		System.out.println("------------------------");
		System.out.println("Armstrong");
		System.out.println("Palindrome");
		System.out.println("Fibonacci");
		System.out.println("------------------------");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : Armstrong();
		break;
		case 2 : Palindrome();
		break;
		case 3 : Fibonacci();
		break;
		default : System.out.println("Enter Vaild Program number!!!!!!");
		break;
		
		}
	}
	public static void Armstrong() {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number which you want to find Armstrong number or not");
		int a = sc.nextInt();
		System.out.println("------------------------");
		int number = a, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            //result = result + Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number) 
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
		
	}
	public static void Palindrome() {
		int num = 151, reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	}
	public static void Fibonacci() {
		int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	
	}


}
