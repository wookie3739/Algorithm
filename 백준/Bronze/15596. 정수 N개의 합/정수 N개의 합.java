
public class Test {
    public static long sum(int[] a){
        long sum = 0;
        int n = a.length;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }

        return sum;
    }
}
