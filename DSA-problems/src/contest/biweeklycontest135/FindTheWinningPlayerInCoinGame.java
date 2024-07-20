package contest.biweeklycontest135;

public class FindTheWinningPlayerInCoinGame {
    public String losingPlayer(int x, int y) {
        String player = "Alice";
        while (x >= 1 && y >= 4) {
            x -= 1;
            y -= 4;
            player = player.equals("Alice") ? "Bob" : "Alice";
        }
        return player == "Bob" ? "Alice" : "Bob";
    }
    public static void main(String[] args) {
        System.out.println(new FindTheWinningPlayerInCoinGame().losingPlayer(2, 7));
    }
}
