package javaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date()); // time stamp
		System.out.println(timeStamp);


	}

}
