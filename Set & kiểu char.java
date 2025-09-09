    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = sc.nextInt();
            TreeSet<Character> se = new TreeSet<>();
            ArrayList<Character> a = new ArrayList<>();
            for(int i = 0; i < n ;i++){
                char c = sc.next().charAt(0);
                se.add(c);
            }
            System.out.println(se.size());
            for(char c : se){
                System.out.print(c + " ");
                a.add(c);
            }
            System.out.println();
            Collections.reverse(a);
            for(char c : a){
                System.out.print(c + " ");
            }
        }
    }
