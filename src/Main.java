//        Задача
//        Дан массив строк, необходимо удалить из него все дубли,
//        оставшиеся строки объединить в одну в порядке следования в массиве.

import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[] {"a", "b", "c", "d", "e", "a", "b", "f"};
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, arr);
        System.out.println(set);
        String joinArr = String.join("", set);
        System.out.println(joinArr);
    }
}