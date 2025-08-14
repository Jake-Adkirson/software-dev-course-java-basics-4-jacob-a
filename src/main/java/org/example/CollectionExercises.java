package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] newFruits = new String[size];

        for (int i=0; i < size; i++) {
            newFruits[i] = "apple";
        }
        return newFruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] newerFruits = Arrays.copyOf(fruits, 3);
        return newerFruits;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");

        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> listOfThree = new ArrayList<String>();
        listOfThree.add(fruit1);
        listOfThree.add(fruit2);
        listOfThree.add(fruit3);

        return listOfThree;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruitMap = new HashMap<String, String>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");

        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String fruit = fruitMap.get("apple");
        return fruit;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<String>();
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);

        return fruitSet;
    }
}
