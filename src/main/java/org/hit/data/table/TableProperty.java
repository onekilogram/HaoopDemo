package org.hit.data.table;
/**
 * @ClassName TableProperty 
 * @Description 表的属性 ,仿照mysql数据库
 * @author kg 
 * @date   2017年12月1日 下午5:34:45
 */


public class TableProperty {
	private String name;
	private TablePropertyType type;
	private int length;
	private int decimalPoint;
	private boolean isNull;
	private boolean isPrimaryKey;
	
	private boolean isForeignKey;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TablePropertyType getType() {
		return type;
	}

	public void setType(TablePropertyType type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getDecimalPoint() {
		return decimalPoint;
	}

	public void setDecimalPoint(int decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	public boolean isNull() {
		return isNull;
	}

	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}

	public boolean isPrimaryKey() {
		return isPrimaryKey;
	}

	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	public boolean isForeignKey() {
		return isForeignKey;
	}

	public void setForeignKey(boolean isForeignKey) {
		this.isForeignKey = isForeignKey;
	}
}
