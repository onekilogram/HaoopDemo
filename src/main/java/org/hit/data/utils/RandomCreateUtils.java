package org.hit.data.utils;

import org.hit.data.random.AbstractRandomInt;
import org.hit.data.random.RandomIntKey;
import org.hit.data.table.Field;
import org.hit.data.table.FieldType;

public class RandomUtils {

	public static AbstractRandomInt getRandomByField(Field field){
		
		//先判断是否是主键
		if(field.isPrimaryKey()){
			return new RandomIntKey(1);
		}else if(field.getTablePropertyType()==FieldType.INT || field.getTablePropertyType()==FieldType.INTEGER){
			//考虑位数
			return new 
		}
		
		
		
		return null;
	}
}
