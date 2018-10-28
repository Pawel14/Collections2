import java.util.Random;

public class OperacjeNaTablicy {

    private static void kolejneWartosci(int [] tab, int n) {
        for (int i = 0; i < n; i++) {
            tab[i] = i;
        }
        for (int x : tab) {
            System.out.print(x + " ");
        }
    }
        private static void nieparzysteIndeksy (int [] tab2, int n2 ){
            for (int i = 0; i < n2; i++) {
                tab2[i] = i;
            }
            for (int x : tab2) {
                System.out.print(x + " ");
            }
        }



    public static void main(String[] args) {
        int [] tab = new int[6];
        kolejneWartosci(tab,6);
        int [] tab2 = new int[6];
       nieparzysteIndeksy(tab2,6);

    }
}
