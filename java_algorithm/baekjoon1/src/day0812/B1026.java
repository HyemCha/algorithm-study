package day0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1026 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		StringTokenizer st=null;
		int[] a=new int[n];
		int[] b=new int[n];
		int sum=0;
		try {
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<n-1; i++) {
				for(int k=i+1; k<n; k++) {
					int tmp = a[i];
					if(a[i]<a[k]) {
						a[i] = a[k];
						a[k] = tmp;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int c[] = b;
		Arrays.sort(c);
		for(int i=0; i<n;i++) {
			sum += a[i] * b[i];
		}
		System.out.println(sum);

	}

}
