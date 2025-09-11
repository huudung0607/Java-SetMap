import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeMap<String,Integer> mp = new TreeMap<>();
        for(int i = 0; i < n;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            String tmp = x + " " + y;
            mp.put(tmp,mp.getOrDefault(tmp,0) + 1);
        }
        for(var i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
