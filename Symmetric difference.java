import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],1);
        }
        for(int i = 0; i < m;i++){
            b[i] = sc.nextInt();
            if(mp.containsKey(b[i]) && mp.get(b[i]) == 1){
                mp.put(b[i],2);
            }
        }
        TreeSet<Integer> se = new TreeSet<>();
        for(int i = 0; i < n;i++){
            if(mp.get(a[i]) != 2){
                se.add(a[i]);
            }
        }
        for(int i = 0 ;i < m ;i++){
            mp.put(b[i],1);
        }
        for(int i = 0 ;i < n;i++){
            if(mp.containsKey(a[i]) && mp.get(a[i]) == 1){
                mp.put(a[i],2);
            }
        }
        for(int i : b){
            if(mp.get(i) != 2){
                se.add(i);
            }
        }
        for(int i : se){
            System.out.print(i + " ");
        }
    }
}
