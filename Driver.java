package com.set.retriveobjectindividualvalue;

import java.util.HashMap;

public class Driver {    
public static void main(String[] args) {
    HashMap<TestModel, String> hash = new HashMap<TestModel, String>();
    TestModel c1;
    TestModel c2;
    c1 = new TestModel("A", "Maruthi", "4");
    c2 = new TestModel("B", "Toyota", "7");
    hash.put(c1,"A");
    hash.put(c2,"B");
    for(TestModel t:hash.keySet()) {
      System.out.println(t.getSpeed() + " " + t.getId() + " " + t.getName());
    }
}
}
