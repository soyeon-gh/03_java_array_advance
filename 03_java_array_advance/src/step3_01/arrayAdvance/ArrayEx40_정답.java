package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */

public class ArrayEx40_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] scores = null;
		int elementCnt = 0;

		while (true) {

			System.out.println("─────────────────────────────");
			System.out.println("     scores Array List");
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(scores[i] + " ");
			}
			System.out.println();
			System.out.println("─────────────────────────────");
			System.out.println("┌───────────────────┐");
			System.out.println("│   벡터 컨트롤러   │");
			System.out.println("├───────────────────┤");
			System.out.println("│  1. 추가          │");
			System.out.println("│  2. 삭제(인덱스)  │");
			System.out.println("│  3. 삭제(값)      │");
			System.out.println("│  4. 삽입          │");
			System.out.println("│  0. 종료          │");
			System.out.println("└───────────────────┘");
			System.out.println("─────────────────────────────");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

//          <-- selcet 1 -->

			if (sel == 1) {

				if (elementCnt == 0) { 						// 처음 추가할때
					scores = new int[elementCnt + 1]; 		// elementCnt는 0에서 1로 배열 한개 생성
				}

				else if (elementCnt > 0) { 					// 추가한게 한개라도있으면

					int[] temp = scores; 					// temp에 scores 배열 복사
					scores = new int[elementCnt + 1]; 		// scores에 인덱스 추가하여 새로 만듬

					for (int i = 0; i < elementCnt; i++) { 	// 새로만든 scores배열에 temp값 넣기
						scores[i] = temp[i];
					}

					temp = null; 							// temp 초기화

				}

				System.out.print("추가할 숫자 입력 : ");
				int number = scan.nextInt();

				scores[elementCnt] = number; 				// scores배열에 elementCnt번에 입력한 숫자 대입
				elementCnt++; 								// elementCnt 증가

			} // .sel == 1 end

