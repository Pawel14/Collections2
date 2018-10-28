public class Algorytm {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        while (true) {
            int c = a % b;
            a = b;
            b = c;

            if (b == 0) {
                break;
            }
        }
        System.out.println("NWD = " + a);
    }
}
