public class Main {
    public static void main(String[] args) {
        // dataType [] nameOfArray;
        String[][] productNickNames = {
                {"Cheese", "Orange", "French"}, //row 0
                {"broc", "coke", "salad"} //row 1
        };
        int[][] prices = {{5, 3, 1},
                {4, 2, 7}
    };

        //nameOfArray[rowIndexPosition][columnIndexPosition]

        for(int i = 0; i < prices.length; i++) {

            for (int x = 0; x < prices[0].length; x++) {

                System.out.println(productNickNames[i][x] + " $" + prices[i][x]);
            }
        }
        double[] bills = {12.0, 199.99, 0.0, 0.0, 39.99, 21.99};
        //12.0 + 199.99, = total
        double total = 0.0;
        for(int y = 0; y < bills.length; y++ ){
//            total = total + bills[y];
            total += bills[y];
            //   System.out.println(total);
        }
        System.out.println("avg " + total / bills.length);
        //calculate the average BILL
        String[] food = {"bees", "soda", "fries"};
        for(String element : food){
            //System.out.println(element);
        }

        //use a for each loop to loop through {x, y, z}
        char[] let = {'x', 'y', 'z'};
        for(int element : let){
            System.out.println(element);
        }


        //question
        int[][] numbers = {
                {10, 20, 30, 40},
                {1, 2, 3, 4}
        };

        // print 30 and 3
            for(int e = 0; e < numbers.length; e++){
                System.out.println(numbers[e][2]);
            }

    }
}
