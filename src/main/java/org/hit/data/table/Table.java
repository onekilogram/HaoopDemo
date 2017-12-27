package org.hit.data.table;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Table 
 * @Description 类似于数据库中的表 
 * @author kg 
 * @date   2017年12月27日 上午8:48:03
 */
public class Table {
	private Field[] fields;
	private List<Field> fieldsList;
	
	public Table(Field [] fields){
		this.fields = fields;
		this.fieldsList=Arrays.asList(fields); 
	}
	public Table(List<Field> fieldsList){
		this.fieldsList = fieldsList;
		fieldsList.toArray(this.fields);
	}
	public Table(Field [] fields,List<Field> fieldsList){
		this.fields = fields;
		this.fieldsList = fieldsList;
	}
	
	public Field[] getFields() {
		return fields;
	}

	public void setFields(Field[] fields) {
		this.fields = fields;
	}

	public List<Field> getFieldsList() {
		return fieldsList;
	}

	public void setFieldsList(List<Field> fieldsList) {
		this.fieldsList = fieldsList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
