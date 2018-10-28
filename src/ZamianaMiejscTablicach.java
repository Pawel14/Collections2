import java.util.Arrays;
import java.util.Random;

public class ZamianaMiejscTablicach {

    private static void swap(int[] tab, int i, int i1) {
        int a = tab[i];
        tab[i] = tab[i1];
        tab[i1] = a;
    }

    private static void corazMniejsze(int[] tab2, int n) {

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println("\n");
    }

    private static void corazWieksze(int[] tab3, int m) {

        for (int j = 0; j < m; j++) {

            System.out.print(tab3[j] + " ");
        }
    }

    private static void przedzialAB(int[] tab4, int a, int b) {

        for (int q = 0; q < tab4.length; q++) {
            Random random = new Random();
            int li = random.nextInt(b - a) + a;
            tab4[q] = li;
            System.out.print(tab4[q] + " ");
        }
    }

    private static void sumaTablic(int[] tab5, int[] tab6, int a, int b) {

        int suma = 0;
        for (int i = 0; i < tab5.length; i++) {
            Random random = new Random();
            int li = random.nextInt(b - a) + a;
            tab5[i] = li;
            System.out.print(tab5[i] + " ");

        }
        for (int i = 0; i < 3; i++) {
            suma = suma + tab5[i];
        }
        System.out.println("\nsuma tablicy "+suma);

        for (int i = 0; i < tab6.length; i++) {
            Random random = new Random();
            int li = random.nextInt(b - a) + a;
            tab6[i] = li;
            System.out.print(tab6[i] + " ");

        }
        int suma2 = 0;
        for (int i = 0; i < 3; i++) {
            suma2 = suma2 + tab6[i];
        }
        System.out.println("\nsuma tablicy "+suma2);
        int sumaTab=suma+suma2;
        System.out.println("\nsuma tablic "+sumaTab);
    }



    public static void main(String[] args) {
//        int [] tab = new int[]{1,2,3,4,5};
//        swap(tab , 1, 3);
//        for (int swap:tab) {
//            System.out.println(swap);
//        }
//        int [] tab2 = new int[]{3,4,5,6,7};
//        corazMniejsze(tab2,5);

//        int [] tab3 = new int[]{3,4,5,6,7};
//        corazWieksze(tab3,5);
//        int [] tab4 = new int[4];
//        przedzialAB(tab4,3,10);
        int [] tab5 = new int[3];
        int [] tab6 = new int[3];
        sumaTablic(tab5,tab6,2,5);

    }
}
