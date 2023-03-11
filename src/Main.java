import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
//        Бул сабактагы задачка
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();

        for (int i = 0; i <=20; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 2 == 0) {
                evenList.add(linkedList.get(i));
            } else {
                oddList.add(linkedList.get(i));
            }
        }
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Even List: " + evenList);
        System.out.println("Odd List: " + oddList);
    }
}