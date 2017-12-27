package org.hit.data.table;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Globals
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author kg
 */
public class Globals {

	// 定义一些重要的变量
	public static int AlphaNumeric_averageLength = 5; // RandomAlphaNumeric
														// averageLength is 5
	public static int RandomText_averageLength = 20;

	static Map<String, TableInfo> tableInfos = new HashMap<String, TableInfo>();

	public static TableInfo getTableInfo(String tableName) {
		return tableInfos.get(tableName);
	}

	public static void addTableInfo(TableInfo tableInfo) {
		tableInfos.put(tableInfo.tableName, tableInfo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
