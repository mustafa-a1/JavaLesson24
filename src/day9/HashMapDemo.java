package day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// Hashmap data can be stored in key-value pairs. Key must be unique. No
		// indexing

		// Declaration
		// HashMap hm = new HashMap();
		// Map hm = new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs
		hm.put(101, "Smith");
		hm.put(102, "Scott");
		hm.put(103, "Jain");
		hm.put(104, "Jain");
		hm.put(102, "David");

		// Printing hashmap
		System.out.println("Hashmap >> " + hm);

		// Finding out size
		System.out.println("Pair size: " + hm.size());

		// Remove a pair
		hm.remove(104);
		System.out.println("Hashmap >> " + hm);

		// Accessing value of a key
		System.out.println(hm.get(101)); // Smith

		// Get all the keys of a hashmap
		System.out.println(hm.keySet()); // 101, 102, 103

		// Get all the values
		System.out.println(hm.values()); // Smith, David, Jain

		System.out.println("All the entries: " + hm.entrySet());

		// Reading all the elements of a hashmap
		for (int k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
		}

	}

}
