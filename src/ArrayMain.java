public class ArrayMain {

    public static void main(String[] args) {

        int [] arrayOfInts = new int [5];
        Integer [] arrayOfIntegers = new Integer[5];


        for (int element:arrayOfInts) {
            System.out.println(element);
        }



        for (Integer element : arrayOfIntegers) {
            System.out.println(element);
        }
    }
}
