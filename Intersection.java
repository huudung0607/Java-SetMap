import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int[n];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();

            mp.put(a[i],1);
        }
        for(int i = 0; i < m;i++){
            int x = sc.nextInt();
            if(mp.containsKey(x) && mp.get(x) == 1){
                mp.put(x,2);
            }
        }
        for(int i = 0; i < n;i++){
            if(mp.get(a[i]) == 2){
                System.out.print(a[i] + " ");
                mp.put(a[i],0);
            }
        }
    }
}
