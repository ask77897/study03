package project03;

public class class16 {
	public static int a=1;
	public static int b=1;
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a++);//지역
		System.out.println(b++);//지역
		func1();
		System.out.println("1. a:"+a+", b:"+b);//11,21
		func2(a,b); 
		System.out.println("2. a:"+a+", b:"+b);//11,21
		func3();
		System.out.println("3. a:"+a+", b:"+b);//11,21
		func4();
		func5();
		System.out.println("4. a:"+a+", b:"+b);//11,21
		func6(a);
		func7(b);
		System.out.println("5. a:"+a+", b:"+b);//11,21
		func8(a);
		func9(b);
		func10();
		func11();
		
	}
	public static void func1() {//전역변수 -> 2,2
		a++;
		b++;
	}
	public static void func2(int a, int b) {//지역변수 -> 12,22
		a++;
		b++;
	}
	public static void func3() {//지역변수
		int a= -1;
		int b= -2;
	}
	public static int func4() {//전역변수
		return a;
	}
	public static int func5() {//전역변수
		return b;
	}
	public static int func6(int a) {//지역변수
		return a+10;
	}
	public static int func7(int b) {//지역변수
		return b+10;
	}
	public static void func8(int a) {//a=지역, b=전역
		System.out.println("6. a:"+a+", b:"+b);
	}
	public static void func9(int b) {//a=전역, b=지역
		System.out.println("7. a:"+a+", b:"+b);
	}
	public static void func10() {//전역변수
		System.out.println("8. a:"+a+", b:"+b);
	}
	public static void func11() {//지역변수
		int a = -1;
		int b = -2;
		System.out.println("9. a:"+a+", b:"+b);
	}
	

}
