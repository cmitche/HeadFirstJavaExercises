public class PhraseomaticApplication {

    public static void main(String[] args) {
        //Make 3 sets of words to choose from. Add your own!
        String[] wordListOne = {"Muhammad", "Sugar", "Iron", "Smokin'", "Floyd"};
        String[] wordListTwo = {"The Greatest", "Ray", "Mike", "Joe", "Money"};
        String[] wordListThree = {"Ali", "Leonard", "Tyson", "Frazier", "Mayweather"};

        //Find out how many words are in each list.
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generate three random numbers.
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Now build a phrase.
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Print out the phrase.
        System.out.println("What we need is a(n) " + phrase);
    }
}
