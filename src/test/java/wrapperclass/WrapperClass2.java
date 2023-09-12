package wrapperclass;

public class WrapperClass2 {
	public static void main(String[] args) {
		
		String s1="1 & 2";
		
		String [] s2=s1.split("&");
		
		
//		int i1=	Integer.parseInt(s2[0].trim());
//		int i2=Integer.parseInt(s2[1].trim());
//		System.out.println(i1);
//		System.out.println(i2);
		
		for(String s3:s2) {
			
		int i3=	Integer.parseInt(s3.trim());
			System.out.println(i3);
		

		}
	}

}