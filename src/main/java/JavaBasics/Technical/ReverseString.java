package JavaBasics.Technical;


import java.util.*;
public class ReverseString {

    public static void main(String[] args) {

        String original = "Mike Miguel Gomez";
        StringBuilder sb = new StringBuilder(original);

        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
