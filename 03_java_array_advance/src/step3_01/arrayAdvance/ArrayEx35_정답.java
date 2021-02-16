package step3_01.arrayAdvance;

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx35_정답 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		System.out.println("========= 배열 ==========");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println();

		// 문제 1) 전체 합 출력
		// 정답 1) 450

		System.out.println("문제 1) 전체 합 출력");
		System.out.println();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}

		}
		System.out.println("정답 : " + sum);
		System.out.println();

		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80

		System.out.println("문제 2) 4의 배수만 출력");
		System.out.println();
		System.out.print("정답 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}

		System.out.println();
		System.out.println();

		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200

		System.out.println("문제 3) 4의 배수의 합 출력");
		System.out.println();
		
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					sum += arr[i][j];
				}
			}
		}
		
		System.out.println("정답 : " + sum);
		System.out.println();
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4

		System.out.println("문제 4) 4의 배수의 개수 출력");
		System.out.println();
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt++;
				}
			}
		}
		System.out.println("정답 : " + cnt);
	}

}
