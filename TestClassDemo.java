package com.demo.test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

@SuppressWarnings("unused")
public class TestClassDemo {

/*	public List<Map<String, Object>> getDBRecords(String query) {
		List<Map<String, Object>> recordList = null;
		recordList = template.query(query, new RowMapper<Map<String, Object>>() {

			@Override
			public Map<String, Object> mapRow(ResultSet rs, int index) throws SQLException {
				Map<String, Object> recordMap = new HashMap<>();
				ResultSetMetaData metaData = rs.getMetaData();
				int columnCount = metaData.getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i);
					recordMap.put(columnName, rs.getObject(columnName));
				}
				return recordMap;
			}
		});
		return recordList;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("A");
		s2.hashCode();
		String s3 = new String("A");
		s2 = "a";

		HashMap map = new HashMap();
		map.put(s2, "A");
		Object obj = map.put(s2, "B");
		System.out.println("Obj:" + obj.hashCode());

	}

}
