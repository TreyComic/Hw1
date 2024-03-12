public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99; //start
        String word = "bottles"; //plural word default
        while (beerNum > 0) { //checking if start # greater than 0
            System.out.println(beerNum + " " + word + " of beer on the wall"); //New First Verse
            System.out.println(beerNum + " " + word + " of beer"); //second verse
            System.out.println("Take one down"); //take
            System.out.println("Pass it around"); //pass
            beerNum --; //(beerNum = beerNum --) not necessary!! ==> decrement
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle
                //if not skip to sysout (we moved them because they did not need to be there)
            }
             //first verse
            //old verses did not need to be here... move to next if
            if (beerNum < 1) {
                System.out.println("No more bottles of beer on the wall"); //find a use
            }
        }
    }
}
