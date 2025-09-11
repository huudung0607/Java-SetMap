import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        char []a = new char[n];
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.next().charAt(0);
            mp.put(a[i],1);
        }
        for(int i = 0; i < m;i++){
            char c = sc.next().charAt(0);
            if(mp.containsKey(c) &&  mp.get(c) == 1){
                mp.put(c,2);
            }
        }
        for(char i : a){
            if(mp.get(i) == 2){
                System.out.print(i + " ");
                mp.put(i,0);
            }
        }
    }
}
