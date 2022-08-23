package day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3029 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String now = br.readLine();
        String theTime = br.readLine();
        int[] gap = new int[3];
        gap[0] = Integer.parseInt(theTime.split(":")[0]) - Integer.parseInt(now.split(":")[0]);
        gap[1] = Integer.parseInt(theTime.split(":")[1]) - Integer.parseInt(now.split(":")[1]);
        gap[2] = Integer.parseInt(theTime.split(":")[2]) - Integer.parseInt(now.split(":")[2]);
        
        if(now.equals(theTime)) {
        	System.out.println("24:00:00");
        	return;
        }
        
        if(gap[2]<0) {
        	gap[2] += 60;
        	gap[1]--;
        }
        if(gap[1]<0) {
        	gap[1] += 60;
        	gap[0]--;
        }
        if(gap[0]<0) {
        	gap[0] += 24;
        }
        System.out.printf("%02d:%02d:%02d",gap[0],gap[1],gap[2]);
    }

}
