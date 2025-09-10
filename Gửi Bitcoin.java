    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = Integer.parseInt(sc.nextLine());
            Map<String,String> mp = new HashMap<>();
            for(int i = 0 ; i < n ;i++){
                String name = sc.nextLine().trim();
                String dex = sc.nextLine().trim();
                mp.put(dex,name);
            }
            int t = Integer.parseInt(sc.nextLine());
            for(int i = 0 ; i < t;i++){
                String []tmp = sc.nextLine().trim().split("\\s+");
                String a = tmp[0];
                String b = tmp[1];
                int key = Integer.parseInt(tmp[2]);
                String a1 = mp.getOrDefault(a,"Unknown wallet");
                String b1 = mp.getOrDefault(b,"Unknown wallet");
                System.out.println(a1 + " " + "send " + key + " " + "bitcoin" + " " + "to" +
                        " " + b1);
            }
        }
    }
