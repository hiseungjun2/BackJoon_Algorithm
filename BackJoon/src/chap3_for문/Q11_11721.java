package chap3_for��;

import java.util.Scanner;

/*
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
