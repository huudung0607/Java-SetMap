import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Set<Integer> se = new HashSet<>();
        for(int i = 0;i < n ;i++){
            int x = sc.nextInt();
            se.add(x);
        }
        int q = sc.nextInt();
        for(int i = 0; i < q;i++){
            int x = sc.nextInt();
            if(se.contains(x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
