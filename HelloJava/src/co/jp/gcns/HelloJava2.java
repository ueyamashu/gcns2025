package co.jp.gcns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloJava2 {

	public static void main(String[] args) throws IOException {

		// UOC START
		printSystemOut();

		System.out.print("入力してください：");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();

		StringBuffer sb = new StringBuffer();

		Calendar cal = new GregorianCalendar();
		
		

		//		System.out.print("入力した値：");
		System.out.println("入力した値：" + str);

		// UOC END
	}

	/**
	 * 標準出力用のメソッド<br>
	 * aaaaaaa
	 * @param String str
	 * @return void
	 */
	private static void printSystemOut() {
		System.out.println("Hello JAVA!!");
	}

}
