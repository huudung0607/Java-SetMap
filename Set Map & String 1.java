import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        TreeSet<String> se = new TreeSet<>();
        for(int i = 0;i < n;i++){
            String s = sc.next();
            se.add(s);
        }
        System.out.println(se.size());
        for(var i : se){
            System.out.print(i + " ");
        }
    }
}
