package com.cts.SimpleJava;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
        double largest = numArray[0];
        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }
        System.out.format("Largest element = %.2f", largest);
	}

}
