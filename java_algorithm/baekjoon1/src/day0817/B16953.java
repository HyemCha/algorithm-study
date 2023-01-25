package day0817;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.StringTokenizer;

public class B16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int cnt = 1;
		while(a!=b) {
			//
			if(b<a) {
				cnt = -1;
				break;
			}
			if(b%2 == 0) {
				b /= 2;
			}
			//1�� 10���� ���� �������� 1, 1�� 10���� ���� ���� 0 => ù��° if�� ������ ���ѷ���
			else if(b%10 == 1) {
				b /=10;
			} else {
				cnt = -1;
				break;
			} 
			cnt++;
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		
	}

}