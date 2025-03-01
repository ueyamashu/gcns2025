package co.jp.gcns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Logic20250301_01 {

	public static void main(String[] args) throws Exception{
		
		int i;
		int XXX = 3;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		
		XXX = Integer.parseInt(str);
	
		for (i = 1; i <= XXX ;i++) {
			System.out.println(i);
		}
		
	}

}
