package hashtable;


public class Main {
    public static void main (String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("paint", 100);
        myHashTable.set("bolts", 100);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println(myHashTable.keys());
    }
}
