package project03;

import java.util.Scanner;

public class class18 {

	public static void main(String[] args) {
		String greeting = "Hello";
		String sentence = greeting + "Profesor";
//		String 
		
		System.out.println(sentence);
		System.out.println(sentence.length());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
		System.out.println(greeting.replace('l', 'z'));
		System.out.println(greeting.substring(2)); //substring(a) ->a부터 끝까지
		System.out.println(sentence.substring(2, 9));//substring(a,b) ->a부터 b전까지
		
		System.out.println(sentence.charAt(4));
		System.out.println(sentence.indexOf("l"));//문자열에서 가장 앞에 있는 것을 찾아서 반환
		System.out.println(sentence.indexOf("l"));
		System.out.println(sentence.indexOf("l", 2));//a번째부터 가장 앞에 있는 것을 찾아서 반환
		System.out.println(sentence.lastIndexOf("l"));//문자열에서 가장 뒤에 있는 것을 찾아서 반환
		
		System.out.println(greeting.concat(sentence));
		System.out.println(greeting.equals("Hello"));
		System.out.println(greeting.equalsIgnoreCase("hello"));
		System.out.println(greeting.compareTo("Aello"));//7  -> A가 H보다 7번 앞에 있다.
		System.out.println(greeting.compareTo("Hello"));//0
		System.out.println(greeting.compareTo("Hezzo"));//-14 -> z가 l보다 14번 뒤에 있다.
		
//String world = "Hello World." 모든 문장은 마침표로 마무리 된다라는 가정하에
//length 사용하지 안고 총 길이를 출력해보자.
		String world = "Hello World.";
//		System.out.println(world.length());
		System.out.println(world.lastIndexOf(".")+1);
		int index = 0;
		int cnt = 0;
		while(true) {
//			cnt++; 마침표까지 세주는 위치
			if(world.charAt(index)=='.') {
				break;
			}
			cnt++;
			index++;
		}
		System.out.println(cnt);
		
//equalsIgonreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
		String word1= "Hello";
		String word2= "hello";
//		System.out.println(word1.toLowerCase().equals(word2.toLowerCase()));
//		if(word1.length()!=word2.length()) {
//			System.out.println(false);
//			return;
//		}
//		
//		System.out.println((int)'a'); //a=97 , A=65
//		int a = 'A';
//		System.out.println(a);
//		
//		for(int i = 0; i<word1.length(); i++) {
//			int x = word1.charAt(i);
//			int y = word2.charAt(i);
//			
//			if(x>96) {
//				x-=32;
//			}
//			if(y>96) {
//				y-=32;
//			}
//			
//			if(x != y) {
//				System.out.println(false);
//				return;
//			}
//				
//		}
//		if(!(word1.equals(word2))) {
//			word1 = word1.toLowerCase();
//			word2 = word2.toLowerCase();
//			System.out.println(word1.equals(word2));
//		}
//		System.out.println(word1.equals(word2));
//문자열에 indexOf 처음, 마지막에 특정위치를 알 수 있었다. 그러면 해당 문자열에 원하는 문자가 몇 개 들어있는지
		int cnt2 = 0;
//		for(int i = 0; i<sentence.length(); i++) {
//			if(sentence.charAt(i)=='o')
//				cnt2++;
//		}
//		System.out.println(cnt2);
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		for(int i = 0; i<sentence.length(); i++) {
//			if(sentence.charAt(i) == s.charAt(0))
//				cnt2++;
//		}
		
		for(int i = 0; i<sentence.length(); i++) {
			if(s.equals(sentence.substring(i,i+1)))
				cnt2++;
		}
		System.out.println("cnt2:"+cnt2);
		int cnt3 = 0;
//		while(sentence.length()>0) {
//			if(sentence.indexOf("o") != -1) {
//				cnt3++;
//				sentence = sentence.substring(sentence.indexOf("o")+1);
//			}else {
//				break;
//			}
//		}System.out.println("cnt3:"+cnt3);
//		
		int cnt4 = 0;
		for (int i=0; i<sentence.length(); i++) {
			if(sentence.indexOf('o', i) != -1) {
				i = sentence.indexOf('o',i);
				cnt4++;
			}else {
				break;
			}
		}System.out.println("cnt4:"+cnt4);
		
		
		for(int i=0; i<sentence.length(); i++) {
			int o = sentence.charAt(i);
			if(o==111) {
				System.out.print("o");
				
			}
		}System.out.println();
		System.out.println(sentence.charAt(0));
		
		System.out.println(sentence.indexOf("o", 6));
		
		
		
	}//main

}


//String 은 변수가 아니다. 
//클래스 -> 객체구나.

//public class String{
//	char[] c;
//	
//	boolean equals(char c2){




