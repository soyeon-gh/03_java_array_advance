package step3_01.arrayAdvance;
/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class ArrayEx31_정답 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│               정렬하기               │");
		System.out.println("├──────────────────────────────────────┤");
		System.out.println("│                                      │");
		System.out.println("│  1. 인덱스 0번이 나머지를 검사한다.  │");
		System.out.println("│                                      │");
		System.out.println("│  2. 제일 큰 값을 찾아 교환한다.      │");
		System.out.println("│                                      │");
		System.out.println("│  3. 인덱스 1증가한다.                │");
		System.out.println("│                                      │");
		System.out.println("│  4. [1~3]을 끝까지 반복한다.         │");
		System.out.println("└──────────────────────────────────────┘");
		System.out.println();
		System.out.println("scores Array ──────────────────────────");
		System.out.println();
		System.out.print("{ ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]);
			if (i < scores.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    int tmep = scores[i];
                    scores[i]   = scores[j];
                    scores[j]   = tmep;
                    
                    System.out.print("{ ");
            		for (int k = 0; k < scores.length; k++) {
            			System.out.print(scores[k]);
            			if (k < scores.length - 1) {
            				System.out.print(", ");
            			}
            		}
            		System.out.println(" }");
            		System.out.println("──────────────────────────────");
                }
            }
        }

		
	}

}
