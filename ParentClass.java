package com.interview.exception;

import java.io.IOException;

public class ParentClass {
	
	public void parentMethod() throws Exception{
		System.out.println("parent class");
	}

}

class ChildClass extends ParentClass{

	@Override
	public void parentMethod() throws Exception {
		// TODO Auto-generated method stub
		super.parentMethod();
	}


}
