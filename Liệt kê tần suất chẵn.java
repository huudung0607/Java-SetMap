    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = sc.nextInt();
            Map<Integer,Integer> mp = new HashMap<>();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0;i < n;i++){
                int x = sc.nextInt();
                mp.put(x,mp.getOrDefault(x,0) + 1);
            }
            for(var i : mp.entrySet()){
                if(mp.get(i.getKey()) % 2 == 0){
                    a.add(i.getKey());
                }
            }
            Collections.sort(a);
            for(int i : a){
                System.out.println(i + " " + mp.get(i));
            }
            System.out.println();
            Collections.reverse(a);
            for(int i : a){
                System.out.println(i + " " + mp.get(i));
            }
        }
    }
