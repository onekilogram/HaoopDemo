package org.hit.data.table;

/**
 * @ClassName TableProperty
 * @Description 表的属性 ,仿照mysql数据库
 * @author kg
 */

public class Field {

	private String name;
	private String type;

	private FieldType tablePropertyType;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

	public FieldType getTablePropertyType() {
		return tablePropertyType;
	}

	public void setTablePropertyType(FieldType tablePropertyType) {
		this.tablePropertyType = tablePropertyType;
	}

	@Override
	public String toString() {
		return "Field [name=" + name + ", type=" + type + ", tablePropertyType=" + tablePropertyType
				+ ", length=" + length + ", decimalPoint=" + decimalPoint + ", isNull=" + isNull
				+ ", isPrimaryKey=" + isPrimaryKey + ", isForeignKey=" + isForeignKey + "]";
	}
}