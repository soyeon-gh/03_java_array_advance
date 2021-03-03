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



public class ArrayEx40_정답2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] scores = null;
		int elementCnt = 0;

		while(true) {
			
			System.out.println("===============================");
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores + " ");
			}
			System.out.println();
			System.out.println("===============================");
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if		(sel == 1) {
				
				if(elementCnt == 0) {
					scores = new int[elementCnt + 1];
				}
				
				else if(elementCnt > 0) {
					
					int temp[] = scores;
					scores = new int[elementCnt + 1];
					
					for (int i = 0; i < scores.length; i++) {
						scores[i] = temp[i];
					}
					temp = null;
				}
				
				System.out.print("추가할 숫자를 입력해주세요 : ");
				int addNumber = scan.nextInt();
				
				scores[elementCnt] = addNumber;
				elementCnt++;
				
			}
			
			else if (sel == 2) {
				
				if (scores == null) { 						// 배열이 null이면 처음화면으로
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│    배열의 리스트가 비어있습니다   │");
					System.out.println("│    데이터 추가를 먼저 해주세요    │");
					System.out.println("└───────────────────────────────────┘");
					continue;
				}
				
				System.out.print("삭제할 인덱스를 입력해주세요 : ");
				int delIndex = scan.nextInt();
				
				if(delIndex < 0 || delIndex > elementCnt) {
					System.out.println("인덱스번호가 만들어진 배열의 크기보다 큽니다");
					System.out.println("만들어진 배열의 크기 이하로 입력해주세요");
				}
				
				if(elementCnt == 1) {
					scores = null;
				}
				
				else if (elementCnt > 1) {
					
					int temp[] = scores;
					scores = new int[elementCnt - 1];
					
					for (int i = 0; i < delIndex; i++) {
						scores[i] = temp[i];
					}
					for (int i = delIndex; i < elementCnt - 1; i++) {
						scores[i] = temp[i + 1];
					}
					
					temp = null;
				}
				elementCnt--;
			}
			
			else if (sel == 3) {
				
				if (scores == null) { 						// 배열이 null이면 처음화면으로
					System.out.println("┌───────────────────────────────────┐");
					System.out.println("│    배열의 리스트가 비어있습니다   │");
					System.out.println("│    데이터 추가를 먼저 해주세요    │");
					System.out.println("└───────────────────────────────────┘");
					continue;
				}
				
				System.out.print("삭제할 값을 입력해주세요 : ");
				int delData = scan.nextInt();
				
				int check = -1;
				
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] == delData) {
						check = i;
					}
				}
				
				if(check == -1) {
					System.out.println("없는 값입니다.");
				}
				
				else if(check > -1) {
					
					if(elementCnt == 1) {
						scores = null;
					}
					
					else if (elementCnt > 1) {
						
						int temp[] = scores;
						scores = new int[elementCnt - 1];
						
						for (int i = 0; i < check; i++) {
							scores[i] = temp[i];
						}
						for (int i = check; i < elementCnt - 1; i++) {
							scores[i] = temp[i + 1];
						}
						
						temp = null;
					}
					elementCnt--;
				}
				
				
				
				
				
			}
			else if (sel == 4) {
				
				
				
			}
			else if (sel == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}

		scan.close();


	}

}