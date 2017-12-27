package org.hit.data.gen;

import org.hit.data.random.AbstractRandomInt;
import org.hit.data.table.TableInfo;

public class ExecutorGen implements Runnable {
	
	public TableInfo tableInfo;

	public ExecutorGen(TableInfo tableInfo) {
		this.tableInfo = tableInfo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//根据每一个Field的属性，分配响应的Random随机生成函数
		int FieldLength = tableInfo.table.getFields().length;
		AbstractRandomInt [] randomInts = new AbstractRandomInt[FieldLength];
		//根据属性特点返回一个随机生成函数
		for(int i=0;i<FieldLength;i++){
			randomInts[i]=
		}
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
