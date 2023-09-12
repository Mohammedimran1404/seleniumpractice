package javaPractice;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("imran");
		al.add(23);
		al.add("test engineer");
		al.add("kairos");
		al.add("Automation engineer"); 
		
		int sizeofarray=al.size();
		
		for(int i=0;i<sizeofarray;i++) {
			System.out.println(al.get(i));
		}

	}

}
