package wrapperclass;

public class ConvertingStringDataToInt {
	public static void main(String[] args) {
		
		//wrapper class is used to convert one form data into another form
		
		String s1=" 234";
		String s2="345";
		
		int i1=Integer.parseInt(s1.trim());
		int i2=Integer.parseInt(s2);
		
		System.out.println(i1+i2);
	}

}