//          <-- selcet 2 -->

			else if (sel == 2) {

				if (scores == null) { 						// 배열이 null이면 처음화면으로
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│    배열의 리스트가 비어있습니다   │");
					System.out.println("│    데이터 추가를 먼저 해주세요    │");
					System.out.println("└───────────────────────────────────┘");
					continue;
				}

				System.out.print("0번부터 삭제할 인덱스를 입력해주세요 : ");
				int delIndex = scan.nextInt();

				// 삭제할 인덱스가 음수
				// OR
				// 삭제할 인덱스가
				// 배열의 인덱스보다 클 때

				if (delIndex < 0 || delIndex > elementCnt) {
					System.out.println("┌──────────────────────────────────────────────────┐");
					System.out.println("│       입력하신 인덱스는 삭제할 수 없습니다       │");
					System.out.println("│   배열리스트의 갯수보다 작은 수를 입력해주세요   │");
					System.out.println("└──────────────────────────────────────────────────┘");
				}

				if (elementCnt == 1) { 									// 만들어진 배열이 한개라면
					scores = null; 										// 초기화
				}

				else if (elementCnt > 1) { 								// 만든 배열이 한개이상이라면

					int temp[] = scores; 								// scores 배열 복사
					scores = new int[elementCnt - 1]; 					// scores 배열의 인덱스를 기존 인덱스보다
																		// 하나 더 작게 만듬
																		// -> 삭제하면 인덱스가 줄어드니까 비어있는 데이터 감소

					for (int i = 0; i < delIndex; i++) { 				// 복사한 temp배열의 0부터 삭제할 인덱스 갯수 전까지
						scores[i] = temp[i]; 							// 새로만든 scores 배열 0번째부터 복사
					}

					for (int i = delIndex; i < elementCnt - 1; i++) { 	// 삭제할 인덱스부터 기존 인덱스번호의 전까지
						scores[i] = temp[i + 1]; 						// 새로만든 scores 배열 삭제할 인덱스 번호부터
					} 													// temp의 삭제할 인덱스 다음 번호 복사

					temp = null; 										// temp 초기화

				}

				elementCnt--; 											// 배열의 인덱스 감소

			} // .sel == 2 end


			else if (sel == 3) {

				if (scores == null) { 								// 배열이 null이면 처음화면으로
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│    배열의 리스트가 비어있습니다   │");
					System.out.println("│    데이터 추가를 먼저 해주세요    │");
					System.out.println("└───────────────────────────────────┘");
					continue;
				}

				System.out.print("삭제할 값을 입력해주세요 : ");
				int delData = scan.nextInt();

				int check = -1; 									// if문 체크용 변수
																	// (삭제할 값의 인덱스)
				for (int i = 0; i < scores.length; i++) { 			// 데이터 유무 검사
					if (scores[i] == delData) { 					// 입력한 데이터가 배열에 있으면
						check = i; 									// check에 삭제할 데이터 인덱스 대입
					}
				}

				if (check == -1) { 									// 없는 데이터를 입력하면
					System.out.println("┌──────────────────────────────────────────┐");
					System.out.println("│    입력하신 값은 삭제할 수 없습니다      │");
					System.out.println("│   배열리스트에 있는 값을 입력해주세요    │");
					System.out.println("└──────────────────────────────────────────┘");
					continue;
				}

				if (elementCnt == 1) { 								// 배열의 값이 하나면
					scores = null; 									// 초기화
				}

				else if (check != -1) { 							// 데이터가 있으면

					int temp[] = scores; 							// temp에 scores 배열 복사
					scores = new int[elementCnt - 1]; 				// scores 배열의 기존의 인덱스보다 적게 생성

					for (int i = 0; i < check; i++) { 				// 삭제할 인덱스 전까지
						scores[i] = temp[i]; 						// scores에 temp값 대입
					}

					for (int i = check; i < elementCnt - 1; i++) { 	// 삭제할 인덱스부터 기존 인덱스 - 1 전까지
						scores[i] = temp[i + 1]; 					// scores에 삭제할 인덱스 다음 인덱스부터 대입
					}

					temp = null; 									// temp 초기화

				}

				elementCnt--; 										// elementCnt 감소

			} // .sel == 3 end

			else if (sel == 4) {

				if (scores == null) { 								// 배열이 null이면 처음화면으로
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│    배열의 리스트가 비어있습니다   │");
					System.out.println("│    데이터 추가를 먼저 해주세요    │");
					System.out.println("└───────────────────────────────────┘");
					continue;
				}

				System.out.print("삽입할 값을 입력해주세요 : ");
				int addData = scan.nextInt();

				System.out.print("삽입할 인덱스를 0부터 " + elementCnt + "까지 입력해주세요 : ");
				int addIndex = scan.nextInt();

				// 삭제할 인덱스가 음수
				// OR
				// 삭제할 인덱스가 배열의 인덱스보다 클 때

				if (addIndex < 0 || addIndex > elementCnt) {
					System.out.println("┌──────────────────────────────────────────────────┐");
					System.out.println("│       입력하신 인덱스는 삭제할 수 없습니다       │");
					System.out.println("│   배열리스트의 갯수보다 작은 수를 입력해주세요   │");
					System.out.println("└──────────────────────────────────────────────────┘");
				}

				else if (elementCnt > 0) {							// 만들어진 배열이 1이상이면

					int temp[] = scores;							// temp배열 생성 scores복사
					scores = new int[elementCnt + 1];				// scores배열에 추가 1

					int j = 0;										// temp 증가값 변수

					for (int i = 0; i < elementCnt + 1; i++) {		// 0부터 기존의 배열 인덱스 + 1 까지
						if (i != addIndex) {						// i가 추가할 인덱스랑 같지않을때
							scores[i] = temp[j++];					// scores에 temp값 대입 
						}
					}

					temp = null;									// temp 초기화

				}
				scores[addIndex] = addData;							// 입력한 인덱스에 추가할 값 대입
				elementCnt++;										// 인덱스 증가

			} // .sel == 4 end

			else if (sel == 0) {
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│    프로그램이 종료됩니다    │");
				System.out.println("└─────────────────────────────┘");
				break;
			} // .sel == 0 end

			else {
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│  1,2,3,4,0 번만 눌러주세요  │");
				System.out.println("└─────────────────────────────┘");

			}

		} // .while end

	}

}