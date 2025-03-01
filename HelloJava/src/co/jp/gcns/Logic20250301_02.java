package co.jp.gcns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Logic20250301_02 {

	public static void main(String[] args) throws Exception{
		
		int i;
		int XXX = 5;
		int sum = 0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		
		XXX = Integer.parseInt(str);
	
		for (i = 1; i <= XXX ;i++) {
			System.out.print((i*2)-1);
			if (i == XXX) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
			sum = sum + ((i*2)-1);
		}
		System.out.println(sum);
		
	}

}
