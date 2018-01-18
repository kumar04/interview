package com.set.retriveobjectindividualvalue;

public class TestModel {

	private String Id;
	private String speed;
	private String name;
	
	

	public TestModel(String id, String speed, String name) {
		super();
		Id = id;
		this.speed = speed;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
