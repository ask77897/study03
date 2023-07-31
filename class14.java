package project03;

import java.util.Scanner;

public class class14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(function1()+fuction3());
		function2(2);
		
		System.out.println(sum(3,4));
		}
	public static int function1() {
		return 1;
	}
	public static void function2(int x) {
		System.out.println("--------"+ x +"단--------");
		return;
	}
	public static int fuction3() {
		return 2;
	}
	public static int sum(int a, int b) {
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
		
		return a+b;
	}
	
}

//https://drive.google.com/drive/folders/1MDOYCG5D_Ai39mlpauAfxUM4RbsL6QA1?usp=sharing
//함수 <- f(x) : 입력값이 있고, 출력값이 있는 것.

//자료형 함수명(매개변수){
//	코드
//	반환값
//}

//매개변수 -> 자료형 변수명, 여러개가 올 수 있다. -> void 매개변수가 없다.
//반환값 -> 단, 하나다. -> void 반환값이 없다.
//
