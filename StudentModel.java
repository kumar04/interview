package com.interview.mapsort;

public class StudentModel implements Comparable<StudentModel> {

	private Integer id;
	private String name;

	public StudentModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int Integer) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(StudentModel o) {
		// TODO Auto-generated method stub
		if (this.getId() > o.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("result:" + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("result:" + obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentModel other = (StudentModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
