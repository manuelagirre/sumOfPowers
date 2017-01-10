package sumOfPowers;

import math.MyMath;

public class SumOfPowers {

	public static void main(String[] args) {
		//long time = System.currentTimeMillis();
		long sum = 0;
		for (long i = 0; i < 200000; i++){
			boolean isTrue = MyMath.isEqualToSumOfPowers(i,5);
			if (isTrue){
				System.out.println("Number " + i + " answer is " + isTrue);
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
		//System.out.println("Calculating time : " + (System.currentTimeMillis() - time) + "ms");
	}

}
