package project03;

import java.util.Scanner;

public class class19 {

	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			System.out.println((int)(Math.random()*10)+1);//0~1
//			
//		}
		int[] arr=new int[7];
		for(int i = 0; i<7; i++) {
			arr[i]=0;
		}
		
		for(int i = 0,j=0; i<7; i++) {
			int num = (int)(Math.random()*45+1);
			int check = 0;
			for(int k=0; k<=j; k++) {
				if(arr[k]==num) {
					i--;
					check = 1;
					break;
				}
			}
			if(check ==1) {
				continue;				
			}
			
			arr[j]=num;
			j++;
			System.out.println(num);	
		}
		
		//랜덤 난수 1~4를 출력할 수 있도록 하여, 카드 게임을 컴퓨터VS사람으로 수정해보기(함수화를 할 수 있으면 해보기)
		Scanner sc = new Scanner(System.in);
		int score1 = 0;
		int score2 = 0;
		int[] card=new int[4];
		for(int i = 0; i<4; i++) {
			card[i]=0;
		}
		
		System.out.println("카드: {1.거지, 2.시민, 3.귀족, 4왕}");
		for(int a=0; a<4; a++){
			System.out.print("플레이어 차례 : ");
			int x = sc.nextInt();
			for(int i = 0,j=0; i<4; i++) {
				int num = (int)(Math.random()*4+1);
				int check = 0;
				for(int k=0; k<=j; k++) {
					if(card[k]==num) {
						i--;
						check = 1;
						break;
					}
				}
				if(check ==1) {
					continue;				
				}
				card[j++]=num;
				System.out.println(num);	

				if((x == 1 && num == 4) || (x == 4 && num == 1)) {
				System.out.println("거지와 왕이 만났습니다.");
				if(x == 1) {
					score1 += 4;
				}else if(num == 1) {
					score2 += 4;
				}
				break;
				}
				if(x > num) {
					score1 += 1;
				}else if(num > x) {
					score2 += 1;
				}
				 
			}
		}
		System.out.println("Player의 점수는 " + score1 + " 입니다.");
		System.out.println("Computer의 점수는 " + score2 + " 입니다.");
		if(score1 > score2) {
			System.out.println("Player 이 승리하였습니다.");
		}else if(score2 > score1) {
			System.out.println("Computer 가 승리하였습니다.");
		}else {
			System.out.println("무승부입니다.");
		}
		

	}//main

}
