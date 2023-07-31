package project03;

public class class12 {

	public static void main(String[] args) {
		// 2차원 배열 숫자모양 
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
		 	for(int j=0;j<5;j++) {
		 		arr[i][j]= i*5+j+1;
		 	}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=0; i<5; i++) {
		 	for(int j=0;j<5;j++) {
		 		arr[j][i]= 5*i+j+1;
		 	}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=0; i<5; i++) {
		 	for(int j=0;j<5;j++) {
		 		if(i%2==0) {
		 			arr[i][j]= 5*i+j+1;
		 		}
		 		else {
		 			arr[i][j]=5*(i+1)-j;
		 		}
		 	}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=0; i<5; i++) {
		 	for(int j=0;j<5;j++) {
		 		if(i%2==0) {
		 			arr[j][i]= 5*i+j+1;
		 		}
		 		else {
		 			arr[j][i]=5*(i+1)-j;
		 		}
		 	}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}//main

}
