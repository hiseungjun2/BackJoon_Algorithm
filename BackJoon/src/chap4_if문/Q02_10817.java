package chap4_if��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
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
