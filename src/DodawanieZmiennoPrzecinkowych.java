import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DodawanieZmiennoPrzecinkowych {
    public static void main(String[] args) {

        List<Float> floatlista = new LinkedList<>();
//        float a=1;
//        while(a>0.01) {
//
//            Random random = new Random();
//            a = random.nextFloat()*100;
//            lista.add((float)a);
//        }
        Random random = new Random();

        double randomValue = Math.random();
        System.out.println("random value = "+randomValue);

        while (Math.random()> 0.01 ){
            randomValue=Math.random();
            Float value = random.nextFloat() * 100.0f;
            floatlista.add(value);
        }

//            floatlista.stream().forEach(value-> System.out.println("liczba = "+value*Math.PI));

        for(int i=0; i< floatlista.size(); i++)
        {
            System.out.println("liczba = " + floatlista.get(i));
            double c = Math.PI*floatlista.get(i);

            System.out.println("wynik mnozenia "+floatlista.get(i)+"*PI = " +c);
        }

    }
}
