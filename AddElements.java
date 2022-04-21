
package linkedList;

import java.util.LinkedList;

public class AddElements {

	public static void main(String[] args) {
		LinkedList<String> link= new LinkedList<String>();
		AddElements(link);
		RemoveElements(link);
		System.out.println(ChangeElements(link));
		TraverseElements(link);
	}
	// method to add elements in linkedlist
	public static void AddElements(LinkedList<String> link)
	{
		link.add("Navneet");
		link.add("Anchal");
		link.add("Rahul");
		link.add("krishna");
		link.add("joseph");
		link.add("Salvatore");
		link.add("nina");
		link.add("katharine");
		System.out.println(link); 
	}
	// method to remove elements from linked list
	public static void RemoveElements(LinkedList<String> link)
	{
		  link.remove(0);
		  link.removeFirst();
		  link.removeLast();
		  link.remove("nina");
		  System.out.println(link);
	}
	
	// method to change elements in linked list
	public static LinkedList<String> ChangeElements(LinkedList<String> link)
	{
		link.add("Neeraj");
		link.add("Lucifer Morningstar");
		link.set(1, "Navneet");
System.out.println();
		return link;
	}
	
	// method for traversing elements in linked list
	public  static void TraverseElements(LinkedList<String> link)
	{
		for(int i=0;i<=link.size()-1;i++)
		{
			  System.out.print(link.get(i)+", ");
		}
	}

}
