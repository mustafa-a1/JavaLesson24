package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	// Hashset is a class that implements set interface
	// Index not supported
	// Duplicate elements not allowed
	// Multiple nulls not allowed, just single is allowed

	public static void main(String[] args) {

		// Declaration
		HashSet myset = new HashSet();
		// Set myset = new HashSet();
		// HashSet<Integer> myset = new HashSet<Integer>();

		// Adding elements into the hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("Selenium");
		myset.add(true);
		myset.add('Y');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		// Printing myset
		System.out.println("My set is >> " + myset);

		// Size of hashset
		System.out.println("Size of hashset: " + myset.size());

		// Removing elements from hashset
		myset.remove(10.5);
		System.out.println("My set is >> " + myset);

		// Inserting an element - is not possible

		// Accessing specific element - not possible

		// Way around by converting hashset into arraylist

		ArrayList a2 = new ArrayList(myset);
		System.out.println("Arraylist: " + a2);
		System.out.println(a2.get(2));

		// Reading all the elements from hashset using for each

//		for (Object y : myset) {
//			System.out.print(y + " ");
//		}

		// Using iterator

		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");

		}
		System.out.println("Clearing all the values");

		myset.clear();
		System.out.println("My set is empty: " + myset.isEmpty());
		System.out.println("My set >> " + myset);

	}

}
