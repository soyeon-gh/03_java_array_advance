package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_정답 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		int index = 0;
		
		// front : 1~9, back : 10 ~ 18 값 넣기 
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + (i + 1);
		}
		
		// 셔플
		for (int i = 0; i < 1000; i++) {
			
			index = random.nextInt(SIZE);	
			int temp = front[0];
			front[0] = front[index];
			front[index] = temp;
			
			index = random.nextInt(SIZE);	
			temp = back[0];
			back[0] = back[index];
			back[index] = temp;
			
		}
		
		// 배열 확인 print
		for (int i = 0; i < SIZE; i++) {
			System.out.print(front[i] + " ");
			System.out.print(back[i] + " ");
			if (i == 4) {
				System.out.println();
			}
			
		}
		
		
		
		
		sc.close();
	}
	
}
