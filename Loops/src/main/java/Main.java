import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    //All our static methods for now
    //Must go inside the class
    //But outside the main method
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            if (x % 2 != 0) {
                //System.out.println(x);
            }
            x++;
        }

        //invoke or Call the method
        //MethodsName(arguments);
        greetUser("Mike Jones", 22);
        //"ClassName".greetUser(); calls from any folder

        //getChange invoke and input
        //System.out.println("How much are you paying with today?");
        //prompt
        //Scanner y = new Scanner(System.in);
        //double paid = y.nextDouble();
        //scanner value created
        //getChange(paid);
        //scanner value is equal to dollarAmount
        //y.close();

        //1
        AreaC(2.3);

        //2
        squared(23);

        //alt
        double itemCost = 100.0;
        double percentOff = 20.0;
        Discounts(itemCost, percentOff);
    }
    //Access modifier
    //Static and return datatype || if no return data type - VOID
    //name of method
    //(parameters)
    //{ curly brackets block of code }

    public static void greetUser(String userName, int age){
        //System.out.println("Welcome to my website" + userName);
    }

    //create method named getChange
    //asks for a dollarAmount
    //Use it to print the persons change assuming
    //a cup of coffee always costs $1
    public static double getChange(double dollarAmount) {
        double CostOfCoffee = 1.0;
        double returns = dollarAmount - CostOfCoffee;
        //maths
        return returns;
        //solve and output
        
    //1 -  a method calcs area of circle and prints result
    //2 - a method takes on parameter and returns the square

    public static void AreaC(double radius){
        double area = (radius * radius) * 3.14;
        //System.out.println(area);
    }

    public static int squared(int sq){
        return sq * sq;
    }

    //alt
    public static void Discounts(double originalPrice, double discountedPercent){
        double discountedPrice = originalPrice - (originalPrice * (discountedPercent / 100));
        System.out.println("$" + discountedPrice);
    }
}
