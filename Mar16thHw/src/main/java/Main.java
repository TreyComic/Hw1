public class Main {
    //Question 1
    public static int getLastIndex(String[] names) {
        for (int counter = names.length - 1; counter >= 0; counter--) {
            if (names[counter] != null) { //check if its empty
                return counter;
            }
        }
        return 0;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        for (int counter = names.length - 2; counter >= 0; counter--) {
            if (names[counter] != null) {
                return counter;
            }
        }
        return 0;
    }

    //Question 3
    public static String getFirstElement(String[] names) {

        for (String Named : names){
            if(Named != null){ //makes sure element isn't empty
                return Named;
            }
        }
        return null;
    }

    //Question 4
    public static String getLastElement(String[] names) {
        for (int counter = names.length - 1; counter >= 0; counter--) {
            if (names[counter] != null) {
                return names[counter];
            }
        }
        return null;
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        for (int counter = names.length - 2; counter >= 0; counter--) {
            if (names[counter] != null) {
                return names[counter];
            }
        }
        return null;
    }

    // Question 6
    public static int getSum(int[] ints) {
        int add = 0;
        for (int value : ints){
            add += value;
        }
        return add;
    }

    // Question 7
    public static int getAverage(int[] ints) {
        int summed = getSum(ints);
        return summed / ints.length;
    }

    // Question 8
    public static int[] extractAllOddNumbers(int[] numbers) {
        int x = 0;
        while (x <= numbers.length) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
        int[] convert = new int[x];
        int i = 0;
        for (int count : numbers){
            if (x % 2 != 0) {
               convert[i++] = x;
            }
        }
        return convert;
    }


    // Question 9
    public static int[] extractAllEvenNumbers(int[] numbers) {
        int x = 0;
        while (x <= numbers.length) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
        int[] convert = new int[x];
        int i = 0;
        for (int count : numbers){
            if (x % 2 == 0) {
                convert[i] = x;
            }
        }
        return convert;
    }

    //OR return a String for question 8 and 9. Your choice
    // Question 8
    public static String gettAllOddNumbers(int[] numbers) {
        StringBuilder oddNumbers = new StringBuilder();
        int x = 0;
        while (x <= numbers.length) {
            if (x % 2 != 0) {
                oddNumbers.append(x);
            }
            x++;
        }
        return oddNumbers.toString();
    }


    // Question 9
    public static String getAllEvenNumbers(int[] numbers) {
        StringBuilder evenNumbers = new StringBuilder();
        int x = 0;
        while (x <= numbers.length) {
            if (x % 2 == 0) {
                evenNumbers.append(x);
            }
            x++;
        }
        return evenNumbers.toString();
    }


    // Question 10
    public static boolean contains(String[] names, String element) {
        for(String name : names) { //new array with values
            if(name.equals(element)){ //check if any = element
                return true;
            }
        }
        return false;
    }

    // Question 11
    public static int getIndexByElement(String[] names, String element) {
        for (int count = 0; count < names.length; count++) {
            if (names[count].equals(element)) {
                return count;
            }
        }
        return 0;
    }


    //Question 12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        StringBuilder resultout = new StringBuilder();
        for (int a = 0; a < n; a++){
            resultout.append(str);
        }
        return resultout.toString();
    }


    //Question 14
    public static int wordsInAStringCounter(String str) {
        return 0;
    }

    //Question 15 - A, E, I, O, U
    public static int vowelsCounter(String str) {
        str = str.toLowerCase();
        int counter = 0;
        for (int I =0; I < str.length(); I++){
            char vowel = str.charAt(I);
            if (vowel == 'a' || vowel == 'e' || vowel == 'u' || vowel == 'i' || vowel == '0') {
                counter++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
