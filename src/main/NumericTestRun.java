package main;

public class NumericTestRun implements MyGreetings {
	public static void main(String []args) {
		MyGreetings mygt = (str)-> "hello"+str;
		String mg = mygt.GetName(" Rakib");
		System.out.println(mg);
		
	}
	@Override
	public String GetName(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
