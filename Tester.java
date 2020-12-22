import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {

            int[] a = {5, 1, 12, -5, 16};
            Sorts.bubbleSort(a);
            int[] b = {2, 3, 4, 5, 1};
            Sorts.bubbleSort(b);
            int[] c = {6, 1, 2, 3, 4, 5};
            Sorts.bubbleSort(c);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            System.out.println(Arrays.toString(c));

            int[] d = {64, 25, 12, 22, 11};
            Sorts.selectionSort(d);
            System.out.println(Arrays.toString(d));

            int[] e = {64,3,2,10,12,1,5,6};
            Sorts.selectionSort(e);
            System.out.println(Arrays.toString(e));
      }

}
