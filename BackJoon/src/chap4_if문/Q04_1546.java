package chap4_if��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
 * �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
 * �� ���� M�̶�� �Ѵ�. 
 * �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
public class Q04_1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String temp[] = br.readLine().split(" ");
		double score[] = new double[N];

		double max = 0;
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < N; i++) {
			if (max <= Double.parseDouble(temp[i])) {
				max = Double.parseDouble(temp[i]);
			}
		}

		for (int i = 0; i < N; i++) {
			score[i] = ( Double.parseDouble(temp[i]) / max ) * 100.0;
			sum += score[i];
		}
		
		avg = sum / (double)N;
		
		bw.write(String.valueOf(avg));

		bw.flush();
		bw.close();

	}

}
