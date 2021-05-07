package com.test.interview;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Even Numbers ***");
		int[] array = {9, 2, 66, 5, 7, 12, 10};
        
        for (int element: array) 
        {
            if(element%2 == 0)
             System.out.println(element + " is an Even number:");
        }

	}
}
