package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		System.out.println("문제 1) 인덱스 2개를 입력받아 값 출력");
		System.out.println();
		
		System.out.print("인덱스1 입력 : ");
		int index1 = sc.nextInt();
		
		System.out.print("인덱스2 입력 : ");
		int index2 = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (index1 == arr[i][j]) {
					
				}
			}
		}
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.println();
		System.out.println("문제 2) 값을 입력받아 인덱스 2개 출력");
		System.out.println();
		
		System.out.print("값 입력 : ");
		int value = sc.nextInt();
		
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		// 문제 4) 값 2개를 입력받아 값 교체

		sc.close();


	}

}
