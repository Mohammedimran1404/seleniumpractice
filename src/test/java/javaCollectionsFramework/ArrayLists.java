package javaCollectionsFramework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayLists {

	public static void main(String[] args) throws IOException {
		//ArrayList al = new ArrayList();  // this will take heterogenous data means any data
		
		//ArrayList<String>al=new ArrayList<String>(); // this will take string type of data only
		//ArrayList<Integer>in=new ArrayList<Integer>(); //this will take integer type of data
          
//		ArrayList al = new ArrayList();
//		al.add("kairos");
//		al.add(12);
//		al.add(12.3);
//		
//		
//		
//   for(Object a:al) {
//	   System.out.println(a);
//   }
//  
//		LinkedList li = new LinkedList();
//		li.add("and");
//		li.add("the");
//		li.add(100);
//		li.add(101.1);
//		li.add(null);
//		
//		System.out.println(li);
//		System.out.println(li.size());
//		
//		 LinkedList l = new LinkedList<>(li);
//		 System.out.println(l);
//		l.removeAll(li);
//		System.out.println(l);
//		l.addAll(li);
//		System.out.println();
//		System.out.println(l.contains("and"));
//		System.out.println(l.contains("java"));
//		
//		HashSet set = new HashSet();
//		set.add("kairos");
//		set.add("company");
//		set.add("is");
//		System.out.println(set);
//		set.remove("is");
//		System.out.println(set);
//		HashSet se=new HashSet(set);
//		System.out.println(se);
//		se.removeAll(set);
//		System.out.println(se);
//	System.out.println(	se.contains("compan"));
//		
//	
//	for(Object o:se) {
//		System.out.println(o);
		
//	}
//		List<String> list = new ArrayList<String>();
//		list.add("Apple");
//		list.add("ball");
//		System.out.println(list.toString());
//	Collections.reverse(list);
//	System.out.println(list);
	
//	
//	 List<String> l = new ArrayList<String>();  
//     l.add("Mango");  
//     l.add("Banana");  
//     l.add("Mango");  
//     l.add("Apple");  
//     System.out.println("Before Reversing");  
//     System.out.println(l.toString());  
//       
//     Collections.reverse(l);  
//     System.out.println("After Reversing");  
//     System.out.println(l);  
//		HashMap hm = new HashMap();
//		hm.put(101, "uday");
//		hm.put(102, "praneeth");
//		hm.put(103, "imran");
//		hm.put(104, "imran");
//		hm.put(null, "klabs");
//		hm.put(105, null);
//		System.out.println(hm);
		
//		System.out.println(hm.get(101));
//		hm.remove(104);
//		System.out.println(hm);
		
		
//		HashMap hm1= new HashMap(hm);
//		System.out.println(hm1);
//		hm1.put(108, "kairos");
//		System.out.println(hm1);
//		System.out.println(hm1.entrySet());
//		System.out.println(hm1.keySet());
		
//		Hashtable ht = new Hashtable();
//		ht.put(101, "a");
//		ht.put(102, "iu");
//		ht.put(103, "kairos");
//		ht.put(104, "a");
//		ht.put(105, "iu");
//		ht.put(106, "kairos");
//		ht.put(107, "a");
//		ht.put(108, "iu");
//		ht.put(109, "kairos");
//		ht.put(110, "a");
//		ht.put(111, "iu");
//		ht.put(112, "kairos");
//		System.out.println(ht);
		
		
		
		
	}
}
