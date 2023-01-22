// TODO: talk to me about this submission... it seems way too similar to danny's (logic, variable names, etc) to believe it was the product of your brain
public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 2, 2};
        int nums = a[0];
        int less = a[0];
        if (nums < a[1]){
            nums = a[1];
        }
        if (nums < a[2]){
            nums = a[2];
        }
        if (less > a[1]){
            less = a[1];
        }
        if (less > a[2]){
            less = a[2];
        }
        System.out.println(nums-less);
    }
}
