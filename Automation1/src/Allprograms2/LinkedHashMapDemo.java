package Allprograms2;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
		map.put("City", "Bangalore");
		map.put("Name", "Bhanu");
		map.put("EmpID", "A1");
		map.put("Name", "Prakash");
		map.put("Name","Bina");
		map.put("Age","23");
		map.put("Country","India");
		map.put("Locality","North");
		map.put(null,null);
	
		

//		System.out.println(map.get("Name"));
//		System.out.println(map.get("EmpID"));
//		System.out.println(map.get("City"));
		
		System.out.println(map.get(null));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map);
		
//		System.out.println(map.keySet());
//		
//		System.out.println(map.containsKey("Name"));
		System.out.println(map.containsKey("Area"));
		
	//Note: In Hashmap values are stored in "Key" instead of index
		//Key is case sensitive and can't be duplicate
		//LinkedHashMap will preserve insertion order
		//We can't use primitives (int,byte but instead we can use  Integer,Double,Long etc)under 'Value'under LinkedHashMap
		
		
		
	}

}
