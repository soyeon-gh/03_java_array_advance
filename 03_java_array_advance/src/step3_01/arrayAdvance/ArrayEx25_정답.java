package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */

public class ArrayEx25_정답 {

	public static void main(String[] args) {

		Scanner sc         = new Scanner(System.in);

		int[]   arr        = { 11, 87, 42, 100, 24 };
		int     zeroCnt    = 0;
		boolean isRunning  = true;

		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│              최대값 구하기              │");
		System.out.println("├─────────────────────────────────────────┤");
		System.out.println("│                                         │");
		System.out.println("│ 1. 가장 큰 값을 찾아 입력한다.          │");
		System.out.println("│                                         │");
		System.out.println("│ 2. 정답이면 해당 값을 0으로 변경한다.   │");
		System.out.println("│                                         │");
		System.out.println("│ 3. arr배열의 모든 값이 0으로 변경되면   │");
		System.out.println("│    프로그램은 종료된다.                 │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");

		while (isRunning) {

			System.out.println("──────────────────────────────────────────");

// 			<-- array print -->

			System.out.print("{ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			
			int maxNum = 0;
			int maxIdx = 0;
			
			for (int i=0; i<5; i++) {
				if (maxNum < arr[i]) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			
// 			<-- maximum array -->
//
//			for (int i = 0; i < arrCopy.length; i++) {
//	            for (int j = i + 1; j < arrCopy.length; j++) {
//	                if (arrCopy[i] < arrCopy[j]) {
//	                    int tmep = arrCopy[i];
//	                    arrCopy[i]   = arrCopy[j];
//	                    arrCopy[j]   = tmep;
//	                }
//	            }
//	        }
//			
// 			<-- array print -->			
//			
//			System.out.print("{ ");
//			for (int i = 0; i < arrCopy.length; i++) {
//				System.out.print(arrCopy[i]);
//				if (i < arr.length - 1) {
//					System.out.print(", ");
//				}
//			}
//			System.out.println(" }");

// 			<-- system.in -->
			
			System.out.print("입력 : ");
			int getNumber = sc.nextInt();
			
			if (maxNum == getNumber) {
				arr[maxIdx] = 0;
				zeroCnt++;
			}
			

			if (zeroCnt == 5) {
				System.out.println("┌────────────────────┐");
				System.out.println("│      게임종료      │");
				System.out.println("└────────────────────┘");
				System.out.println();
				isRunning = false;
			}
		}

		sc.close();

	}
}
