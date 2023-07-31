package project03;

public class person {
	String name = "Kim";
	int age = 20;
	int[] arr = new int[5];
	
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void sayHello() {
		System.out.println("Hello, my name is " 
				+ name + " and i'm "
				+ age + "years old");
	}
	
			
}
