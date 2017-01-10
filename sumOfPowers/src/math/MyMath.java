package math;

public class MyMath {
	
	/**
	 * Returns true if sum of characters in the power of 4 is equal to the number itself.
	 * If the number is less or equal than 9 it will return false as far as all numbers from 0 to 9 are not right answers.
	 * @param number - long value to check
	 * @param power - int value of power to check
	 * @return boolean - answer
	 */
	static public boolean isEqualToSumOfPowers(long number, int power){
		//TODO particular cases to check 0 and 1 or to check just if the number is more than 9
		if (number == 0) {
			return false;
		}
		if (number == 1) {
			return false;
		}
		if (number < 0) {
			System.out.println("Number " + number + " is negative. Please, provide positive number.");
			return false;
		}
		char characters[] = String.valueOf(number).toCharArray();
		long sum = 0;
		for (char c : characters){
			//System.out.print("char is " + c + " ");
			sum += getPower(Long.parseLong(String.valueOf(c)), power);
		}
		//System.out.println("For number " + number + " answer is " + true);
		if (sum == number){
			return true;
		} else {
			return false;
		}
	}
	
	private static long getPower4(long n){
		if (n == 0){
			return 0;
		} else if (n == 1) {
			// not to iterate over 1
			return 1;
		} else {		
			long out = 1;
			for (int i = 0; i < 4; i++){
				out *= n;
			}
			//System.out.println("power is " + out);
			return out;
		}
	}
	private static long getPower(long n, int power){
		if (n == 0){
			return 0;
		} else if (n == 1) {
			// not to iterate over 1
			return 1;
		} else {		
			long out = 1;
			for (int i = 0; i < power; i++){
				out *= n;
			}
			//System.out.println("power is " + out);
			return out;
		}
	}
}
