
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Alist {

	public static void main(String[] args) {
		Alist obj = new Alist();
		Scanner sc = new Scanner(System.in);
		System.out.print("Select one of the option:");
		
		System.out.println();
		System.out.println("1. Games");
		System.out.println("2. Places");
		System.out.println("3. Stations");
		System.out.println();
		byte opt = sc.nextByte();
		switch (opt) {
		case 1:
			obj.alist1();
			break;
		case 2:
			obj.alist2();
			break;
		case 3:
			obj.alist3();
			break;
		default:
			System.out.println("Please Re-Run the code !!!");
			break;
		
		}
		sc.close();
	}

	public void alist1() {
		ArrayList<String> Games = new ArrayList<String>();
		System.out.println("Output for first Method");
		Games.add("PUBG");
		Games.add("VELORANT");
		Games.add("CLASH ROYALE");
		Games.add("CLASH OF CLANS");
		Games.add("BOOM BEACH");
		Games.add("");

		// displaying elements
		System.out.println(Games);
		Games.remove(0);
		Games.add(0, "BGMI");

		// displaying elements
		System.out.println(Games);
	}

	public void alist2() {
		ArrayList<String> places = new ArrayList<String>();
		System.out.println("Output for second Method");
		places.add("Ghansoli");
		places.add("Andheri");
		places.add("Dadar");
		places.add("Kurla");
		places.add("C.S.T");
		places.add("Kandivali");

		// displaying elements
		System.out.println(places);

		places.remove("Ghansoli");
		places.add(0, "Navi Mumbai");

		// displaying elements
		System.out.println(places);

	}

	public void alist3() {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Output for third Method");
		names.add("Jim");
		names.add("Jack");
		names.add("Ajeet");
		names.add("Chaitanya");
		names.set(0, "Lucy");
		System.out.println(names);
	}
}
