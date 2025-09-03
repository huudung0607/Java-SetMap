import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        LinkedHashSet<Integer> se = new LinkedHashSet<>();
        for(int i = 0;i < n ;i++){
            int x = sc.nextInt();
            se.add(x);
        }
        for(int i : se){
            System.out.print(i + " ");
        }
    }
}
