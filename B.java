package APITesting.com.org.api;

public class B extends ThisEx {
	int a=12;
	int b=12;
	public void add() {
		int a = 50;
		int b = 25;

		System.out.println(this.a + this.b);
		System.out.println(super.a+super.b);
		System.out.println(a+b);
		

	}

	public static void main(String[] args) {
		B obj = new B();
		obj.add();

	}

}
