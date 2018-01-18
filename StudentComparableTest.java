package com.interview.mapsort;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StudentComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentComparableTest studentComparable = new StudentComparableTest();
		StudentModel model = new StudentModel(100, "Wipro");
		StudentModel model1 = new StudentModel(101, "Accnture");
		StudentModel model2 = new StudentModel(102, "TCS");
		StudentModel model3 = new StudentModel(100, "Wipro");
		StudentModel model4 = new StudentModel(103, "Nokia");
		Map<StudentModel, String> map = new TreeMap<StudentModel, String>();
		map.put(model, "First");
		map.put(model1, "Second");
		map.put(model2, "Third");
		map.put(model3, "Four");
		map.put(model4, "Five");
		Set set = map.keySet();
		//System.out.println("Map Key:" + set);
		Set<Entry<StudentModel,String>> es=map.entrySet();
		for(Entry<StudentModel, String> entrySet:es)
		{
			System.out.println(entrySet.getValue()+"--"+entrySet.getKey()+"hash code"+"------"+entrySet.getKey().hashCode());
		}

	}

}
