package chap4_if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 
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
