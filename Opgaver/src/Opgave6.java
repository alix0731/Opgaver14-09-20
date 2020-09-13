import java.util.ArrayList;
import java.util.HashSet;

public class Opgave6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(4);
        list.add(15);
        list.add(3);
        list.add(2);
        list.add(15);

        int a = countUnique(list);

        System.out.println("Number of unique total: " + a);

    }



    public static int countUnique(ArrayList<Integer> list){

        HashSet<Integer> uniqueList = new HashSet<>();

        uniqueList.addAll(list);

        return uniqueList.size();

    }

}
