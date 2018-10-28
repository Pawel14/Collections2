import com.sun.java.accessibility.util.Translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SlownikPolskoAngielski {
    public static void main(String[] args) {

        Map<String, String> slowo = new HashMap<>();

        slowo.put("ala", "ala");
        slowo.put("ma", "has");
        slowo.put("kota", "cat");

//        Scanner slowoPolskie = new Scanner(System.in);
//        System.out.print("wpisz slowo po polsku: ");
//        String tlumaczenie = slowoPolskie.next();
//        System.out.println("slowo po angielsku : "+slowo.get(tlumaczenie.toLowerCase()));

//        String idFromUser =slowoPolskie.next();
//        Set<String> keySet = slowo.keySet();
//        for (String key: keySet) {
//            if (idFromUser.equalsIgnoreCase(key)){
//                System.out.println(slowo.get(key));
//            }
//        }
//        String word = "ala ma kota";

//        String[] wordArray2 = word.split(" ");
//        for (String item2: wordArray2) {
//            System.out.print(" "+slowo.get(item2));
//        }

        Scanner slowoPolskie2 = new Scanner(System.in);
        System.out.print("wpisz slowo po polsku: ");
        String tlumaczenie2 = slowoPolskie2.nextLine();

        String[] wordArray = tlumaczenie2.split(" ");
        for (String item: wordArray) {
            System.out.print(" "+slowo.get(item));
        }

//        String result ="";
//        for (String item : wordArray){
//            if(slowo.containsKey(item)){
//                result += slowo.get(item);
//            }else{
//                result += item;
//            }
//            System.out.println(result);
//        }

    }
}
