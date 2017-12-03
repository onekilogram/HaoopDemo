package org.hit.data.poi;
public interface IRowReader {  
    
	/**
	 * 业务逻辑实现方法 
	 * @param sheetIndex
	 * @param sheetname
	 * @param rowIndex
	 * @param row
	 * @param currSheet  
	 * @return
	 */
    public void processLine(int sheetIndex, String sheetname, int rowIndex, String row,MySheet currSheet);
    
    public boolean isForcedInterrupt();
}
