package project03;

public class car {
	String brand = "kia";
	String engine = "부릉부릉";
	
	car(String brand){
		this.brand = brand;
//		this.engine = engine;	
	}
	void sayHello() {
		System.out.println(engine+" 내차는 "+brand
				+"의 차야");
	}

}
