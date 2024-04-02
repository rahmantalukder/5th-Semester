package b_inheritance.com;

public class Lion extends Animal{
	public int num;
	public Lion(int num, int total) {
		super(total);
		this.num = num;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Total Number of Lion: "+num+"\n";
	}
	@Override
	public void habit() {
		System.out.println("Lion has various habit");
	}
}
