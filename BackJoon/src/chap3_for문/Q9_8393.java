package chap3_for��;

import java.util.Scanner;

/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Q9_8393 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);

		scan.close();

	}

}
