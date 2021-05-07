package com.test.interview;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Repeated Number ***");
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10}; // This array can have any number of elements
        int temp = -1;
        for (int element: array) 
        {
            if(temp != -1)
            {
                if(temp == element)
                break;
            }
            temp = element;
             
        }
        System.out.println("Repeated Number is:"+temp);

	}

}
