package JavaBasics.Collection;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        ExerciseArrayList();
//        ExerciseHashMap();
          ExerciseHashSet();
    }

    public static void ExerciseHashMap() {

        // Problem: Student Grades

        HashMap<String, Integer> grades = new HashMap<>();

        // Add 5 students
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 88);
        grades.put("David", 92);
        grades.put("Eva", 78);

        // Print all entries
        System.out.println("Original Grades - " + grades);

        // Update Entry
        grades.replace("David", 95);
        String updateName = "David";
        grades.getOrDefault(updateName, 95);
        int updateGrade = grades.get(updateName);
        System.out.println("Updated " + updateName + " grade to " + updateGrade);

        // Remove Entry
        String removeName = "Bob";
        int removeGrade = grades.putIfAbsent("Bob", 85);
        System.out.println("Removed " + removeGrade + " from the list");
        grades.remove("Bob");
        System.out.println("Removed " + grades.values());

        // Search for Student
        String searchName = "Charlie";
        int searchGrade = Integer.valueOf(grades.getOrDefault(searchName, 88));
        System.out.println("Grade for " + searchName + " is " + searchGrade );

    }

    public static void ExerciseHashSet() {
        HashSet<String> fruits = new HashSet<>();

        // Add 6 Fruits
        fruits.add("Mango");
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Avocado");
        fruits.add("Avocado");


        // Print all unique fruits
        System.out.println("Original fruits: " + fruits);

        // Check if a specific fruit exists.
        String fruit = "Mango";
        System.out.println("Is " + fruit  + " on the set? " + fruit.contains("Mango"));

        // Remove one fruit.
        fruits.remove("Mango");
        System.out.println("After removing Mango:" + fruits);

        // Show the final set.
        System.out.println("The final set " + fruits);
    }

    public static String ExerciseArrayList() {

        ArrayList<String> songs = new ArrayList<>();

        songs.add("Alone");
        songs.add("Alone2");
        songs.add("Alone3");
        songs.add("Alone4");
        songs.add("Alone5");


        songs.remove(2);

        System.out.println("All songs are " + songs);

        for(String song : songs) {
            System.out.println("-" + song);
        }
        return null;
    }

    public static String ArrayLists() {
        ArrayList<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits " + fruits);

        fruits.remove("banana");
        fruits.remove("Banana");

        System.out.println("Remove Fruits " + fruits);

        return null;
    }

    public static String HashSets() {

        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        System.out.println("Colors" + colors);

        return null;
    }

    public static String HashMaps() {
        HashMap<Integer, String> users = new HashMap<>();

        users.put(1, "Mike");
        users.put(2, "Jake");
        users.put(3, "Harith");


        System.out.println("User 2 " + users.get(2));

        users.remove(1);
        System.out.println("All Users " + users);
        return null;
    }

    public static String LinkedLists() {

        Queue<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");


        System.out.println("Next Step: " + tasks.peek());
        System.out.println("Processing: " + tasks.poll());
        System.out.println("Processing: " + tasks);

        return null;
    }
}
