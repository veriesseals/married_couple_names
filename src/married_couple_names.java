import java.util.Scanner;


public class married_couple_names {
    public static void main(String[] args) {
    
        // Input
        // Create a Scanner object to read input from the console
        // -------------------------------------------

        Scanner scanner = new Scanner(System.in);
        
        // Define variables
        // -------------------------------------------
        String firstName1;
        String lastName1;
        String firstName2;
        String lastName2;

        // Get input from user
        // -------------------------------------------
        System.out.println("What is the first person's first name?");
        firstName1 = scanner.nextLine();
        System.out.print("What is the first person's last name?");
        lastName1 = scanner.nextLine();
        System.out.print("What is the second person's first name?");
        firstName2 = scanner.nextLine();
        System.out.print("What is the second person's last name?");
        lastName2 = scanner.nextLine();

        // Output
        // -------------------------------------------
        System.out.println("Here are some common married-couple names:");
        System.out.println(firstName1 + " " + lastName1 + " and " +
                            firstName2 + " " + lastName2);
        System.out.println(firstName1 + " and " + firstName2 + " " + lastName1);
        System.out.println(firstName1 + " and " + firstName2 + " " + lastName2);
        
        // FIXME: Print two hyphenated last name options, with either last name
        //        appearing first. (A hyphen can be written as "-")

        System.out.println(firstName1 + " and " + firstName2 + " " + lastName1 + "-" + lastName2);
        System.out.println(firstName1 + " and " + firstName2 + " " + lastName2 + "-" + lastName1);


    }
}