import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a constant variable
        //String productName = "milk";
        //productName = "bread";
        //float price = 20.0f;
        //boolean isonsale = true;
        //long inventory = 200L;
        //final String expirationDate = "03/21/2024";
        //expiredate = "10/31/2024"

        //double myPI = 3.14;

        // temp check

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean checkin = false;

        while (!checkin) {
            System.out.println("Enter First Name ");
            input = scanner.nextLine();

            if (input.equals("Alice")) {
                System.out.println("Welcome Alice");
                checkin = true;
            } else if (input.equals("Bob")) {
                System.out.println("Welcome Bob");
                checkin = true;
            } else {
                System.out.println("Try again...");
            }
        }

            int randomNum = (int) (Math.random() * 100);
            int studentScore = 27;
            char letterGrade = 'A';

            if (studentScore >= 90) {
                letterGrade = 'A';
                System.out.println("You got an A");
            } else if (studentScore >= 80) {
                letterGrade = 'B';
                System.out.println("You got a B");
            } else if (studentScore >= 70) {
                letterGrade = 'C';
                System.out.println("You got a C");
            } else if (studentScore >= 60) {
                letterGrade = 'D';
                System.out.println("You got a D");
            } else if (studentScore < 60) {
                letterGrade = 'F';
                System.out.println("You got an F");
            }
            scanner.close();

    }
}
