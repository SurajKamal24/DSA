package leetcodedaily;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            result += numBottles / numExchange;
            numBottles =  numBottles / numExchange + numBottles % numExchange;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new WaterBottles().numWaterBottles(9, 3));
    }
}
