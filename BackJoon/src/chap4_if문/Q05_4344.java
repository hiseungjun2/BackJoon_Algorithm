package chap4_if��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
 * �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�. 
 */
public class Q05_4344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int C = Integer.parseInt(br.readLine());
		double sum = 0;
		double avg = 0;
		double count = 0;

		for (int i = 0; i < C; i++) {
			String temp[] = br.readLine().split(" ");
			int N = Integer.parseInt(temp[0]);
			for (int j = 1; j < temp.length; j++) {
				sum += Double.parseDouble(temp[j]);
			}
			avg = sum / (double) N;
			for (int k = 1; k < temp.length; k++) {
				if (avg < Double.parseDouble(temp[k])) {
					count += 1;
				}
			}

			bw.write(String.format("%.3f", Math.round((((count / N) * 100.0)) * 1000) / 1000.0) + "%\n");
			sum = 0;
			avg = 0;
			count = 0;
		}

		bw.flush();
		bw.close();
	}

}
