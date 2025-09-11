import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        HashSet<Integer> se = new HashSet<>();
        for(int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt();
            se.add(b[i]);
        }
        for(int i = 0; i < n;i++){
            if(se.contains(a[i])){
                System.out.print("28tech" + " ");
            }
            else System.out.print("29tech" + " ");
        }
    }
}
