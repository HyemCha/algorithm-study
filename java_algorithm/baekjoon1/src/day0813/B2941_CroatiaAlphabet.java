package day0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941_CroatiaAlphabet {

	public static void main(String[] args) throws IOException {
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = croatia.length;
		String s = str;
		for(String c : croatia) {
			s = s.replace(c, "0");
		}
		System.out.println(s.length());
		
	}

}
