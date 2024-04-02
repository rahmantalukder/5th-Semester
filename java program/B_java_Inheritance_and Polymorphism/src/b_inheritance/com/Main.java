package b_inheritance.com;

public class Main {

	public static void main(String[] args) {
//		Lion l = new Lion(4, 8);
//		System.out.println(l);
//		l.habit();
//		
//		Tiger t = new Tiger(4, 8);
//		System.out.println(t);
//		t.habit();
		
//		Animal a = new Lion(5, 7);
//		System.out.println(a);
//		a = new Tiger(2,7);
//		System.out.println(a);
		
		PhoneCall pc = new Rahim();
		pc.getCall();
		pc.display();
		pc = new Karim();
		pc.getCall();
	}

}
