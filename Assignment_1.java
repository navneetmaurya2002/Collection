package arrayList;

import java.util.ArrayList;

public class Assignment_1 {

	public static void main(String[] args) {
Assignment_1 obj=new Assignment_1();
obj.months();
	}
	// method to print all the elements in ArrayList
	public void months() {
		ArrayList<String> months=new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		for(String m:months)
		{
			System.out.println(m);
		}
	}

}
