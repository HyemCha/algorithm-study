package day0805;

import java.io.StringReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1152 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
	}
}
