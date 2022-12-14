package day0813;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B21318_piano {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[] level = new int[n];
		int[] result;
		
		for(int i=0; i<n; i++) {
			level[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		int q = Integer.parseInt(br.readLine());
		for(int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
//			for(int k=(x-1); k<(y-1); k++) {
//				if(level[k]>level[k+1])
//					cnt++;
//			}
//			System.out.println(cnt);
			bw.write(cnt + "\n");
			bw.close();
		}
		
	}

}
