// good
import java.util.Arrays;
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int largest = a[2];
        int between = a[1];
        int smallest = a[0];
        int place = 0;
        int place2 = 0;

        if (smallest > between){
            place = between;
            place2 = smallest;
            smallest = place;
            between = place2;
        }
        if (smallest > largest){
            place = smallest;
            place2 = largest;
            smallest = place2;
            largest = place;
        }
        if (between > largest){
            place = between;
            place2 = largest;
            between = place2;
            largest = place;
        }
        a[0] = smallest;
        a[1] = between;
        a[2] = largest;
        System.out.println(Arrays.toString(a));
    }
}
