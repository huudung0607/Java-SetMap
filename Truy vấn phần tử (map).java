import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n ;i++){
            int x = sc.nextInt();
            mp.put(x,mp.getOrDefault(x,0) + 1);
        }
        int q = sc.nextInt();
        for(int i = 0; i < q;i++){
            int x = sc.nextInt();
            if(mp.containsKey(x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
