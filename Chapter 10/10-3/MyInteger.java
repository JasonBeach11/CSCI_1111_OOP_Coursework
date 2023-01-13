
public class MyInteger {

	int value = 0;  // initialize value as 0;
	
	/** Constructor */
	MyInteger(int specifiedValue){
		this.value = specifiedValue;
	}
	
	/** Getter */
	public int getValue () {
		return value;
	}
	
	
	/** Return true if value is even */
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	
	/** Return true if value is odd*/
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	
	/** Return true if value is a prime number*/
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value  % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	/** Return true if value is even*/
	public static boolean isEven(int specifiedValue) {
		if (specifiedValue % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	/** Return true if value is odd*/
	public static boolean isOdd(int specifiedValue) {
		if (specifiedValue % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	
	/** Return true if value is a prime number*/
	public static boolean isPrime(int specifiedValue) {
		for (int i = 2; i < specifiedValue; i++) {
			if (specifiedValue % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	
	/** Return true if value is even*/
	public static boolean isEven(MyInteger number) {
		if (number.getValue() % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	
	/** Return true if value is odd*/
	public static boolean isOdd(MyInteger number) {
		if (number.getValue() % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	
	/** Return true if value is a prime number*/
	public static boolean isPrime(MyInteger number) {
		for (int i = 2; i < number.getValue(); i++) {
			if (number.getValue() % i == 0)
				return false;
		}
		return true;
	}
	
	
	/** Return true if value in object is equal to specified value*/
	public boolean equals(int specifiedValue) {
		if (specifiedValue == value) {
			return true;
		}
		else return false;
	}
	
	/** Return true if value in object is equal to specified value*/
	public boolean equals(MyInteger number) {
		if (number.getValue() == value) {
			return true;
		}
		else return false;
	}
	
	/** Convert an array of numeric characters to an int value*/
	public static int parseInt(char[] ch) {
		
		int result = 0;
		
		for(int i = 0; i < ch.length; i++) {
			result = result * 10 + (Character.getNumericValue(ch[i]));
		}
		
		return result;
	}

	
} // End MyInteger Class
