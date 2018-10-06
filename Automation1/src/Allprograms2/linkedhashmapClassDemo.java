package Allprograms2;

import java.util.LinkedHashMap;

public class linkedhashmapClassDemo {

	public static void main(String[] args) {

		LinkedHashMap<String,Integer> cr=new LinkedHashMap<String,Integer>();
		cr.put("PC", 2);
		cr.put("Projector", 2);
		cr.put("Chair", 130);
		cr.put("Marker", 3);

		System.out.println(cr.keySet());
		System.out.println(cr.values());
		Integer val=cr.get("Marker");

		System.out.println(val);
		
		System.out.println(cr);
		
				
	}

}
