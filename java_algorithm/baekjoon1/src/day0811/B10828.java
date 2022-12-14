package day0811;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B10828 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		Stack stack = new Stack();
		
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		for(int i =0; i<n; i++) {
			StringTokenizer st = null;
			String cmd = null;
			int num = 0;
			try {
				st = new StringTokenizer(br.readLine());
				cmd = st.nextToken();
				if(st.hasMoreTokens())
					num =Integer.parseInt(st.nextToken());
				
				switch (cmd) {
				case "push":
					stack.push(num);break;
				case "pop":
					stack.pop();break;
				case "size":
					stack.size();break;
				case "empty":
					stack.empty();break;
				case "top":
					stack.top();break;
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Stack{
	List<Integer> list = new ArrayList<Integer>();
	
	public void push(int num) {
		list.add(num);
	}
	public void pop() {
		if(list.size()!=0) {
			System.out.println(list.get(list.size()-1));
			list.remove((list.size()-1));
			return;
		}
		System.out.println(-1);
		
	}
	public void size() {
		System.out.println(list.size());
	}
	public void empty() {
		if(list.size()==0) {
			System.out.println(1);
			return;
		}
		System.out.println(0);
	}
	public void top() {
		if(list.size()!=0) {
			System.out.println(list.get(list.size()-1));
			return;
		}
		System.out.println(-1);
		
	}
}
