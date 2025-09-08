import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            Map<String,long[]> mp = new HashMap<>();
            while(sc.hasNext()){
                String s = sc.next();
                long tinChi = sc.nextLong();
                long diem = sc.nextLong();
                mp.putIfAbsent(s,new long[2]);
                mp.get(s)[0] += tinChi * diem;
                mp.get(s)[1] += tinChi;
            }
            List<Map.Entry<String,long[]>> list = new ArrayList<>(mp.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, long[]>>() {
                @Override
                public int compare(Map.Entry<String, long[]> o1, Map.Entry<String, long[]> o2) {
                    return o2.getKey().compareTo(o1.getKey());
                }
            });
            for(Map.Entry<String,long[]> s : list){
                double tb = 1.0 * s.getValue()[0]/s.getValue()[1];
                System.out.printf("%s : %.2f\n",s.getKey(),tb);
            }
        }
    }
