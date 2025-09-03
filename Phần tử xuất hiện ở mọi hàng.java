import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>(n);
        for(int i = 0; i < n ;i++){
            Vector<Integer> tmp = new Vector<>(n);
            for(int j = 0; j < n; j ++){
                tmp.add(sc.nextInt());
            }
            v.add(tmp);
        }
        int cnt = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(Vector<Integer> tmp : v){
            Set<Integer> se = new HashSet<>();
            for(int i : tmp){
                se.add(i);
            }
            for(int i : se){
                mp.put(i, mp.getOrDefault(i,0) + 1);
            }
        }
        boolean flag = false;
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            if(i.getValue() == n){
                System.out.print(i.getKey() + " ");
                flag = true;
            }
        }
        if(!flag) System.out.print("NOT FOUND");
    }
}
