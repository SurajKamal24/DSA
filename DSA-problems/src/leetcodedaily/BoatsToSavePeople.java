package leetcodedaily;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        System.out.println(new BoatsToSavePeople().numRescueBoats(new int[]{1,2}, 3));
    }
}
