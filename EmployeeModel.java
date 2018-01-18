package com.duplicate.set;

/**
 * @author x222389
 *
 */
public class EmployeeModel {

	private String ID;
	private String name;

	/**
	 * @param iD
	 * @param name
	 */
	public EmployeeModel(String iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeModel [ID=" + ID + ", name=" + name + "]";
	}
}
