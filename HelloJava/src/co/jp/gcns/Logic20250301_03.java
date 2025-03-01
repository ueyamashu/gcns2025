package co.jp.gcns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Logic20250301_03 {

	public static void main(String[] args) throws Exception{
		
		int i, j;
		int XXX = 5;
		int sum = 0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		
		XXX = Integer.parseInt(str);
	
		for (i = 1; i <= XXX ;i++) {
			for (j = 1; j <= XXX ;j++) {
				if ( i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
