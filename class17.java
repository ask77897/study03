package project03;

public class class17 {

	public static void main(String[] args) {
		person lee = new person("Lee", 21);
		
		lee.sayHello();
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		person kim = new person("kim", 20);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		
		dog puppy = new dog();
		puppy.age = 4;
		puppy.name = "puppy";
		puppy.sayHello();
		puppy.age1();
		
		dog dog2 = new dog();
		dog2.age = 1;
		dog2.name ="doggy";
		dog2.sayHello();
		dog2.age1();
		
		
		System.out.println(puppy.cta(lee.age));
		System.out.println(dog2.cta(lee.age));
		printA(puppy.cta(lee.age),puppy.name, lee.name);
		printA(dog2.cta(lee.age), dog2.name, lee.name);
		
		puppy.printB(lee);
		dog2.printB(lee);
		
		car car1 = new car("bmw");
		car1.sayHello();
		car car2 = new car("폭스바겐");
		car2.sayHello();
		
	}
	public static void printA(boolean b, String dog, String person) {
		if(b) {
			System.out.println(dog+ "의 나이가 "+ person+"의 나이보다 더 많습니다.");
		}else {
			System.out.println(dog+ "의 나이가 "+ person+"의 나이보다 더 적습니다.");
		}
	}

}


//객체와 클래스 <- 객체 개념
//자바<객체지향언어>
//클래스 (설계도)
//객체 (설계도를 통해 만들어진 것)
//
//[접근제어자] class 클래스명 {
//	인스턴스 변수
//	자료형 변수명1;
//	자료형 변수명2;...

//생성자
//클래스명(매개변수1,매개변수2,...)
//
//메소드
//자료형 함수명(매개변수1, 매개변수2,...){
//	코드
//	반환값
//}

//자동차 클래스, 인스턴스 변수, 메소드





