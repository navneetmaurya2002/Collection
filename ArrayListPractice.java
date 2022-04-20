package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
ArrayListPractice ALP=new ArrayListPractice();
ALP.operation();
	}
	// method to call selected option 
	public void operation() {
		System.out.println("Select option to perform:");
	System.out.println("1. Iterating List");
	System.out.println("2. Sorting List");
	System.out.println("3. IndexOf");
	int opt=sc.nextInt();
	if(opt==1)
	{
		iteratingList();
	}
	else if(opt==2)
	{
		SortingList();
	}
	else if(opt==3)
	{
		IndexOf();
	}
	else {
		System.out.println("Wrong Input, Re-Run the code !!!");
	}
	sc.close();
	}
	
	// method to demonstrate the for each loop iteration
	public void iteratingList()
	{
		//creating an array list for names
		ArrayList<String> Names=new ArrayList<String>();
		
		// adding elements in an array list
		Names.add("Navneet");
		Names.add("Aditya");
		Names.add("Shubhan");
		Names.add("Adrian");
		Names.add("Ronak");
		Names.add("Chandan");
		
		// showing output by using for Each loop
		for(String name:Names) {
		System.out.println(name);
		}
	}
	
	public void SortingList() {
		// Creating an array list for names
		ArrayList<String> Fruits=new ArrayList<String>();
		Fruits.add("Orange");
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("PineApple");
		Fruits.add("Kiwi");
		Fruits.add("Mango");
		System.out.println(Fruits);
		System.out.println("After Sorting");
		Fruits.remove(1);
		Collections.sort(Fruits);
		for(String fruit:Fruits) {
			System.out.println(fruit);
		}
	}
	
	public void IndexOf() {
		ArrayList<String> itCompanies=new ArrayList<String>();
		
		itCompanies.add("Capgemini");
		itCompanies.add("TCS");
		itCompanies.add("Infosys");
		itCompanies.add("LTI");
		itCompanies.add("Microsoft");
		System.out.println(itCompanies);
		System.out.println("Enter Company Name to find its Index Value :");
		String name=sc.next();
		for(String n:itCompanies)
		{
			if(n.equalsIgnoreCase(name))
			{
				System.out.println("The Index value of the company is :"+itCompanies.indexOf(n)); 
			}
		}
		
	
	}
	
	
	
	

}
