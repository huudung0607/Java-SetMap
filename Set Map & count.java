import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        Map<Integer,Integer>mp = new HashMap<>();
        int []a = new int[n];
        int []b = new int[m];
        for(int i = 0; i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0; i < m;i++){
            b[i] = sc.nextInt();
            mp.put(b[i],mp.getOrDefault(b[i],0) + 1);
        }
        for(int i : a){
            if(mp.get(i) == null){
                mp.put(i,0);
            }
            System.out.print(mp.get(i) + " ");
        }
    }
}
