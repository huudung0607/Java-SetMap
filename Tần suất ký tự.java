import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeMap<Character,Integer> mp = new TreeMap<>();
        for(int i = 0 ;i < n;i++){
            char c = sc.next().charAt(0);
            mp.put(c,mp.getOrDefault(c,0) + 1);
        }
        System.out.println(mp.firstKey() + " " + mp.get(mp.firstKey()));
        System.out.println();
        System.out.println(mp.lastKey() + " " + mp.get(mp.lastKey()));
        System.out.println();
        for(Map.Entry<Character,Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println();
        for(Map.Entry<Character,Integer> i : mp.descendingMap().entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
