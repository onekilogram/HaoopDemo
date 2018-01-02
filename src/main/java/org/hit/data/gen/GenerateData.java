package org.hit.data.gen;

import java.util.Map;

import org.hit.data.table.Globals;
import org.hit.data.table.TableInfo;
import org.hit.data.utils.confUtils;

public class GenerateData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Globals.tableInfoMap = confUtils.getConfigByName("configuration.xml");

		// 解析TableInfos
		long startTime = System.currentTimeMillis(); // 获取开始时间

		for (Map.Entry<String, TableInfo> entry : Globals.tableInfoMap.entrySet()) {

			Thread thread = new Thread(new ExecutorGen(entry.getValue()));// 多线程实现多表的生成
			thread.start();
			thread.join();
		}
		// thread.join();
		long endTime = System.currentTimeMillis(); // 获取结束时间

		System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); // 输出程序运行时间

	}

}
