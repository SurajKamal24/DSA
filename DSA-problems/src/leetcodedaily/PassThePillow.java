package leetcodedaily;

public class PassThePillow {
    public int passThePillow(int n, int time) {
        int direction = 1, index = 1;
        while (time != 0) {
            index += direction;
            if (index == n || index == 1) {
                direction = -direction;
            }
            time--;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new PassThePillow().passThePillow(5, 3));
    }
}
