package chap3_for문;

import java.util.Scanner;

/*
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class Q2_2742 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = N; i >=1 ; i--) {
			System.out.println(i);
		}
		
		scanner.close();
	}

}
