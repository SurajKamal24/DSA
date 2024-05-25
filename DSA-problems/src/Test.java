import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static int solve(int N, int K) {
        int result = 0;
        while (N > 0) {
            result = result + (N >= K ? K : N);
            N = N - K + (N >= K ? 1 : 0);
        }
        return result;
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int totalSecs = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    totalSecs++;
                }
                if (tickets[k] == 0) {
                    break;
                }
            }
        }
        return totalSecs;
    }

    public enum Planet {

        VENUS   (4.869e+24, 6.0518e+6),
        EARTH   (5.976e+24, 6.37814e+6),
        MARS    (6.421e+23, 3.3972e+6),
        JUPITER (1.9e+27,   7.1492e+7),
        SATURN  (5.688e+26, 6.0268e+7),
        URANUS  (8.686e+25, 2.5559e+7);

        private final double m; // mass in kilograms
        private final double r; // radius in meters

        Planet(double mass, double radius) {
            this.m = mass;
            this.r = radius;
        }

        public double mass() { return m; }

        public double radius() { return r; }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(timeRequiredToBuy(new int[]{2,3,2}, 2));
        /*File file = new File("C:\\Users\\suraj\\Downloads\\dataset_91007.txt");
        Scanner scanner = new Scanner(file);
        int max = 0;
        while(scanner.hasNextLine()) {
            max = Math.max(max, scanner.nextInt());
        }
        System.out.println(max);*/
        /*for (Planet planet : Planet.values()) {
            if (planet.mass() > 5.0e+24 && planet.radius() > 6.0e+7) {
                System.out.println(planet);
            }
        }*/
        System.out.println(solve(100, 5));

    }
}
