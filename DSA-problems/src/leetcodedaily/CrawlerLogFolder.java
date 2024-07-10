package leetcodedaily;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int counter = 0;
        for (String log : logs) {
            if (log.equals("../") && counter > 0) {
                counter--;
            }
            if (! log.equals("../") && ! log.equals("./")) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new CrawlerLogFolder().minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }
}
