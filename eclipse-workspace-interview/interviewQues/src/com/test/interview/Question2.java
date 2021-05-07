package com.test.interview;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("*** maximum consecutive 1's in an array ***");
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream 
		System.out.print("Enter binary number array: "); 
		String inputArray= sc.nextLine(); 
		System.out.print("You have entered: "+inputArray+"\n"); 
		int finalCount = 0;
		int tempCount = 0;
		for (int i = 0; i < inputArray.length(); i++) {
            if(inputArray.charAt(i) == '1')
              tempCount = tempCount + 1;
             else
              tempCount = 0;
             
             if(tempCount > finalCount) 
               finalCount = tempCount;
        }
        
        System.out.print("\nmaximum consecutive 1's in an array: "+finalCount+"\n");

	}

}
