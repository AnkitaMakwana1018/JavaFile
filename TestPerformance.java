import java.io.*;
import java.util.*;

class TestPerformance{
	
	public static void main(String args[])throws Exception{
		
		List array = new ArrayList();
		List list = new LinkedList();
		long startA,endA,startL,endL;
		
		
		startA = getTime();
			addElements(array);
			print(array);
		endA = getTime();
		
		startL = getTime();
			addElements(list);
			print(list);
		endL = getTime();
		
		System.out.print("Require Time in Array ");
			displayTime(startA,endA);
		System.out.print("Require Time in LinkedList ");
			displayTime(startL,endL);

	}
	
	public static void addElements(List list){
		for(int i = 0 ; i < 50000 ; i++){
			list.add(i+1);
		}
	}
	public static void print(List list){
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
	public static long getTime(){
		long time = new java.util.Date().getTime();
		return time;
	}
	public static void displayTime(long start , long end){
		System.out.println((end - start)/1000 + " Seconds");
	}
	
}
