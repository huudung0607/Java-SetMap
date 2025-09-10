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
            ArrayList<Integer> a = new ArrayList<>();
            for(var i : se){
                a.add(i);
            }
            System.out.println(se.size());
            System.out.println(a.get(se.size() - 1) + " " + a.get(0));
            System.out.println(a.get(se.size() - 2) + " " + a.get(1));
        }
    }
