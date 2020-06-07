import java.util.ArrayList;
import java.util.HashMap;

public class hashmp {
    public static void hm1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 100);
        map.put("america", 2000);
        map.put("pak", 10);
        map.put("SA", 150);
        map.put("UK", 2500);
        map.put("NL", 300);

        System.out.println(map);

    }

    public static void hm2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : map.keySet())
            System.out.println(ch + "->" + map.get(ch));

    }

    public static void hm3(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, new ArrayList<>());

            map.get(ch).add(i);
        }

        for (Character ch : map.keySet())
            System.out.println(ch + "->" + map.get(ch));

    }

    public static void main(String[] args) {
        hm1();
        hm2("abcccddeefffgggghhh");
        hm3("ababbaccddefghe");

    }

}