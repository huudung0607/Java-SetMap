import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Set<HashMap<Integer,Integer>> se = new HashSet<>();
        for(int i = 0;i < n; i++){
            HashMap<Integer,Integer> mp = new HashMap<>();
            int x = sc.nextInt(), y = sc.nextInt();
            mp.put(x,y);
            se.add(mp);
        }
        System.out.print(se.size());
    }
}
