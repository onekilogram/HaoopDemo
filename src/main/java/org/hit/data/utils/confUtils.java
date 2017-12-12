package org.hit.data.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hit.data.table.TableProperty;

public class confUtils {

	public List<TableProperty> getConfigByName(String fileName) {

		List<TableProperty> list = new ArrayList<TableProperty>();
		SAXReader saxReader = new SAXReader();
		saxReader.setEncoding("UTF-8");
		Document document;
		try {
			InputStream is = this.getClass().getResourceAsStream("configuration.xml");
			document = saxReader.read(is);
			is.close();
		} catch (DocumentException e) {
			System.err.println("1");
			return null;

		} catch (IOException e) {
			System.err.println("2");
			return null;
		}

		// 开始解析
		Element root = document.getRootElement();

		// 获取文件列表
		List<Element> tableList = root.elements("table");
		
		List<Element> propertyList = tableList.get(0).elements("property");
		for (Element property : propertyList) {

			TableProperty temp = new TableProperty();

			temp.setName(property.attributeValue("name"));
			temp.setType(property.attributeValue("type"));
			//temp.setLength(Integer.valueOf(property.attributeValue("length")));
			list.add(temp);
		}
		return list;
	}

	public static void main(String[] args) {
		// List<String> wordList = txtTOList();
		// 获得src/main/resource
		URL url = confUtils.class.getClassLoader().getResource("conf/poi-config.xml");
		// File file = new File(url.getFile());
		confUtils confUtil = new confUtils();
		List<TableProperty> list = confUtil.getConfigByName(url.getFile());

		// System.out.println(list.get(0));//

		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

		for (TableProperty s : list) {

			System.out.println(s.getName()+"\t"+s.getType()+"\t"+ s.getLength());
		}
	}
}
