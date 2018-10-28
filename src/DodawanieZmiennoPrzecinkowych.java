import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DodawanieZmiennoPrzecinkowych {
    public static void main(String[] args) {

        List<Float> lista = new ArrayList<>();
        float a=1;
        while(a>0.01) {

            Random random = new Random();
            a = random.nextFloat()*100;
            lista.add((float)a);
        }

        System.out.println("Rozmiar listy to: "+lista.size());

        for(int i=0; i< lista.size(); i++)
        {
            System.out.println("liczba = " + lista.get(i));
            double c = Math.PI*lista.get(i);

            System.out.println("wynik mnozenia "+lista.get(i)+"*PI =" +c);
        }

    }
}
