package chap4_if��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Q03_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int X = Integer.parseInt(temp[1]);
		
		String[] array = br.readLine().split(" ");
		
		for (int i = 0; i< N; i++) {
			if (Integer.parseInt(array[i]) < X) {
				bw.write(String.valueOf(array[i])+" ");
			}
		}
		
		bw.flush();
		bw.close();

	}

}
