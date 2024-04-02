package main;

public class Teacher {
	public static void main(String[] args) {
		Student st = new Student("Tamim Iqbal", 100);
		System.out.println(st.getName() +" , "+st.id);
		st.setName("Shakibal Al Hasan");
		System.out.println(st.getName() +" , "+st.id);
	}
}
