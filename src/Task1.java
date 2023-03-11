import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList<>();
        LinkedList<Integer> intList = new LinkedList<>();

        // Биринчи тизмени англис алфавитинин тамгалары менен толтуруу
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            charList.add(ch);
        }

        // Экинчи тизмени 1ден 10го чейинки сандар менен толтуруу
        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }
        System.out.println("Сандар "+intList);

        // Биринчи тизменин маанилерин ArrayListке көчүруу
        ArrayList<Character> charArray = new ArrayList<>(charList);

        System.out.println("ArrayList:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("LinkedList:");
        for (char ch : charList) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
