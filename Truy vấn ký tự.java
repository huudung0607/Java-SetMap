import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        TreeMap<Character,Integer> mp = new TreeMap<>();
        for(int i = 0;i < s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        char maxC = ' ';
        char minC = ' ';
        for(Map.Entry<Character,Integer> i : mp.entrySet()){
            if(i.getValue() > maxFreq){
                maxFreq = i.getValue();
                maxC = i.getKey();
            }
        }
        for(Map.Entry<Character,Integer> i : mp.entrySet()){
            if(i.getValue() <= minFreq){
                minFreq = i.getValue();
                minC = i.getKey();
            }
        }
        System.out.println(maxC + " " + maxFreq);
        System.out.println(minC + " " + minFreq);
        System.out.print(mp.size());
    }
}
