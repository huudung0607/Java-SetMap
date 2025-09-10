    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = Integer.parseInt(sc.nextLine());
            TreeMap<String,Integer> mp = new TreeMap<>();
            for(int i = 0 ;i < n;i++){
                String s = sc.nextLine().trim();
                mp.put(s,mp.getOrDefault(s,0) + 1);
            }
            for(var i : mp.entrySet()){
                System.out.println(i.getKey() + " " + i.getValue());
            }
            System.out.println();
            String maxScore = " ";
            String minScore = " ";
            int maxGhiBan = Integer.MIN_VALUE, minGhiBan = Integer.MAX_VALUE;
            for(var i : mp.entrySet()){
                if(i.getValue() < minGhiBan || i.getValue() == minGhiBan && (minScore.compareTo(i.getKey()) < 0)){
                    minGhiBan = i.getValue();
                    minScore = i.getKey();
                }
                if(i.getValue() > maxGhiBan || i.getValue() == maxGhiBan && (maxScore.compareTo(i.getKey()) > 0)){
                    maxGhiBan = i.getValue();
                    maxScore = i.getKey();
                }
            }
            System.out.println(minScore + " " + minGhiBan);
            System.out.println(maxScore + " " + maxGhiBan);
        }
    }
