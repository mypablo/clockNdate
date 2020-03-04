package clock;

import java.util.*;
import java.util.Scanner;

public class qClock {
	// variables
	static Calendar now = Calendar.getInstance();
	
	static int hour = now.get(Calendar.HOUR_OF_DAY);
	static int minute = now.get(Calendar.MINUTE);
	static int month = now.get(Calendar.MONTH);
	static int day = now.get(Calendar.DAY_OF_WEEK);
	static int year = now.get(Calendar.YEAR);
	
	public static void main(String[] args) {
		
		
		
		
		
		for (int i = 0; i<=100; i++) {
			
			pick();
			input();
		}
		
		
		
	}
	
	public static void pick() {
			//print 
			System.out.println("Please press a number :\n "
					+ "(1)For Hour and minutes\n (2)For month,day and year\n (3)For everything");
			
			
			
		}
		
		public static void input() {
			
			
			
			
			Scanner input = new Scanner(System.in);
			
			int in = input.nextInt();
			
			
			if (in==1) {
				
				System.out.println(hour+":"+minute);
			}
			if (in==2) {
				
				System.out.println(month + "/" + day + "/" + year);
			}else if (in==3) {
				
				System.out.println(hour + ":" + minute + "\n" + month + "/" + day + "/" + year);
			}
			
			
		}
}
