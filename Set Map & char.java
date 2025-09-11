import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeSet<Character> se = new TreeSet<>();
        for(int i = 0 ; i < n ;i++){
            se.add(sc.next().charAt(0));
        }
        ArrayList<Character> a = new ArrayList<>();
        System.out.println(se.size());
        for(var i : se){
           a.add(i);
        }
        System.out.print(a.get(a.size() -1) + " " + a.get(0) + " " + a.get(a.size() - 2) + " " + a.get(1));
    }
}
