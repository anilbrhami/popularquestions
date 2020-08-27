package testJune.withmaven;

public class TestOverloadingRiding {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 20;
		
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));
		
		Dog d = new Dog();
		d.eat();
		

	}
	
	
			static int add(int a, int b) {
			int result = (a+b);
			return result;
		}
	
	
	static int add (int a, int b, int c) {
		int result = (a+b+c);
		return result;
	}
	
}

class Animal{
	public void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("Dog loves eating chicken!");
	}


	
}


