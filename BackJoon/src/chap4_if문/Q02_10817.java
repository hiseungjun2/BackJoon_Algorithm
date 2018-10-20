package chap4_if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 */
public class Q02_10817 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");

		int A = Integer.parseInt(temp[0]);
		int B = Integer.parseInt(temp[1]);
		int C = Integer.parseInt(temp[2]);
		
		if (A > B) {
			if (A>C) {
				if (B >C) {
					bw.write(String.valueOf(B));
				} else {
					bw.write(String.valueOf(C));
				}
			} else {
				bw.write(String.valueOf(A));
			}
		} else {	// A < B
			if (A < C) {
				if (B < C) {
					bw.write(String.valueOf(B));
				} else {
					bw.write(String.valueOf(C));
				}
			} else {
				bw.write(String.valueOf(A));
			}
		}

		bw.flush();
		bw.close();

	}

}
