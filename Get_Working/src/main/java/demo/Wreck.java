package demo;
//Create a new program that prints your name
// The package name must be cohort15
public class Wreck {

    //Makes it a Java program
    public static void main(String[] args) {
        //Declared a variable
        int number;

        //assign a value to the variable
        number = 21;

        number = 69 * 1;    //expression


        //print all the values of every primitave data type on 1 line

        //System.out.println(number * 2); //statement

        int a = 1;
        float b = 2.99f;
        char c = 'd';
        boolean e = true;
        byte g = -12;
        short h = 13;
        long I = 9l;
        double J = 23;
        //System.out.print(a + "\n" + b + "\n" + c + "\n" + e + "\n" + g + "\n" + h + "\n" + I + "\n" + J + "\n");
         //postfix ++
        //++ prefix
        int counter = 1;
        int newCounter = counter++; //counter is stored into new b4 adding ++
        System.out.println("New Counter: " + newCounter);
        System.out.println("New Counter: " + counter);

        String longAssString = " Christopher ";
        System.out.println(longAssString.length());
        System.out.println(longAssString.toUpperCase());

        String ALT = longAssString.substring(6, 9); //!!

        System.out.println(ALT);

        String rev = new StringBuilder(ALT).reverse().toString(); //!!


        System.out.println(rev); //!!

    }

}
