package main;

public class Student {
	private String n;
	int id;
	public Student() {
		
	}
	
	public Student(String name, int id) {
		this.n = name;
		this.id = id;
	}
	
	public String getName() {
		return n;
	}
	
	public void setName(String name) {
		this.n = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
