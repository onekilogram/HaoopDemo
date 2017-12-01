package org.hit.data.utils;
/**
 * @ClassName WordUtils 
 * @Description 单词工厂 
 * @author kg 
 * @date   2017年12月1日 上午10:26:15
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordUtils {

	List<String> wordList = new ArrayList<String>(5000);

	Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

	/**
	 * 读取txt文件的内容
	 * @param file 想要读取的文件对象
	 * @return 返回文件内容
	 */
	public static List<String> txtTOList(String file) {
		List<String> wordList = new ArrayList<String>(5000);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				wordList.add(s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wordList;
	}
	public static void main(String[] args) {
		List<String> wordList = txtTOList();
		
	}
}
