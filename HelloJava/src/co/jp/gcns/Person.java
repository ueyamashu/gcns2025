package co.jp.gcns;

public class Person {
	public static String SYOKUI_EM = "本部長";
	public static String SYOKUI_GM = "部長";
	public static String SYOKUI_MG = "マネージャ";
	public static String SYOKUI_LD = "リーダ";
	public static String SYOKUI_MB = "社員"; 
	
	private String name;
	private String syokui;

	public void setSyokui(String str) {
		syokui = str;
	}
	
	public String printInfo() {
		return syokui + ":" + name;
	}
	
	public String getName(String str) {
		name = str;
		return name;
	}
	
}
