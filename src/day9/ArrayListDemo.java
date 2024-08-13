package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration

		ArrayList mylist = new ArrayList<>();
//		List mylist	= new ArrayList<>();
//		ArrayList<String> mylist = new ArrayList<String>();

		// Adding data into an arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(false);
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		mylist.add(100);

		// Size of arraylist
		System.out.println("The size of mylist is: " + mylist.size());

		// Printing arraylist
		System.out.println("My list >> " + mylist);

		// Removing elements from the list
		mylist.remove(8);
		System.out.println("My list >> " + mylist);

		// Insert/add a new element in the arraylist
		mylist.add(700);
		System.out.println("My list >> " + mylist);

		mylist.add(2, "Selenium"); // 10th one in the list
		System.out.println("My list >> " + mylist);

		// Modify a value
		mylist.set(3, "Java");
		System.out.println("My list >> " + mylist);

		// Accessing a specific element from the list
		System.out.println(mylist.get(1));

		// Retrieving all the elements from the arraylist
		// Using traditional for loop

//		for (int i = 0; i < mylist.size(); i++) {
//			System.out.print(mylist.get(i) + " ");
//		}

//		// Using for each loop
//		for (Object x : mylist) {
//			System.out.print(x + " ");
//		}

		// Using iterator

//		Iterator<Object> it = mylist.iterator();
//
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//
//		}

		// Checking if the list is empty or not
		System.out.println("My list is empty: " + mylist.isEmpty());

		// Removing multiple elements from the list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add(10.5);
		mylist2.add("Selenium");
		mylist.removeAll(mylist2);
		System.out.println("My list >> " + mylist);

		// Clear entire arraylist
		mylist.clear();
		System.out.println("My list is empty: " + mylist.isEmpty()); // true
		System.out.println("My list >> " + mylist);

	}

}
