package chap3_for��;

import java.util.Scanner;

/*
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Q10_11720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int N = Integer.parseInt(scan.nextLine());
		String temp = scan.nextLine();
		String[] array = new String[N];
		array = temp.split("");

		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}

		System.out.println(sum);

		scan.close();

	}

}
