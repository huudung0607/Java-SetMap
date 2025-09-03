import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeSet<Integer> se = new TreeSet<>();
        for(int i = 0 ;i < n ;i++){
            se.add(sc.nextInt());
        }
        int q =sc.nextInt();
        for(int i = 0; i < q;i++){
            int t = sc.nextInt();
            if(t == 1){
                int x = sc.nextInt();
                se.add(x);
            } else if (t == 2){
                int x = sc.nextInt();
                if(se.contains(x)){
                    se.remove(x);
                }
            } else if(t == 3){
                System.out.println(se.first());
            } else if(t == 4){
                System.out.println(se.last());
            }
        }
    }
}
