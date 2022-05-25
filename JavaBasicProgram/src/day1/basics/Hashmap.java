package day1.basics;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();// Creating HashMap
		map1.put(1, "Mango"); // Put elements in Map
		map1.put(2, "Apple");
		map1.put(3, "Banana");
		map1.put(1, "Grapes"); // trying duplicate key
		System.out.println("Map elements: "+map1);
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		HashMap<Integer,String>Map2 = new HashMap<Integer,String>();
		Map2.put(5, "Shivaji");
		Map2.put(6,"Ingole");
		Map2.put(7, "Yogesh");
		map1.putAll(Map2);
		System.out.println (Map2);
		System.out.println (map1);
		
		map1.remove(3);
		map1.replace(1, "replace");
		Map2.putIfAbsent(8,"myname");
		System.out.println (map1);
//hello
		
		
		
	}

}
