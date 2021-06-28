
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.add(1, "aon");
        map.add(2, "dó");
        map.add(3, "trí");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        System.out.println(map.get(4));
        map.remove(2);
        System.out.println(map.get(2));

    }
}

