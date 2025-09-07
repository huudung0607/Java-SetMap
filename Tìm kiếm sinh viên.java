import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Map<String,String> mp = new HashMap<>();
        for(int i= 0; i < n  ;i++){
            String msv = sc.nextLine().trim(), ten = sc.nextLine().trim();
            mp.put(msv,ten);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q;i++){
            String test = sc.nextLine().trim();
            if(mp.containsKey(test)){
                System.out.println(mp.get(test));
            }
            else System.out.println("NOT FOUND");
        }
    }
}
