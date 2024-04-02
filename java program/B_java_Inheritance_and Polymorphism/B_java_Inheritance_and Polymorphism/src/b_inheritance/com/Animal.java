package b_inheritance.com;

public class Animal {
	int number;
	public Animal() {
		
	}
	public Animal(int num) {
		this.number = num;
	}
	
	@Override
	public String toString() {
		return "Total Number of Animal: "+number+"\n";
	}
	
	public void habit() {
		System.out.println("Animal has various habit");
	}
}
