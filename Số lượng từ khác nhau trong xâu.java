import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TreeMap<String,Integer> mp = new TreeMap<>();
        while(sc.hasNext()){
            String s =  sc.next();
            mp.put(s,mp.getOrDefault(s,0) + 1);
        }
        System.out.println(mp.size());
        System.out.print(mp.firstKey() + " " + mp.lastKey());
    }
}
