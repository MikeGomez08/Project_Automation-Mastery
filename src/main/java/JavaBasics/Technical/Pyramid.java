package JavaBasics.Technical;

public class Pyramid {


    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            //Print the spaces
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * i - 1 ); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
