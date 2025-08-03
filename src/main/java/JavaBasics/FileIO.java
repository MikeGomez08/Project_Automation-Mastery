package JavaBasics;

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class FileIO {
    public static void main(String[] args) {

        // Initialization of Files
        File file1 = new File("Files/file1.txt");
        File file2 = new File("Files/file2.txt");

//        ReadFile(file1, file2);
//        CompareFile(file1, file2);
          Menu(file1, file2);

    }

    static void Menu(File file1, File file2) {

        // Menu of all the file handling

        // Welcome message
        System.out.println("---------------------------------");
        System.out.println("Welcome to our Java File Handling");
        System.out.println("---------------------------------");
        System.out.println("1. Read file: ");
        System.out.println("2. Compare file: ");
        System.out.println("3. Create file: ");
        System.out.println("4. Delete file: ");
        System.out.println("5. Exit: ");

        // Get the user inputs
        System.out.println("\n Enter your input: ");
        Scanner sc1 = new Scanner(System.in);
        int inputMenu = sc1.nextInt();

        // Print the desired input

        switch(inputMenu) {
            case 1:
                System.out.println("You have selected 1 - Read file: ");
                ReadFile(file1,file2);
                break;
            case 2:
                System.out.println("You have selected 2 - Compare file: ");
                CompareFile(file1, file2);
                break;
            case 3:
                System.out.println("You have selected 3 - Create file: ");
                CreateFile();
                break;
            case 4:
                System.out.println("You have selected 4  - Delete file: ");
                DeleteFile();
                break;
            case 5:
                break;

        }

    }

    static void ReadFile(File file1, File file2) {

        // Read a file
        // Get the user directory

        if(file1.exists() && file2.exists()) {
            System.out.println("-----------------------------------");
            System.out.println("File name is: " + file1.getName());
            System.out.println("File path is: " + file1.getAbsoluteFile());
            System.out.println("-------------------------------------");

            System.out.println("-------------------------------------");
            System.out.println("File name is: " + file2.getName());
            System.out.println("File name is: " + file2.getAbsoluteFile());
            System.out.println("-------------------------------------");
        }
        else {
            System.out.println("File doesn't exist");
            System.out.println("Working directory " + System.getProperty("user.dir") );
        }
    }

    static void CompareFile(File file1, File file2) {

        // Compare the files
        if(file1.compareTo(file2) == 0) {
            System.out.println("The " + file1 + "and " + file2 + "are the same!");
        }
        else {
            System.out.println("The files are  not the same");
        }
    }

    static void CreateFile(){

        // Create a new file
        String strPath, strName;

        try {
            // Enter the file name
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            strName = br1.readLine();

            //Enter the file path
            System.out.println("Enter the file path: ");
            strPath = br1.readLine();

            // Creating an file object
            File file1 = new File(strPath + "\\" + strName + ".txt");

            file1.createNewFile();
        }
        catch(Exception ex1) {
            System.out.println("Failed to create a file ");
        }

    }

    static void DeleteFile() {
        //Delete the file
        String strName;
        String strPath = "C:\\Users\\user\\Desktop\\Automation\\automation-mastery\\JavaSeleniumBDD\\CucumberJava\\Files";

        try {
            //Enter the file name
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name you wanted to delete: ");
            strName = br1.readLine();


            //The default path file
            File filePath = new File(strPath);

            // Declare the whole file name and file path
            File file1 = new File(strPath + "\\" + strName + ".txt");

            if(filePath.exists()) {
                file1.delete();
                System.out.println("Successfully Deleted");
            }
            else {
                System.out.println("The file name or path doesn't exist");
            }
        }

        catch(Exception ex1) {
            System.out.println("Failed to delete the file");
        }

    }


}
