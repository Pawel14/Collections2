import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LiczenieZnakiSpecjalne {

    public static void main(String[] args) {

        String wyraz="calbbcccccc";

        char[]znaki=wyraz.toCharArray();

        Set<Character> lista = new HashSet<>();

        int licz=0;
        for (Character znak: znaki) {
            if(!lista.contains(znak)){
                lista.add(znak);
                licz++;
            }
        }
        System.out.println("liczba liter : "+licz);

        for (char wpis : lista) {
            System.out.println(wpis);
        }
        }
    }

