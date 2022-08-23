package day0808;

import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (!(num>=0 && num<=99)){
			s.close();
			return;
		}
		int[] a = new int[2];
		int original = num, f=0;
		int newNum;
		while(true){
			if(f == 0) {
				a[0] = num / 10;
				a[1] = num % 10;
			}
			newNum = a[0] + a[1];
			a[0] = a[1];
			a[1] = newNum % 10;
			num = a[0]*10 + a[1];
			
			f += 1;
			
			if(num == original){
				System.out.println(f);
				break;
			}
		}
		s.close();
	}

}
