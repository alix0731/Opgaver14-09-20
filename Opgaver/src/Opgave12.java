import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Opgave12 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");

        list.add("Lars");

        list.add("Bo");


        System.out.println(contains3(list));


    }


    public static boolean contains3(List<String> list) {

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                String b = list.get(j);
                if (a.equals(b)) {
                    count++;
                    System.out.println(count);

                    if (count == 3) {

                        return true;
                    }

                }
            }

        }
        return false;
    }

}
