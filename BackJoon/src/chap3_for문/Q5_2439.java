package chap3_for문;

import java.util.Scanner;

/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 */

public class Q5_2439 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++)  {
				if (j <= N-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
