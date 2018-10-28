public class CiagFibonaciego {

    int[] ciag() {

        int []tab= new int[10];
        tab[1]=1;
        tab[0]=0;

        for(int i=2; i<10;i++){
            tab[i]=tab[i-2]+tab[i-1];
        }
        for (int x: tab) {
            System.out.println(x);
        }

            return tab ;
        }

    public static void main(String[] args) {
     new CiagFibonaciego().ciag();


    }
}
