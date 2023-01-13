/*
 * Author: Jason Beach
 * Date: 01/10/2023
 * CSCI 1111: Exercise 10-3
 * */

public class Driver {

	public static void main(String[] args) {
		
		/** Create MyInteger objects*/
		MyInteger num1 = new MyInteger(10);
		MyInteger num2 = new MyInteger(15);
		MyInteger num3 = new MyInteger(20);
		MyInteger num4 = new MyInteger (7);
		MyInteger num5 = new MyInteger (17);

		/** Check getValue (getter) method*/
		System.out.println ("Test num1 " + num1.getValue());
		System.out.println ("Test num2 " + num2.getValue());
		System.out.println ("Test num3 " + num3.getValue());
		
		
		/** Check isEven() method*/
		System.out.println (num2.getValue() + " Is even " + num2.isEven());
		System.out.println (num3.getValue() + " Is even " + num3.isEven());
		
		/** Check isOdd() method*/
		System.out.println (num2.getValue() + " Is odd " + num2.isOdd());
		System.out.println (num3.getValue() + " Is odd " + num3.isOdd());
		
		/** Check isPrime() method*/
		System.out.println (num3.getValue() + " Is prime " + num3.isPrime());
		System.out.println (num4.getValue() + " Is prime " + num4.isPrime());
		System.out.println (num5.getValue() + " Is prime " + num5.isPrime());
		
		
		/** Check isEven(int) method*/
		System.out.println ("10 is even " + MyInteger.isEven(10));
		System.out.println ("13 is even " + MyInteger.isEven(13));
		
		/** Check isOdd(int) method*/
		System.out.println ("10 is odd " + MyInteger.isOdd(10));
		System.out.println ("13 is odd " + MyInteger.isOdd(13));
		
		/** Check isPrime(int) method*/
		System.out.println ("17 is prime " + MyInteger.isPrime(17));
		System.out.println ("10 is prime " + MyInteger.isPrime(10));
		
		
		/** Check isEven(MyIngeger) method*/
		System.out.println (num1.getValue() + " Is Even " + MyInteger.isEven(num1));
		System.out.println (num2.getValue() + " Is Even " + MyInteger.isEven(num2));
			
		/** Check isOdd(MyInteger) method*/
		System.out.println (num1.getValue() + " Is Odd " + MyInteger.isOdd(num1));
		System.out.println (num2.getValue() + " Is Odd " + MyInteger.isOdd(num2));
		
		/** Check isPrime(MyInteger) method*/
		System.out.println (num1.getValue() + " Is Prime " + MyInteger.isPrime(num1));
		System.out.println (num5.getValue() + " Is Prime " + MyInteger.isPrime(num5));
		
		
		/** Check equals(int) method*/
		System.out.println (num1.getValue() + " Is equal to 10 " + num1.equals(10));
		
		/** Check equals(MyInteger) method*/
		System.out.println (num3.getValue() + " Is equal to 20 " + num3.equals(num3));
		
	}

}
