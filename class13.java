package project03;

import java.util.Scanner;

public class class13 {

	public static void main(String[] args) {
		// 왕과거지게임
		//{"거지", "시민", "귀족", "왕"}
		//계급 순으로 승패가 갈림
		//거지와 왕이 만나면거지를 낸 플레이어가 게임에서 승리한다.
		Scanner sc = new Scanner(System.in);
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;
		
		for(int i=0; i<4; i++) {
			System.out.println("카드: {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.print("플레이어1 차례 : ");
			int player1 = sc.nextInt();
			System.out.print("플레이어2 차례 : ");
			int player2 = sc.nextInt();
			
			if((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
				System.out.println("거지와 왕이 만났습니다.");
				if(player1 == 1) {
					score1 += 4;
				}else if(player2 == 1) {
					score2 += 4;
				}
				break;
			}
			if(player1 > player2) {
				score1 += 1;
			}else if(player2 > player1) {
				score2 += 1;
			}
		}
		System.out.println("Player1의 점수는 " + score1 + " 입니다.");
		System.out.println("Player2의 점수는 " + score2 + " 입니다.");
		if(score1 > score2) {
			System.out.println("Player1 이 승리하였습니다.");
		}else if(score2 > score1) {
			System.out.println("Player2 가 승리하였습니다.");
		}else {
			System.out.println("무승부입니다.");
		}
		

	}

}
