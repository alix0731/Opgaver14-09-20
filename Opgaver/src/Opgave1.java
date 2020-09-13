import java.util.ArrayList;
import java.util.List;

public class Opgave1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Omar");
        list.add("Umit");

        int a = totalVowels(list);

        System.out.println("Total vowels = " + a);


    }

    public static int totalVowels(List<String> list){

        int vowels = 0;

        if(list.isEmpty()){
            return 0;
        }

        for(int i = 0; i < list.size(); i++){

            String word = list.get(i).toLowerCase();

            if(word.contains("a")){

                vowels++;
            }
            if(word.contains("e")){

                vowels++;
            }
            if(word.contains("i")){

                vowels++;
            }
            if(word.contains("o")){

                vowels++;
            }
            if(word.contains("u")){

                vowels++;
            }

        }

        return vowels;
    }

}
