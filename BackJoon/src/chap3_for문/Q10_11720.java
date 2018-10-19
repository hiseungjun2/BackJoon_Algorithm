package chap3_for문;

import java.util.Scanner;

/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
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
