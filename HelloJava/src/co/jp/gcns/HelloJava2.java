package co.jp.gcns;

import java.io.IOException;

public class HelloJava2 {

	public static void main(String[] args) throws IOException {

//		// UOC START
//		printSystemOut();
//
//		System.out.print("入力してください：");
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//		String str = in.readLine();
		
//		System.out.print("入力した値：");
//		System.out.println("入力した値：" + str);

		for (int i=0 ; i < 10 ; i++) {
			for (int j=0 ; j < 10 ; j++) {
				if ( i > j) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
//		
//		for (int i=0 ; i < 10 ; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		System.out.println("*" + str + "*");
//		
//		for (int i=0 ; i < 10 ; i++) {
//			System.out.print("*");
//		}
		

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
