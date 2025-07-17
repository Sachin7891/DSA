import java.util.HashMap;

public class hashMap {
    
    public static void main(String[] args) {
        String input = "hello";
        HashMap<Character , Integer> map = new HashMap<>();{
            for(char ch : input.toCharArray())//tocharArray for change character in array
            {
                if(ch != ' '){
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
            }
            System.out.println(map);
        }
    } 
}
