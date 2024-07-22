package leetcodedaily;
import java.util.Arrays;
public class SortThePeople {
    class Person {
        String name;
        int height;
        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }
        Arrays.sort(people, (a, b) -> {
            return b.height - a.height;
        });
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = people[i].name;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortThePeople().sortPeople(new String[]{"Alex", "Ben", "Charlie"}, new int[]{5, 3, 7})));
    }
}
