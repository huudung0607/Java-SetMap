    import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = Integer.parseInt(sc.nextLine());
            Map<String,Vector<String>> mp = new HashMap<>();
            for(int i = 0 ;i < n ;i++) {
                String match = sc.nextLine().trim();
                int idx = match.indexOf("-");
                String team1 = match.substring(0, idx - 1).trim();
                String team2 = match.substring(idx + 2).trim();
                mp.putIfAbsent(team1, new Vector<>());
                mp.get(team1).add(team2);
                mp.putIfAbsent(team2, new Vector<>());
                mp.get(team2).add(team1);
            }
            ArrayList<Map.Entry<String,Vector<String>>> list = new ArrayList<>();
            for(Map.Entry<String,Vector<String>> i : mp.entrySet()){
                list.add(i);
            }
            Collections.sort(list, new Comparator<Map.Entry<String, Vector<String>>>() {
                @Override
                public int compare(Map.Entry<String, Vector<String>> o1, Map.Entry<String, Vector<String>> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });
            for(Map.Entry<String,Vector<String>> i : list){
                System.out.print(i.getKey() + " : ");
                Collections.sort(i.getValue());
                for(int j = 0; j < i.getValue().size();j++){
                    System.out.print(i.getValue().get(j));
                    if(j != i.getValue().size() - 1){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
