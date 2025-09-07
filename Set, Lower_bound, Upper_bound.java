import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int lowerBound(ArrayList<Integer> a, int l ,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a.get(m) >= x){
                res = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }
    public static int upperBound(ArrayList<Integer> a, int l ,int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a.get(m) <= x){
                res = m;
                l = m + 1;
            }
            else r = m - 1;
        }
        return res;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ;i < n ;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int t = sc.nextInt();
            if(t == 1){
                int x = sc.nextInt();
                a.add(x);
                Collections.sort(a);
            }
            else if(t == 2){
                int x = sc.nextInt();
                if(a.contains(x)){
                    a.remove(Integer.valueOf(x));
                }
            }
            else if(t == 3){
                int x = sc.nextInt();
                int pos = lowerBound(a,0,a.size() - 1,x);
                if(pos != -1) System.out.println(a.get(pos));
                else System.out.println(-1);
            }
            else if(t == 4){
                int x = sc.nextInt();
                int pos = upperBound(a,0,a.size() - 1,x);
                if(pos != -1) System.out.println(a.get(pos));
                else System.out.println(-1);
            }
        }
    }
}
