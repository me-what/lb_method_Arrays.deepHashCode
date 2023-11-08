import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr1 = {3, 5, new int[]{6, 7, 9}};

        int h3 = arr1.hashCode();
        int h2 = Arrays.hashCode(arr1);
        int h1 = Arrays.deepHashCode(arr1);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3+"\n");

// -_-

        Object Arr1[] = {10, 5, 25};
        Object Arr2[] = {10, 5, 25};
        Object Arr3[] = {10, 20, 30};

        System.out.println("deepHashCode of Arr1: "+ Arrays.deepHashCode(Arr1));
        System.out.println("deepHashCode of Arr2: "+ Arrays.deepHashCode(Arr2));
        System.out.println("deepHashCode of Arr3: "+ Arrays.deepHashCode(Arr3));

        boolean check = (Arrays.deepHashCode(Arr1) == Arrays.deepHashCode(Arr2));
        System.out.println("\nAre Arr1 and Arr2 equal?: "+ check);

        check = (Arrays.deepHashCode(Arr1) == Arrays.deepHashCode(Arr3));
        System.out.println("Are Arr1 and Arr3 equal?: "+ check);
    }
}