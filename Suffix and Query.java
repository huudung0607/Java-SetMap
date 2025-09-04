import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []F = new int[1000009];
        int []a = new int[n];
        for(int i  = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        HashSet<Integer> se = new HashSet<>();
        for(int i = n - 1; i >= 0 ;i--){
            se.add(a[i]);
            F[i] = se.size();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q;i++){
            int l = sc.nextInt();
            System.out.println(F[l]);
        }
    }
}
