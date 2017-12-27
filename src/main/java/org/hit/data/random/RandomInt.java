package org.hit.data.random;

/**
 * @ClassName RandomInt
 * @Description 动态的调整数据的范围
 * @author kg
 */

public class RandomInt extends AbstractRandomInt {
	public RandomInt(long seed, int expectedUsagePerRow) {
		super(seed, expectedUsagePerRow);
	}

	@Override
	public int nextInt(int lowValue, int highValue) {
		return super.nextInt(lowValue, highValue);
	}

	//
	public static void main(String[] args) {
		RandomInt randomInt = new RandomInt(System.currentTimeMillis(), 3);
		
		for(int i= 1;i<9;i++){
			int count = randomInt.nextInt(1, 1*RandomDecimal.num[i]);
			randomInt.rowFinished();
			System.out.println(count);
		}
	}

}