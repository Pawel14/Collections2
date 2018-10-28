import java.util.*;

public class MapyPracownik {
    public static void main(String[] args) {

        Map<String, String> pracownik = new HashMap<>();

        pracownik.put("a111", "Jan Kowalski");
        pracownik.put("f333", "Wojciech Kowalski");
        pracownik.put("cd222", "Kasia Piotrowska");
        pracownik.put("e555", "Anna Zawadzka");
        pracownik.put("a444", "Jan Kowalski");

//        for (Map.Entry<String,String> wpis: pracownik.entrySet()) {
//            System.out.println(wpis.getKey()+ " "+ wpis.getValue());
//        }

//        System.out.println(pracownik.get("a111")+ "_"+pracownik.get("A111".toLowerCase()));


        Scanner ss = new Scanner(System.in);
        System.out.print("\nwpisz klucz: ");
        String s = ss.nextLine();
        System.out.println("osoba o wpisanym indeksie to : "+pracownik.get(s.toLowerCase()));
//
//        String idFromUser =scaner.next();
//        Set<String> keySet = pracownik.keySet();
//        for (String key: keySet) {
//            if (idFromUser.equalsIgnoreCase(key)){
//            System.out.println(pracownik.get(key));
//            }
//        }



    }

}
