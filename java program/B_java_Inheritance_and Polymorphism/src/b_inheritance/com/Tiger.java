package b_inheritance.com;

public class Tiger extends Animal{
	public int num;
	public Tiger(int num, int total) {
		super(total);
		this.num = num;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Total Number of Tiger: "+num+"\n";
	}
	@Override
	public void habit() {
		System.out.println("Tiger has various habit");
	}
}
