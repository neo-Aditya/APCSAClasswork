
import java.util.ArrayList;


public class ClassStuff {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Arcadia");
        list.add("Galvaria");
        list.add("Eldoria");
        list.add("Lyrania");
        list.add("Valoria");
        list.add(0, "Miranthia");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1, "Verdania");
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        list.remove("Galvaria");
        System.out.println(list.get(1));
        list.clear();
        System.out.println(list);
    }
}
