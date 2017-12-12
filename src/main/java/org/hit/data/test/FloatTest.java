package org.hit.data.test;

import java.util.Random;

/**
 * @ClassName FloatTest
 * @Description Float测试
 * @author kg
 * @date 2017年12月10日 下午4:24:40
 */
public class FloatTest {

	public static void main(String[] args) {
		//
		Random random = new Random();

		System.out.println(random.nextDouble());
		// int length =
	}

	public static double getNextDouble(Double min, Double max) {

		Random random = new Random();

		return min + (max - min) * random.nextDouble();
	}
}
