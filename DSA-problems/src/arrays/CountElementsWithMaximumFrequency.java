package arrays;

public class CountElementsWithMaximumFrequency {
    public static int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];
        int max_freq = 0, ans = 0;
        for (int i : nums) {
            //System.out.println("this is the num" + i);
            frequency[i]++;
            int temp = frequency[i];
            //System.out.println("this is the freq" + temp);
            if (temp > max_freq) {
                max_freq = temp;
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (frequency[i] == max_freq)
                ans += max_freq;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));
    }
}
