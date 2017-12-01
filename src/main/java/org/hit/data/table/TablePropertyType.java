package org.hit.data.table;

/**
 * @ClassName TablePropertyType
 * @Description TODO 枚举类型，表示属性的类型，比如varchar,int
 * @author kg
 * @date 2017年12月1日 下午10:12:22
 */
public enum TablePropertyType {

	INTEGER("INTEGER"), INT("INT"), VARCHAR("VARCHAR"), DATATIME("DATATIME");

	private String name;

	private TablePropertyType(String name) {
		this.name = name();
	}

	// 覆盖方法
	@Override
	public String toString() {
		return this.name;
	}
}
