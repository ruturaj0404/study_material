package case_study;

import java.io.IOException;

public interface Library {
	public  static  final String lib_name="Oracle";
	public  static  final String lib_address ="430,Pune";
	public  static  final int lib_number =0237200123;
	
	void AddRecord() throws IOException;
	void DisplayRecord();
	default void PrintMessage() {
		System.out.println("'Welcome to World Of Knowlage'");
	}
	static void PrintDetails() {
		System.out.println(lib_name+" \n"+lib_address+" \n"+lib_number);
	};
	
	 

}
