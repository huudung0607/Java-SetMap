import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> se = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0 ;i < n; i++){
            se.add(sc.nextInt());
        }
        for(int i = 0 ; i < m ;i++){
            se.add(sc.nextInt());
        }
        for(int i : se){
            System.out.print(i + " ");
        }
    }
}
