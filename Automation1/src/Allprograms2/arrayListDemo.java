package Allprograms2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		
//		al.add("Anand");
//		al.add("Baalu");
//		al.add("Chandru");
//		al.add("Dheeraj");
//		al.add("Ram");
//		al.add("Xavier");
//		al.add("Yamuna");
//		al.add("Zuber");
		
		al.add("Ram");
		al.add("Anand");
		al.add("Zuber");
		al.add("Baalu");
		al.add("Chandru");
		al.add("Dheeraj");
		al.add("Xavier");
		al.add("Yamuna");
		al.add("Yamuna");
		al.add("Yamuna");
		
		
		System.out.println(al);

		ArrayList<String> al2=new ArrayList<String>(al);
		Collections.sort(al2);
		System.out.println(al2);

if(al.equals(al2)){
	System.out.println("Same to same");
	
}
else{
	System.out.println("They are Different");
}
	}

}
