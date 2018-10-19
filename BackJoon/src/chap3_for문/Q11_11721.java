package chap3_for문;

import java.util.Scanner;

/*
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */
public class Q11_11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String temp = scan.nextLine();
		String[] array = temp.split("");

		for (int i = 0; i < array.length; i++) {
			if (i ==0 ) {
				System.out.print(array[i]);
			} else {
				if (i % 10 == 0) {
					System.out.println();
				} 
				System.out.print(array[i]);
			}
		}

		scan.close();
	}

}
