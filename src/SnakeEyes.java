public class SnakeEyes {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6) + 1;       // roll one dice
        int dice2 = (int)(Math.random() * 6) + 1;       // roll the second dice
        int i = 1;                                      // create a counter for rounds

        while (dice1 + dice2 != 2) {
            dice1 = (int)(Math.random() * 6) + 1;       // re-roll one dice
            dice2 = (int)(Math.random() * 6) + 1;       // re-roll the second dice
            i++;                                        // add 1 to the counter
        }

        System.out.print("Number of rolls " + i);       // print the number of rounds
    }
}
