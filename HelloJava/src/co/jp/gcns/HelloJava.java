package co.jp.gcns;

/**
 * 
 */
public class HelloJava {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setSyokui(Person.SYOKUI_EM);
		
		person.getName("上山");
		
		// hellojava出力
		System.out.println(person.printInfo());
	}
}
