package qaautomation.tugas1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
		// TreeSet
		TreeSet<String> nameListTree = new TreeSet<>();

		nameListTree.add("Bob");
		nameListTree.add("Twyla");
		nameListTree.add("John");
		nameListTree.add("Moira");
		nameListTree.add("Alexis");
		nameListTree.add("Bob");


		for (String name : nameListTree) {
			System.out.println(name);
		}
		
		System.out.println(nameListTree);
		
		System.out.println("============================");

		//TreeMap
		TreeMap<String, String> favoriteFoodTree = new TreeMap<>();
		favoriteFoodTree.put("andro", "mie");
		favoriteFoodTree.put("andro", "nasi");
		favoriteFoodTree.put("izam", "ketoprak");
		favoriteFoodTree.put("reza", "nasi");
		favoriteFoodTree.put("agung", "sushi");
		favoriteFoodTree.put("hasan", "tempe");


		for (String key : favoriteFoodTree.keySet()) {
			System.out.println("Favorite food of " + key + " is " + favoriteFoodTree.get(key));
		}
		
		System.out.println(favoriteFoodTree);
		
		System.out.println("============================");
		
		// HashSet
		HashSet<String> nameList = new HashSet<>();

		nameList.add("Bob");
		nameList.add("Twyla");
		nameList.add("John");
		nameList.add("Moira");
		nameList.add("Alexis");
		nameList.add("Bob");


		for (String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println(nameList);
		
		System.out.println("============================");

		//HashMap
		HashMap<String, String> favoriteFood = new HashMap<>();
		favoriteFood.put("andro", "mie");
		favoriteFood.put("andro", "nasi");
		favoriteFood.put("izam", "ketoprak");
		favoriteFood.put("reza", "nasi");
		favoriteFood.put("agung", "sushi");
		favoriteFood.put("hasan", "tempe");


		for (String key : favoriteFood.keySet()) {
			System.out.println("Favorite food of " + key + " is " + favoriteFood.get(key));
		}
		
		System.out.println(favoriteFood);
		
		System.out.println("============================");

	}

}

