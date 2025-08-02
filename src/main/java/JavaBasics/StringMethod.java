package JavaBasics;

public class StringMethod {

    public static void main(String[] args) {
        StringMethod1();
    }

    public static void StringMethod1() {

        // Different types of String Methods in Java
        // .toUpperCase()
        // .toLowerCase()
        // .indexOf("a")
        // .charAt(5)
        // .equals("Python")
        // .trim()

        String sentence = "I love Java";
        System.out.println("The length of the sentence is: " +  sentence.length());
        System.out.println("The Uppercase of the sentence is: " +  sentence.toUpperCase());
        System.out.println("The Lowercase of the sentence is: " +  sentence.toLowerCase());
        System.out.println("The Index of the letter is: " +  sentence.indexOf("a"));
        System.out.println("The char of the letter is or position: " +  sentence.charAt(5));
        System.out.println("Is Java equals to Python? " +  sentence.equals("Python"));
        System.out.println("Lets trim the end of the sentence " +  sentence.trim());
    }
}
