package javaPractice;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
	
//	int a[]= {1,2,3,4,6};
//	
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//		
//	}
//	System.out.println(a.length);
		
//	double b[]=new double[2];
//	b[0]=10;
//	b[1]=20.5;
//	
//	
////	for(int i=0;i<b.length;i++) {
//	
//	for(double c:b) {
//		System.out.println(c);
//	}
	
		
//		String s[]=new String[3];
//		s[0]="imran";
//		s[1]="mohammed";
//		s[2]="imranMohammed";
//		System.out.println(s[2]);
//		
//		for(String s1:s) {
//			System.out.println(s1);
//			
//		}
		//converting int array to string array againg string to array
//		int a[]=new int[2];
//		a[0]=1;
//		a[1]=2;
//		
//		String str[]=new String[a.length];
//		
//		for(int i=0;i<a.length;i++) {
//			str[i]=Integer.toString(a[i]);
//			
//			int y[]=new int[str.length];
//				y[i]=Integer.parseInt(str[i]);
//				int d=y[i];
//				System.out.println(d);
//		}
		
//		
//		String s []= {"1","2","3","4"};
//		
//		for(int i=0;i<s.length;i++) {
////			System.out.println(s[i].getClass());
////			System.out.println(s[i]);
//			
//			int a[]=new int[s.length];
//			
//			a[i]=Integer.parseInt(s[i]);
//			int b=a[i];
//			System.out.println(b);
//			System.out.println(b==(int)b);
			
			
//			double dou[]=new double[a.length];
//			dou[i]=(double)a[i];
//			
////			System.out.println(dou[i]);
//			
//			
//			long l[]=new long[dou.length];
//			
//			l[i]=(long)dou[i];
//			long lo=l[i];
//			System.out.println(l[i]);
//			
//			
//			System.out.println(lo==(long)lo);
			
			
//			int a[]= {1,2,3,4,5};
//			
//			 double[]d=new double[a.length];
//			
//			
//		     for(int i=0;i<d.length;i++) {
//		    	 
//		    	
//		    	 d[i]=(double)a[i];
//		    	 
//		    	 System.out.println(d[i]);
//		    	 
		
//		int a=20;
//		Integer b=a;
//		System.out.println(b.getClass());
//			
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the values : ");
		int size=scan.nextInt();
		
		int a[]=new int[size];
		
		
		for(int i=0;i<size;i++) {
		a[i]=scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
			
			
			
		}
		

	}
 
	

	
	
