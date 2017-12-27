package org.hit.data.table;

/**
 * @ClassName FieldType
 * @Description TODO 枚举类型，表示属性的类型，比如varchar,int
 * @author kg
 * @date 2017年12月3日 下午10:12:22
 */
public enum FieldType {

	INTEGER("INTEGER"), INT("INT"), VARCHAR("VARCHAR"), DATATIME("DATATIME");

	private String name;

	private FieldType(String name) {
		this.name = name();
	}

	// 覆盖方法
	@Override
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {

		System.out.println(FieldType.valueOf("INTEGER"));
		
		FieldType type = FieldType.valueOf("INTEGER");
	}
	
	//TypeUtils.TYPE fieldType = TypeUtils.TYPE.valueOf(columnInfo[1].trim().toUpperCase());
}
