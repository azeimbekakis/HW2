import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Birthday {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String line = reader.readLine();

        // Create a counter for trials, and two lists that hold each trial's total and the current trial birthdays
        int trials = Integer.parseInt(line);
        int counter = 0;
        List<Integer> birthdays = new ArrayList<Integer>();
        List<Integer> trial_totals = new ArrayList<Integer>();

        // Loop for every trial. Find the number of people needed to find the same birthday in each trial
        while (counter < trials) {
            int people = 0; // The number of people in this trial.
            int i = 0;  // A placeholder that holds the loop until a match is found.
            birthdays.clear();
            while (i == 0) {
                int bd = (int) (Math.random() * 365) + 1;   // Pick a birthday
                people++;
                if (birthdays.contains(bd)) {
                    trial_totals.add(people);
                    i++;    // Breaks out of this trial
                }
                birthdays.add(bd);  // Add the birthday to the running list.
                }
            counter++;
        }

        // Calculate the average of the trials
        int sum = 0;
        for (int k = 0; k < trial_totals.size(); k++) {
            sum = sum + trial_totals.get(k);
        }
        int avg = sum / trials;

        System.out.println("Average number of people is " + avg);
    }
}
