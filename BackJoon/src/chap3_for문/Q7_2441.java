package chap3_for��;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
 * ������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
 */
public class Q7_2441 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i =N; i >= 1; i--) {
			for (int j = 1; j <= N; j++) {
				if (j <= N-i ) {
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

