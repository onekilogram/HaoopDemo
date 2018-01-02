package org.hit.data.gen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.hit.data.random.AbstractRandomInt;
import org.hit.data.table.Field;
import org.hit.data.table.Globals;
import org.hit.data.table.TableInfo;
import org.hit.data.utils.RandomCreateUtils;

public class ExecutorGen implements Runnable {

	public TableInfo tableInfo;

	public ExecutorGen(TableInfo tableInfo) {
		this.tableInfo = tableInfo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 根据每一个Field的属性，分配响应的Random随机生成函数
		int FieldLength = tableInfo.table.getFields().length;
		Field[] fields = tableInfo.table.getFields();
		int rowCount = (int) tableInfo.numTuples;
		AbstractRandomInt<?>[] randomInts = new AbstractRandomInt[FieldLength];
		// 根据属性特点返回一个随机生成函数
		for (int i = 0; i < FieldLength; i++) {
			randomInts[i] = RandomCreateUtils.getRandomByField(fields[i]);
		}
		// new 一个以文件的

		File file = new File(tableInfo.tableName + ".txt");

		// if file doesnt exists, then create it
		// if (!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// true = append file
		FileWriter fileWritter = null;
		try {
			fileWritter = new FileWriter(file.getName(), false);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

		for (int i = 0; i < 1500000; i++) {
			//getRow(randomInts);
			try {
				bufferWritter.write(getRow(randomInts) + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			bufferWritter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getRow(AbstractRandomInt<?>[] randomInts) {

		StringBuilder stringBuilder = new StringBuilder();

		for (AbstractRandomInt<?> abstractRandomInt : randomInts) {
			stringBuilder.append(abstractRandomInt.nextValue() + Globals.DELIMITER);
			abstractRandomInt.rowFinished();
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
