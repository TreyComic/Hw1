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

        //Ask for name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        scanner.close();
        //take in

        //if (Name = "Alice") {
            //System.out.println("Welcome Alice");
        //} else if (Name = "Bob"){
            //System.out.println("Welcome Bob");
        //} else {
            //System.out.println("Enter Name: ");
        //}



        int studentScore = (int) (Math.random() * 100);
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

    }
}


