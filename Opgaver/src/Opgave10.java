import java.util.ArrayList;
import java.util.List;

public class Opgave10 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Hej");
        list.add("Hvad");
        list.add("Bro");
        list.add("Hvor");
        list.add("Hvordan");
        list.add("bbb");
        list.add("bbbb");


        List<String> list1 = removeOddLength(list);

        for(String i : list1){
            System.out.println(i);
        }



    }

    public static List<String> removeOddLength(List<String> list){

        int length;

        for(int i = 0; i < list.size(); i++){

            length = list.get(i).length() % 2;

            if(length == 1){

                list.remove(i);
            }
        }
        return list;
    }
}
