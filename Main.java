public class Main {

    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] a = {10, 25, 8, 40, 15};
        System.out.println("Maximum Element = " + findMax(a));

        Double[] b = {12.5, 45.8, 33.2, 67.1, 29.4};
        System.out.println("Maximum Element = " + findMax(b));

        Character[] c = {'A', 'M', 'Z', 'D', 'K'};
        System.out.println("Maximum Element = " + findMax(c));

        String[] d = {"Apple", "Mango", "Banana", "Zebra"};
        System.out.println("Maximum Element = " + findMax(d));
    }
}