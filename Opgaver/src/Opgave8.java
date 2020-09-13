import java.util.ArrayList;
import java.util.List;

public class Opgave8 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hej");
        list.add("Hvad");
        list.add("laver");
        list.add("du");

        int a = minLength(list);

        System.out.println(a);
    }

    public static int minLength(List<String> list) {

        int shortest = 1110;

        for (int i = 0; i < list.size(); i++) {


            if (list.get(i).length() < shortest) {

                shortest = list.get(i).length();

            }

        }
        return shortest;
    }
}
