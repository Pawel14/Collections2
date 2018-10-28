import java.util.ArrayList;
import java.util.List;

public class ListaZadaanie4TrimUpperCase {

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("dda");
        list.add("a");
        list.add("pppa");
        list.add("QMAS");

        String result = list.stream()
                .reduce((a , b) -> a.trim().toUpperCase()+" "+ b.trim().toUpperCase())
                .orElse("empty");

        System.out.println(result);
    }
}