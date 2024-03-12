public class PhraseOmatic {
    public static void main (String[] args) {
        String[] wordListOne = {"beep", "tier", "ceramic"};
        String[] wordListTwo = {"beeps", "tiers", "ceramics"};
        String[] wordListThree = {"beepy", "tiery", "ceramicy"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        String Phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("what we need is a " + Phrase);
    }
}
